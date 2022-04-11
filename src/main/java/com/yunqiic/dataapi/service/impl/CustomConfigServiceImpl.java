package com.yunqiic.dataapi.service.impl;

import com.yunqiic.dataapi.dao.CustomConfigMapper;
import com.yunqiic.dataapi.model.ConfigModel;
import com.yunqiic.dataapi.model.dto.ConfigDataSearch;
import com.yunqiic.dataapi.service.CustomConfigService;
import com.yunqiic.dataapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 * @author CodeGenerator
 * @data 2021/08/24.
 */
@Service
@Transactional
public class CustomConfigServiceImpl extends AbstractService<ConfigModel> implements CustomConfigService {
    @Resource
    private CustomConfigMapper customConfigMapper;

    public List<ConfigModel> getListByKey(String key, Integer page, Integer limitNum, String sort, String orderStr) {
        ConfigDataSearch configDataSearch = new ConfigDataSearch();
        ConfigDataSearch.Where where = new ConfigDataSearch.Where();
        where.setKey(key);
        configDataSearch.setWhere(where);

        ConfigDataSearch.Order order = new ConfigDataSearch.Order();
        order.setOrderStr(sort + " " + orderStr);// package_time asc
        configDataSearch.setOrder(order);

        ConfigDataSearch.Limit limit = new ConfigDataSearch.Limit();
        if(page <= 0) {
            page = 1;
        }
        Integer startNum = (page - 1) * limitNum;
        limit.setLimitStr(startNum + "," + limitNum);
        configDataSearch.setLimit(limit);
        List<Map> configListMap = customConfigMapper.getListByKey(configDataSearch);

        List<ConfigModel> customConfigList = new ArrayList<>();
        ConfigModel customConfig;
        for(int i = 0 ; i < configListMap.size() ; i++) {
            customConfig = new ConfigModel();

            customConfig.setKey(configListMap.get(i).get("key").toString());

            customConfigList.add(customConfig);
        }
        return customConfigList;
    }
}
