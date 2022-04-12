package com.yunqiic.dataapi.service;

import com.github.zhangchunsheng.authentication.bean.result.LoginUrlResult;

public interface AuthenticationService {
    public LoginUrlResult getLoginUrl(String loginName, String next);
}
