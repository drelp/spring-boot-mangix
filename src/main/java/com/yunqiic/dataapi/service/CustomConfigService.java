package com.yunqiic.dataapi.service;

import com.yunqiic.dataapi.core.Service;
import com.yunqiic.dataapi.model.ConfigModel;

import java.util.List;


/**
 * @author CodeGenerator
 * @data 2021/08/24.
 */
public interface CustomConfigService extends Service<ConfigModel> {
    public List<ConfigModel> getListByKey(String key, Integer page, Integer limitNum, String sort, String orderStr);
}
