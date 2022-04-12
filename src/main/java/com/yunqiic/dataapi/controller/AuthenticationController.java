package com.yunqiic.dataapi.controller;

import com.github.zhangchunsheng.authentication.bean.result.LoginUrlResult;
import com.yunqiic.dataapi.core.Result;
import com.yunqiic.dataapi.core.ResultGenerator;
import com.yunqiic.dataapi.core.validate.Order;
import com.yunqiic.dataapi.core.validate.Sort;
import com.yunqiic.dataapi.model.ConfigModel;
import com.yunqiic.dataapi.service.JAuthenticationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import me.zhangchunsheng.mangix.common.exception.MangixException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author CodeGenerator
 * @date 2021/09/22.
 */
@RestController
@RequestMapping("/authentication")
@Api(tags="Authentication", value = "Authentication", description = "控制类接口测试")
public class AuthenticationController {
    @Resource
    private JAuthenticationService jAuthenticationService;

    @GetMapping("/getLoginUrl")
    @ApiOperation(value = "getLoginUrl", notes = "LoginUrlResult", httpMethod = "GET")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "loginName", value = "test", paramType = "query", dataType = "String", defaultValue = "test"),
        @ApiImplicitParam(name = "next", value = "/luna/", paramType = "query", dataType = "String", defaultValue = "/luna/")
    })
    public Result<LoginUrlResult> getLoginUrl(String loginName, String next) {
        LoginUrlResult result;
        try {
            result = jAuthenticationService.getLoginUrl(loginName, next);
        } catch(Exception e) {
            result = null;
        }

        return ResultGenerator.genSuccessResult(result);
    }

}
