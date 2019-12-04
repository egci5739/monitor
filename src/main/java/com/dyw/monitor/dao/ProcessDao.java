package com.dyw.monitor.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface ProcessDao {
    void setProcessId(@Param("id") int id);

    void setMonitorStatus();
}
