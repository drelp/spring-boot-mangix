package com.yunqiic.dataapi.service.impl;

import com.yunqiic.dataapi.dao.TestMapper;
import com.yunqiic.dataapi.model.Test;
import com.yunqiic.dataapi.service.TestService;
import com.yunqiic.dataapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * @author CodeGenerator
 * @data 2021/08/24.
 */
@Service
@Transactional
public class TestServiceImpl extends AbstractService<Test> implements TestService {
    @Resource
    private TestMapper testMapper;

}
