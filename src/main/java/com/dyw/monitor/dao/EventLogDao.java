package com.dyw.monitor.dao;

import com.dyw.monitor.entity.EventLogEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface EventLogDao {
    void addEventLog(EventLogEntity eventLogEntity);
}
