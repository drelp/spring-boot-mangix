package com.yunqiic.dataapi.dao;

import com.yunqiic.dataapi.model.dto.ConfigDataSearch;

import java.util.List;
import java.util.Map;

public interface CustomConfigMapper {
    List<Map> getListByKey(ConfigDataSearch configDataSearch);
}