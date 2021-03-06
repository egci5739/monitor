package com.dyw.monitor.entity;

import org.springframework.stereotype.Component;

@Component
public class ConfigEntity {
    //一体机通用配置
    private short devicePort;//设备端口
    private String deviceName;//设备账号
    private String devicePass;//设备密码
    //数据库配置
    private String dataBaseIp;//数据库ip
    private short dataBasePort;//数据库端口
    private String dataBaseName;//数据库账号
    private String dataBasePass;//数据库密码
    private String dataBaseLib;//数据库名称
    private long dataBaseTime;//数据库查询间隔，避免同时大量查询
    //队列配置
    private String queueIp;//队列ip
    //办证端端口
    private short socketRegisterPort;
    //监控端端口
    private short socketMonitorPort;
    //同步配置
    private String synchronization;//0：不开启，1：开启单台，2：代表全部开启
    private int synchronizationHour;//几点同步
    private int synchronizationMinute;//几分同步
    private int synchronizationSecond;//几秒同步
    private long synchronizationTime;//查找全部卡号时，线程暂停时间
    //OnGuard配置
    private String onGuardIp;
    private short onGuardPort;
    //报警回调函数暂停时间
    private long alarmTime;
    //服务端推送消息到客户端的延迟时间
    private long pushTime;
    //报警回调函数延迟时间
    private long callBackTime;
    //NTP服务器ip
    private String ntpServerIp;
    //服务器IP
    private String socketIp;
    //脸谱服务器ip和端口
    private String faceServerIp;
    private short faceServerPort;
    //nvr服务器IP和端口
    private String nvrServerIp;
    private short nvrServerPort;

    public short getDevicePort() {
        return devicePort;
    }

