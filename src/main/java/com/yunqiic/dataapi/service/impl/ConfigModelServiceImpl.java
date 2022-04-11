package com.yunqiic.dataapi.service.impl;

import com.yunqiic.dataapi.dao.cg.ConfigModelMapper;
import com.yunqiic.dataapi.model.ConfigModel;
import com.yunqiic.dataapi.service.ConfigModelService;
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
public class ConfigModelServiceImpl extends AbstractService<ConfigModel> implements ConfigModelService {
    @Resource
    private ConfigModelMapper configModelMapper;

}
