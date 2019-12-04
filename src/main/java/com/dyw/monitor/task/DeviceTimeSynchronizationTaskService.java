package com.dyw.monitor.task;

import com.dyw.monitor.service.NTPTimeSynchronizationService;

import java.util.TimerTask;

public class DeviceTimeSynchronizationTaskService extends TimerTask {
    private NTPTimeSynchronizationService ntpTimeSynchronizationService = new NTPTimeSynchronizationService();

    @Override
    public void run() {
        ntpTimeSynchronizationService.setTime();
    }
}
