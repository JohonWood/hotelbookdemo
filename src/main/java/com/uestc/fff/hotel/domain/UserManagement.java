package com.uestc.fff.hotel.domain;

import java.util.Date;

public class UserManagement {

    private String orderId;
    private String userId;
    private String hotelId;
    private String roomid;
    private Date createTime;
    private Float orderTotalFee;
    private Date checkinTime;
    private Integer customNum;
    private String userName;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public String getRoomid() {
        return roomid;
    }

    public void setRoomid(String roomid) {
        this.roomid = roomid;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Float getOrderTotalFee() {
        return orderTotalFee;
    }

    public void setOrderTotalFee(Float orderTotalFee) {
        this.orderTotalFee = orderTotalFee;
    }

    public Date getCheckinTime() {
        return checkinTime;
    }

    public void setCheckinTime(Date checkinTime) {
        this.checkinTime = checkinTime;
    }

    public Integer getCustomNum() {
        return customNum;
    }

    public void setCustomNum(Integer customNum) {
        this.customNum = customNum;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
