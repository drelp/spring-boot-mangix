package com.yunqiic.dataapi.service;

import com.github.zhangchunsheng.authentication.bean.result.LoginUrlResult;
import me.zhangchunsheng.mangix.common.exception.MangixException;

public interface JAuthenticationService {
    public LoginUrlResult getLoginUrl(String loginName, String next) throws MangixException;
}
