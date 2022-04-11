package com.yunqiic.dataapi.controller;

import com.yunqiic.dataapi.core.Result;
import com.yunqiic.dataapi.core.ResultGenerator;
import com.yunqiic.dataapi.model.second.Config;
import com.yunqiic.dataapi.service.ConfigService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author CodeGenerator
 * @date 2022/04/11.
 */
@RestController
@RequestMapping("/config")
@Api(value = "Config控制类", description = "控制类接口测试")
public class ConfigController {
    @Resource
    private ConfigService configService;

    @GetMapping
    @ApiOperation(value = "获取全部",notes = "返回分页过后的数据",httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page",value = "查询页码", paramType = "query",dataType = "Integer",defaultValue = "0"),
            @ApiImplicitParam(name = "size",value = "每页数据量", paramType = "query",dataType = "Integer",defaultValue = "0")
    })
    public Result <PageInfo<Config>> list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Config> list = configService.findAll();
        PageInfo<Config> pageInfo = new PageInfo<>(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
    @PostMapping
    @ApiOperation(value = "添加数据",notes = "添加新的数据",httpMethod = "POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "config",value = "待添加的config实例",paramType = "body",dataType = "Config",required = true)
    })
    public Result add(@RequestBody Config config) {
        configService.save(config);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除数据",notes = "根据id删除数据",httpMethod = "DELETE")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "查询的id", paramType = "path",required = true,dataType = "Integer"),
    })
    public Result delete(@PathVariable Integer id) {
        configService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    @ApiOperation(value = "更新数据",notes = "根据内容更新数据",httpMethod = "PUT")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "config",value = "更新的config实例",paramType = "body",dataType = "Config",required = true)
    })
    public Result update(@RequestBody Config config) {
        configService.update(config);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "获取单个值",notes = "查看单个项目的内容",httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "查询的id", paramType = "path",required = true,dataType = "Integer",defaultValue = "0")
    })
    public Result detail(@PathVariable Integer id) {
        Config config = configService.findById(id);
        return ResultGenerator.genSuccessResult(config);
    }


}
