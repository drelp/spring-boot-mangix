package com.yunqiic.dataapi.controller;

import com.yunqiic.dataapi.core.Result;
import com.yunqiic.dataapi.core.ResultGenerator;
import com.yunqiic.dataapi.core.validate.Order;
import com.yunqiic.dataapi.core.validate.Sort;
import com.yunqiic.dataapi.model.ConfigModel;
import com.yunqiic.dataapi.service.CustomConfigService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author CodeGenerator
 * @date 2021/09/22.
 */
@RestController
@RequestMapping("/c-config")
@Api(tags="Config", value = "Config", description = "控制类接口测试")
public class CustomConfigController {
    @Resource
    private CustomConfigService customConfigService;

    @GetMapping("/getListByKey")
    @ApiOperation(value = "根据key获取", notes = "返回分页过后的数据", httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "key", value = "key", paramType = "query", dataType = "String", defaultValue = "10"),
            @ApiImplicitParam(name = "page", value = "查询页码", paramType = "query", dataType = "Integer", defaultValue = "0"),
            @ApiImplicitParam(name = "limit", value = "每页数据量", paramType = "query", dataType = "Integer", defaultValue = "10"),
            @ApiImplicitParam(name = "sort", value = "排序字段", paramType = "query", dataType = "String", defaultValue = "key"),
            @ApiImplicitParam(name = "order", value = "排序方式", paramType = "query", dataType = "String", defaultValue = "asc")
    })
    public Result<List<ConfigModel>> getListByKey(
            String key,
            @RequestParam(defaultValue = "1") Integer page,
            @RequestParam(defaultValue = "10") Integer limit,
            @Sort @RequestParam(defaultValue = "package_time") String sort,
            @Order @RequestParam(defaultValue = "asc") String order) {
        List<ConfigModel> list = customConfigService.getListByKey(key, page, limit, sort, order);
        return ResultGenerator.genSuccessResult(list);
    }

}