    public void setDevicePort(short devicePort) {
        this.devicePort = devicePort;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDevicePass() {
        return devicePass;
    }

    public void setDevicePass(String devicePass) {
        this.devicePass = devicePass;
    }

    public String getDataBaseIp() {
        return dataBaseIp;
    }

    public void setDataBaseIp(String dataBaseIp) {
        this.dataBaseIp = dataBaseIp;
    }

    public short getDataBasePort() {
        return dataBasePort;
    }

    public void setDataBasePort(short dataBasePort) {
        this.dataBasePort = dataBasePort;
    }

    public String getDataBaseName() {
        return dataBaseName;
    }

    public void setDataBaseName(String dataBaseName) {
        this.dataBaseName = dataBaseName;
    }

    public String getDataBasePass() {
        return dataBasePass;
    }

    public void setDataBasePass(String dataBasePass) {
        this.dataBasePass = dataBasePass;
    }

    public String getDataBaseLib() {
        return dataBaseLib;
    }

    public void setDataBaseLib(String dataBaseLib) {
        this.dataBaseLib = dataBaseLib;
    }

    public long getDataBaseTime() {
        return dataBaseTime;
    }

    public void setDataBaseTime(long dataBaseTime) {
        this.dataBaseTime = dataBaseTime;
    }

    public String getQueueIp() {
        return queueIp;
    }

    public void setQueueIp(String queueIp) {
        this.queueIp = queueIp;
    }

    public short getSocketRegisterPort() {
        return socketRegisterPort;
    }

    public void setSocketRegisterPort(short socketRegisterPort) {
        this.socketRegisterPort = socketRegisterPort;
    }

    public short getSocketMonitorPort() {
        return socketMonitorPort;
    }

    public void setSocketMonitorPort(short socketMonitorPort) {
        this.socketMonitorPort = socketMonitorPort;
    }

    public String getSynchronization() {
        return synchronization;
    }

    public void setSynchronization(String synchronization) {
        this.synchronization = synchronization;
    }

    public int getSynchronizationHour() {
        return synchronizationHour;
    }

    public void setSynchronizationHour(int synchronizationHour) {
        this.synchronizationHour = synchronizationHour;
    }

    public int getSynchronizationMinute() {
        return synchronizationMinute;
    }

    public void setSynchronizationMinute(int synchronizationMinute) {
        this.synchronizationMinute = synchronizationMinute;
    }

    public int getSynchronizationSecond() {
        return synchronizationSecond;
    }

    public void setSynchronizationSecond(int synchronizationSecond) {
        this.synchronizationSecond = synchronizationSecond;
    }

    public long getSynchronizationTime() {
        return synchronizationTime;
    }

    public void setSynchronizationTime(long synchronizationTime) {
        this.synchronizationTime = synchronizationTime;
    }

    public String getOnGuardIp() {
        return onGuardIp;
    }

    public void setOnGuardIp(String onGuardIp) {
        this.onGuardIp = onGuardIp;
    }

    public short getOnGuardPort() {
        return onGuardPort;
    }

    public void setOnGuardPort(short onGuardPort) {
        this.onGuardPort = onGuardPort;
    }

    public long getAlarmTime() {
        return alarmTime;
    }

    public void setAlarmTime(long alarmTime) {
        this.alarmTime = alarmTime;
    }

    public long getPushTime() {
        return pushTime;
    }

    public void setPushTime(long pushTime) {
        this.pushTime = pushTime;
    }

    public long getCallBackTime() {
        return callBackTime;
    }

    public void setCallBackTime(long callBackTime) {
        this.callBackTime = callBackTime;
    }

    public String getNtpServerIp() {
        return ntpServerIp;
    }

    public void setNtpServerIp(String ntpServerIp) {
        this.ntpServerIp = ntpServerIp;
    }

    public String getFaceServerIp() {
        return faceServerIp;
    }

    public void setFaceServerIp(String faceServerIp) {
        this.faceServerIp = faceServerIp;
    }

    public short getFaceServerPort() {
        return faceServerPort;
    }

    public void setFaceServerPort(short faceServerPort) {
        this.faceServerPort = faceServerPort;
    }

    public String getNvrServerIp() {
        return nvrServerIp;
    }

    public void setNvrServerIp(String nvrServerIp) {
        this.nvrServerIp = nvrServerIp;
    }

    public short getNvrServerPort() {
        return nvrServerPort;
    }

    public void setNvrServerPort(short nvrServerPort) {
        this.nvrServerPort = nvrServerPort;
    }

    public String getSocketIp() {
        return socketIp;
    }

    public void setSocketIp(String socketIp) {
        this.socketIp = socketIp;
    }

    @Override
    public String toString() {
        return "ConfigEntity{" +
                "devicePort=" + devicePort +
                ", deviceName='" + deviceName + '\'' +
                ", devicePass='" + devicePass + '\'' +
                ", dataBaseIp='" + dataBaseIp + '\'' +
                ", dataBasePort=" + dataBasePort +
                ", dataBaseName='" + dataBaseName + '\'' +
                ", dataBasePass='" + dataBasePass + '\'' +
                ", dataBaseLib='" + dataBaseLib + '\'' +
                ", dataBaseTime=" + dataBaseTime +
                ", queueIp='" + queueIp + '\'' +
                ", socketRegisterPort=" + socketRegisterPort +
                ", socketMonitorPort=" + socketMonitorPort +
                ", synchronization='" + synchronization + '\'' +
                ", synchronizationHour=" + synchronizationHour +
                ", synchronizationMinute=" + synchronizationMinute +
                ", synchronizationSecond=" + synchronizationSecond +
                ", synchronizationTime=" + synchronizationTime +
                ", onGuardIp='" + onGuardIp + '\'' +
                ", onGuardPort=" + onGuardPort +
                ", alarmTime=" + alarmTime +
                ", pushTime=" + pushTime +
                ", callBackTime=" + callBackTime +
                ", ntpServerIp='" + ntpServerIp + '\'' +
                ", socketIp='" + socketIp + '\'' +
                ", faceServerIp='" + faceServerIp + '\'' +
                ", faceServerPort=" + faceServerPort +
                ", nvrServerIp='" + nvrServerIp + '\'' +
                ", nvrServerPort=" + nvrServerPort +
                '}';
    }
}
