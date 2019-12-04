package com.dyw.monitor.dao;

import com.dyw.monitor.entity.StaffEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface StaffDao {
    List<StaffEntity> getSingleStaff(@Param("staffCardNumber") String staffCardNumber);

    List<StaffEntity> getAllStaff();

    List<StaffEntity> getStaffByCard(List<String> staffCardNumber);

    List<String> getAllStaffCard();
}
