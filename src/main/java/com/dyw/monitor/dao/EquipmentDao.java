package com.dyw.monitor.dao;

import com.dyw.monitor.entity.EquipmentEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface EquipmentDao {
    List<EquipmentEntity> getAllEquipment();
}
