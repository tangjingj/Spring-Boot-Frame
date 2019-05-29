package com.example.demo.model;

import java.math.BigDecimal;
import java.util.Date;

public class Device {
    private Integer id;

    private Integer parentId;

    private Integer agentId;

    private Integer standId;

    private Integer categoryId;

    private String deviceName;

    private String aliDeviceId;

    private String aliDeviceSecret;

    private String deviceQrCode;

    private String deviceQrImg;

    private Boolean operatorStatus;

    private Boolean deviceStatus;

    private Boolean onlineStatus;

    private Integer currentOrder;

    private Integer currentUser;

    private Integer lastOrder;

    private BigDecimal lng;

    private BigDecimal lat;

    private Integer orderCount;

    private Integer serviceCount;

    private Boolean isDel;

    private Date createdAt;

    private Date updatedAt;

    private Date statustime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public Integer getStandId() {
        return standId;
    }

    public void setStandId(Integer standId) {
        this.standId = standId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getAliDeviceId() {
        return aliDeviceId;
    }

    public void setAliDeviceId(String aliDeviceId) {
        this.aliDeviceId = aliDeviceId;
    }

    public String getAliDeviceSecret() {
        return aliDeviceSecret;
    }

    public void setAliDeviceSecret(String aliDeviceSecret) {
        this.aliDeviceSecret = aliDeviceSecret;
    }

    public String getDeviceQrCode() {
        return deviceQrCode;
    }

    public void setDeviceQrCode(String deviceQrCode) {
        this.deviceQrCode = deviceQrCode;
    }

    public String getDeviceQrImg() {
        return deviceQrImg;
    }

    public void setDeviceQrImg(String deviceQrImg) {
        this.deviceQrImg = deviceQrImg;
    }

    public Boolean getOperatorStatus() {
        return operatorStatus;
    }

    public void setOperatorStatus(Boolean operatorStatus) {
        this.operatorStatus = operatorStatus;
    }

    public Boolean getDeviceStatus() {
        return deviceStatus;
    }

    public void setDeviceStatus(Boolean deviceStatus) {
        this.deviceStatus = deviceStatus;
    }

    public Boolean getOnlineStatus() {
        return onlineStatus;
    }

    public void setOnlineStatus(Boolean onlineStatus) {
        this.onlineStatus = onlineStatus;
    }

    public Integer getCurrentOrder() {
        return currentOrder;
    }

    public void setCurrentOrder(Integer currentOrder) {
        this.currentOrder = currentOrder;
    }

    public Integer getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(Integer currentUser) {
        this.currentUser = currentUser;
    }

    public Integer getLastOrder() {
        return lastOrder;
    }

    public void setLastOrder(Integer lastOrder) {
        this.lastOrder = lastOrder;
    }

    public BigDecimal getLng() {
        return lng;
    }

    public void setLng(BigDecimal lng) {
        this.lng = lng;
    }

    public BigDecimal getLat() {
        return lat;
    }

    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }

    public Integer getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    public Integer getServiceCount() {
        return serviceCount;
    }

    public void setServiceCount(Integer serviceCount) {
        this.serviceCount = serviceCount;
    }

    public Boolean getIsDel() {
        return isDel;
    }

    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getStatustime() {
        return statustime;
    }

    public void setStatustime(Date statustime) {
        this.statustime = statustime;
    }
}