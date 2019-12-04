package com.dyw.monitor.dao;

import com.dyw.monitor.entity.AlarmEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface AlarmDao {
    void addAlarm(AlarmEntity alarmEntity);
}
