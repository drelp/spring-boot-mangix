package com.yunqiic.dataapi.service;

import com.yunqiic.dataapi.db.domain.Config;
import com.yunqiic.dataapi.core.Service;

import java.util.List;


/**
 * @author CodeGenerator
 * @data 2021/08/24.
 */
public interface CustomConfigService extends Service<Config> {
    public List<Config> getListByKey(String key, Integer page, Integer limitNum, String sort, String orderStr);
}
