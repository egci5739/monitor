package com.dyw.monitor.service;


import com.dyw.monitor.HCNetSDK;

public class BaseService {
    public BaseService() {
        if (!HCNetSDK.INSTANCE.NET_DVR_Init()) {
            return;
        }
    }
}
