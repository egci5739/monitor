package com.dyw.monitor.handler;

import com.dyw.monitor.HCNetSDK;
import com.sun.jna.Pointer;

public class FaceSendHandler implements HCNetSDK.FRemoteConfigCallback {

    @Override
    public void invoke(int dwType, Pointer lpBuffer, int dwBufLen, Pointer pUserData) {

    }
}
