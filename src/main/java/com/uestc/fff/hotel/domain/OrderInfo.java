package com.uestc.fff.hotel.domain;

import java.util.Date;

public class OrderInfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.Order_ID
     *
     * @mbg.generated Sun Aug 04 09:25:55 GMT+08:00 2019
     */
    private String orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.User_ID
     *
     * @mbg.generated Sun Aug 04 09:25:55 GMT+08:00 2019
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.Hotel_id
     *
     * @mbg.generated Sun Aug 04 09:25:55 GMT+08:00 2019
     */
    private String hotelId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.Room_Num
     *
     * @mbg.generated Sun Aug 04 09:25:55 GMT+08:00 2019
     */
    private Integer roomNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.Create_time
     *
     * @mbg.generated Sun Aug 04 09:25:55 GMT+08:00 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.Order_total_fee
     *
     * @mbg.generated Sun Aug 04 09:25:55 GMT+08:00 2019
     */
    private Float orderTotalFee;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.Checkin_time
     *
     * @mbg.generated Sun Aug 04 09:25:55 GMT+08:00 2019
     */
    private Date checkinTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.custom_num
     *
     * @mbg.generated Sun Aug 04 09:25:55 GMT+08:00 2019
     */
    private Integer customNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.days
     *
     * @mbg.generated Sun Aug 04 09:25:55 GMT+08:00 2019
     */
    private Integer days;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.Order_ID
     *
     * @return the value of order_info.Order_ID
     *
     * @mbg.generated Sun Aug 04 09:25:55 GMT+08:00 2019
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.Order_ID
     *
     * @param orderId the value for order_info.Order_ID
     *
     * @mbg.generated Sun Aug 04 09:25:55 GMT+08:00 2019
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.User_ID
     *
     * @return the value of order_info.User_ID
     *
     * @mbg.generated Sun Aug 04 09:25:55 GMT+08:00 2019
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.User_ID
     *
     * @param userId the value for order_info.User_ID
     *
     * @mbg.generated Sun Aug 04 09:25:55 GMT+08:00 2019
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.Hotel_id
     *
     * @return the value of order_info.Hotel_id
     *
     * @mbg.generated Sun Aug 04 09:25:55 GMT+08:00 2019
     */
    public String getHotelId() {
        return hotelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.Hotel_id
     *
     * @param hotelId the value for order_info.Hotel_id
     *
     * @mbg.generated Sun Aug 04 09:25:55 GMT+08:00 2019
     */
    public void setHotelId(String hotelId) {
        this.hotelId = hotelId == null ? null : hotelId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.Room_Num
     *
     * @return the value of order_info.Room_Num
     *
     * @mbg.generated Sun Aug 04 09:25:55 GMT+08:00 2019
     */
    public Integer getRoomNum() {
        return roomNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.Room_Num
     *
     * @param roomNum the value for order_info.Room_Num
     *
     * @mbg.generated Sun Aug 04 09:25:55 GMT+08:00 2019
     */
    public void setRoomNum(Integer roomNum) {
        this.roomNum = roomNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.Create_time
     *
     * @return the value of order_info.Create_time
     *
     * @mbg.generated Sun Aug 04 09:25:55 GMT+08:00 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.Create_time
     *
     * @param createTime the value for order_info.Create_time
     *
     * @mbg.generated Sun Aug 04 09:25:55 GMT+08:00 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.Order_total_fee
     *
     * @return the value of order_info.Order_total_fee
     *
     * @mbg.generated Sun Aug 04 09:25:55 GMT+08:00 2019
     */
    public Float getOrderTotalFee() {
        return orderTotalFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.Order_total_fee
     *
     * @param orderTotalFee the value for order_info.Order_total_fee
     *
     * @mbg.generated Sun Aug 04 09:25:55 GMT+08:00 2019
     */
    public void setOrderTotalFee(Float orderTotalFee) {
        this.orderTotalFee = orderTotalFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.Checkin_time
     *
     * @return the value of order_info.Checkin_time
     *
     * @mbg.generated Sun Aug 04 09:25:55 GMT+08:00 2019
     */
    public Date getCheckinTime() {
        return checkinTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.Checkin_time
     *
     * @param checkinTime the value for order_info.Checkin_time
     *
     * @mbg.generated Sun Aug 04 09:25:55 GMT+08:00 2019
     */
    public void setCheckinTime(Date checkinTime) {
        this.checkinTime = checkinTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.custom_num
     *
     * @return the value of order_info.custom_num
     *
     * @mbg.generated Sun Aug 04 09:25:55 GMT+08:00 2019
     */
    public Integer getCustomNum() {
        return customNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.custom_num
     *
     * @param customNum the value for order_info.custom_num
     *
     * @mbg.generated Sun Aug 04 09:25:55 GMT+08:00 2019
     */
    public void setCustomNum(Integer customNum) {
        this.customNum = customNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.days
     *
     * @return the value of order_info.days
     *
     * @mbg.generated Sun Aug 04 09:25:55 GMT+08:00 2019
     */
    public Integer getDays() {
        return days;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.days
     *
     * @param days the value for order_info.days
     *
     * @mbg.generated Sun Aug 04 09:25:55 GMT+08:00 2019
     */
    public void setDays(Integer days) {
        this.days = days;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Sun Aug 04 09:25:55 GMT+08:00 2019
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        OrderInfo other = (OrderInfo) that;
        return (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getHotelId() == null ? other.getHotelId() == null : this.getHotelId().equals(other.getHotelId()))
            && (this.getRoomNum() == null ? other.getRoomNum() == null : this.getRoomNum().equals(other.getRoomNum()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getOrderTotalFee() == null ? other.getOrderTotalFee() == null : this.getOrderTotalFee().equals(other.getOrderTotalFee()))
            && (this.getCheckinTime() == null ? other.getCheckinTime() == null : this.getCheckinTime().equals(other.getCheckinTime()))
            && (this.getCustomNum() == null ? other.getCustomNum() == null : this.getCustomNum().equals(other.getCustomNum()))
            && (this.getDays() == null ? other.getDays() == null : this.getDays().equals(other.getDays()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Sun Aug 04 09:25:55 GMT+08:00 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getHotelId() == null) ? 0 : getHotelId().hashCode());
        result = prime * result + ((getRoomNum() == null) ? 0 : getRoomNum().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getOrderTotalFee() == null) ? 0 : getOrderTotalFee().hashCode());
        result = prime * result + ((getCheckinTime() == null) ? 0 : getCheckinTime().hashCode());
        result = prime * result + ((getCustomNum() == null) ? 0 : getCustomNum().hashCode());
        result = prime * result + ((getDays() == null) ? 0 : getDays().hashCode());
        return result;
    }
}