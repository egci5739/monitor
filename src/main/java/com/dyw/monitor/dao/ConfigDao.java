package com.dyw.monitor.dao;

import com.dyw.monitor.entity.ConfigTableEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface ConfigDao {
    List<ConfigTableEntity> getConfig();
}
