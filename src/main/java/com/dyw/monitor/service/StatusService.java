package com.dyw.monitor.service;

import com.dyw.monitor.HCNetSDK;
import com.dyw.monitor.controller.EgciController;
import com.dyw.monitor.entity.StatusEntity;
import com.sun.jna.NativeLong;
import com.sun.jna.ptr.IntByReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class StatusService {
    private Logger logger = LoggerFactory.getLogger(StatusService.class);


    /*
     * 获取设备状态
     * */
    public StatusEntity getWorkStatus(NativeLong iUserID) {
        HCNetSDK.NET_DVR_ACS_WORK_STATUS_V50 struAcsWorkStatusCfg = new HCNetSDK.NET_DVR_ACS_WORK_STATUS_V50();
        struAcsWorkStatusCfg.dwSize = struAcsWorkStatusCfg.size();
        IntByReference pInt = new IntByReference(struAcsWorkStatusCfg.size());
        NativeLong iChannel = new NativeLong(0xFFFFFFFF);
        struAcsWorkStatusCfg.write();
        StatusEntity statusEntity = new StatusEntity();
        if (!EgciController.hcNetSDK.NET_DVR_GetDVRConfig(iUserID, HCNetSDK.NET_DVR_GET_ACS_WORK_STATUS_V50, iChannel, struAcsWorkStatusCfg.getPointer(), struAcsWorkStatusCfg.size(), pInt)) {
            logger.info("NET_DVR_GET_ACS_WORK_STATUS_V50 failed with:" + EgciController.hcNetSDK.NET_DVR_GetLastError() + EgciController.hcNetSDK.NET_DVR_GetErrorMsg(struAcsWorkStatusCfg.getPointer()));
//            statusEntity.setIsFace("0");
//            statusEntity.setIsCardAndFace("0");
            statusEntity.setPassMode("0");
            statusEntity.setCardNumber("0");
        } else {
            struAcsWorkStatusCfg.read();
            statusEntity.setCardNumber(struAcsWorkStatusCfg.dwCardNum + "");
            if (String.valueOf(struAcsWorkStatusCfg.byCardReaderVerifyMode[0]).equals("13")) {
                statusEntity.setPassMode("0");
            } else {
                statusEntity.setPassMode("1");
            }
        }
        return statusEntity;
    }
}
