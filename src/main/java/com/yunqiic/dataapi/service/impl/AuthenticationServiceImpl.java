package com.yunqiic.dataapi.service.impl;

import com.github.zhangchunsheng.authentication.bean.result.LoginUrlResult;
import com.yunqiic.dataapi.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;

public class AuthenticationServiceImpl implements AuthenticationService {
    @Autowired
    private AuthenticationService authenticationService;

    @Override
    public LoginUrlResult getLoginUrl(String loginName, String next) {
        LoginUrlResult result = this.authenticationService.getLoginUrl(loginName, next);
        return result;
    }
}
