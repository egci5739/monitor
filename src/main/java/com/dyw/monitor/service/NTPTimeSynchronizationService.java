package com.dyw.monitor.service;


import com.dyw.monitor.HCNetSDK;
import com.dyw.monitor.controller.EgciController;
import com.dyw.monitor.entity.EquipmentEntity;
import com.sun.jna.NativeLong;
import org.apache.commons.net.ntp.NTPUDPClient;
import org.apache.commons.net.ntp.TimeInfo;
import org.apache.commons.net.ntp.TimeStamp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetAddress;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NTPTimeSynchronizationService {

    private Logger logger = LoggerFactory.getLogger(NTPTimeSynchronizationService.class);

    /*
     * 设置时间
     * */
    public void setTime() {
        HCNetSDK.NET_DVR_TIME struNTPTime = getNTPTime();
        struNTPTime.write();
        for (EquipmentEntity equipmentEntity : EgciController.equipmentEntitySetOnline) {
            try {
                if (equipmentEntity.getEquipmentType() == 1) {
                    LoginService loginService = new LoginService();
                    loginService.login(equipmentEntity.getEquipmentIp(), EgciController.configEntity.getDevicePort(), EgciController.configEntity.getDeviceName(), EgciController.configEntity.getDevicePass());
                    if (!EgciController.hcNetSDK.NET_DVR_SetDVRConfig(loginService.getlUserID(), HCNetSDK.NET_DVR_SET_TIMECFG, new NativeLong(1), struNTPTime.getPointer(), struNTPTime.size())) {
                        logger.info("同步时间失败，错误码：" + EgciController.hcNetSDK.NET_DVR_GetLastError());
                        loginService.logout();
                    } else {
                        logger.info("同步时间成功");
                        loginService.logout();
                    }
                }
            } catch (Exception e) {
                logger.error("同步时间出错", e);
            }
        }
    }

    /*
     * 获取NTP时间
     * */
    private HCNetSDK.NET_DVR_TIME getNTPTime() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        HCNetSDK.NET_DVR_TIME struNTPTime;
        try {
            NTPUDPClient timeClient = new NTPUDPClient();
            timeClient.setDefaultTimeout(3000);
            timeClient.open();
//            String NTPServerIp = Egci.configEntity.getNtpServerIp();
            String NTPServerIp = EgciController.configEntity.getNtpServerIp();
            logger.info(EgciController.configEntity.getNtpServerIp());
            InetAddress timeServerAddress = InetAddress.getByName(NTPServerIp);
            TimeInfo timeInfo = timeClient.getTime(timeServerAddress);
            TimeStamp timeStamp = timeInfo.getMessage().getTransmitTimeStamp();
            Date date = timeStamp.getDate();
            logger.info(dateFormat.format(date));
            struNTPTime = segmentationTime(dateFormat.format(date));
        } catch (Exception e) {
            struNTPTime = segmentationTime(dateFormat.format(new Date()));
            logger.info("同步成功");
        }
        return struNTPTime;
    }

    /*
     * 分割时间数据
     * */
    private HCNetSDK.NET_DVR_TIME segmentationTime(String timeInfo) {
        logger.info("时间：" + timeInfo);
        HCNetSDK.NET_DVR_TIME struNTPTime = new HCNetSDK.NET_DVR_TIME();
        //2019-05-22 04:47:54
        struNTPTime.dwYear = Integer.parseInt(timeInfo.substring(0, 4));
        struNTPTime.dwMonth = Integer.parseInt(timeInfo.substring(5, 7));
        struNTPTime.dwDay = Integer.parseInt(timeInfo.substring(8, 10));
        struNTPTime.dwHour = Integer.parseInt(timeInfo.substring(11, 13));
        struNTPTime.dwMinute = Integer.parseInt(timeInfo.substring(14, 16));
        struNTPTime.dwSecond = Integer.parseInt(timeInfo.substring(17, 19));
        return struNTPTime;
    }
}
