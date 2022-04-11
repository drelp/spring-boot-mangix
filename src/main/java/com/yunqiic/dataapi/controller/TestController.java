package com.yunqiic.dataapi.controller;

import com.yunqiic.dataapi.core.Result;
import com.yunqiic.dataapi.core.ResultGenerator;
import com.yunqiic.dataapi.model.Test;
import com.yunqiic.dataapi.service.TestService;
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
 * @data 2021/08/24.
 */
@RestController
@RequestMapping("/test")
@Api(value = "Test控制类", description = "控制类接口测试")
public class TestController {
    @Resource
    private TestService testService;

    @GetMapping
    @ApiOperation(value = "获取全部", notes = "返回分页过后的数据", httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page", value = "查询页码", paramType = "query", dataType = "Integer", defaultValue = "0"),
            @ApiImplicitParam(name = "size", value = "每页数据量", paramType = "query", dataType = "Integer", defaultValue = "10")
    })
    public Result<PageInfo<Test>> list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "10") Integer size) {
        PageHelper.startPage(page, size);
        List<Test> list = testService.findAll();
        PageInfo<Test> pageInfo = new PageInfo<>(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    @PostMapping
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "test", value = "待添加的test实例", paramType = "body", dataType = "Test", required = true)
    })
    public Result add(@RequestBody Test test) {
        testService.save(test);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "DELETE")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "查询的id", paramType = "path", required = true, dataType = "Integer"),
    })
    public Result delete(@PathVariable Integer id) {
        testService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "PUT")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "test", value = "更新的test实例", paramType = "body", dataType = "Test", required = true)
    })
    public Result update(@RequestBody Test test) {
        testService.update(test);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "获取单个值", notes = "查看单个项目的内容", httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "查询的id", paramType = "path", required = true, dataType = "Integer", defaultValue = "0")
    })
    public Result detail(@PathVariable Integer id) {
        Test test = testService.findById(id);
        return ResultGenerator.genSuccessResult(test);
    }


}
