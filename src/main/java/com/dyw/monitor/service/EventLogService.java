package com.dyw.monitor.service;

import com.dyw.monitor.dao.EventLogDao;
import com.dyw.monitor.entity.EventLogEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventLogService {
    @Autowired
    private EventLogDao eventLogDao;

    public void addEventLog(EventLogEntity eventLogEntity) {
        eventLogDao.addEventLog(eventLogEntity);
    }
}
