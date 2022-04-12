package com.yunqiic.dataapi.jumpserver.config;

import com.github.zhangchunsheng.authentication.service.AuthenticationService;
import com.github.zhangchunsheng.authentication.service.impl.AuthenticationServiceImpl;
import me.zhangchunsheng.mangix.common.config.MangixConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AutoConfiguration {
    @Autowired
    private Properties properties;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Bean
    public MangixConfig mangixConfig() {
        MangixConfig mangixConfig = new MangixConfig();
        mangixConfig.setPrivateToken(properties.getPrivateToken());
        mangixConfig.setBaseUrl(properties.getBaseUrl());
        return mangixConfig;
    }


    @Bean
    public AuthenticationService authenticationService(MangixConfig mangixConfig) {
        AuthenticationService authenticationService = new AuthenticationServiceImpl();
        authenticationService.setConfig(mangixConfig);
        return authenticationService;
    }
}
