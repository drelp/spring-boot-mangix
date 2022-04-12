package com.yunqiic.dataapi.service.impl;

import com.github.zhangchunsheng.authentication.bean.result.LoginUrlResult;
import com.github.zhangchunsheng.authentication.service.AuthenticationService;
import com.yunqiic.dataapi.service.JAuthenticationService;
import me.zhangchunsheng.mangix.common.exception.MangixException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JAuthenticationServiceImpl implements JAuthenticationService {
    @Autowired
    private AuthenticationService authenticationService;

    @Override
    public LoginUrlResult getLoginUrl(String loginName, String next) throws MangixException {
        LoginUrlResult result = this.authenticationService.getLoginUrl(loginName, next);
        return result;
    }
}
