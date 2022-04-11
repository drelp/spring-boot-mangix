package com.yunqiic.dataapi.dao;

import com.yunqiic.dataapi.core.Mapper;
import com.yunqiic.dataapi.db.domain.Config;
import com.yunqiic.dataapi.model.dto.ConfigDataSearch;

import java.util.List;
import java.util.Map;

public interface CustomConfigMapper extends Mapper<Config> {
    List<Map> getListByKey(ConfigDataSearch configDataSearch);
}