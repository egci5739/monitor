package com.dyw.monitor.dao;

import com.dyw.monitor.entity.PassRecordEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface PassRecordDao {
    void insertAlarm(PassRecordEntity passRecordEntity);
}
