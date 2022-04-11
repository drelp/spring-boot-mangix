package com.yunqiic.dataapi.service.impl;

import com.yunqiic.dataapi.dao.second.ConfigMapper;
import com.yunqiic.dataapi.model.second.Config;
import com.yunqiic.dataapi.service.ConfigService;
import com.yunqiic.dataapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * @author CodeGenerator
 * @date 2022/04/11.
 */
@Service
@Transactional
public class ConfigServiceImpl extends AbstractService<Config> implements ConfigService {
    @Resource
    private ConfigMapper configMapper;

}
