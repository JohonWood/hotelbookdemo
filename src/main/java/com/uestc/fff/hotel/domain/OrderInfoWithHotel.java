package com.uestc.fff.hotel.domain;

import java.util.Date;

public class OrderInfoWithHotel {
    private String orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.User_ID
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.Hotel_id
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    private String hotelId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.RoomID
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    private Integer roomNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.Create_time
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.Order_total_fee
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    private Float orderTotalFee;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.Checkin_time
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    private Date checkinTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.custom_num
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    private Integer customNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.days
     *
     * @mbg.generated Fri Aug 02 15:13:00 CST 2019
     */
    private Integer days;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.Order_ID
     *
     * @return the value of order_info.Order_ID
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
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
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
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
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
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
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.days
     *
     * @return the value of order_info.days
     *
     * @mbg.generated Fri Aug 02 15:13:00 CST 2019
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
     * @mbg.generated Fri Aug 02 15:13:00 CST 2019
     */
    public void setDays(Integer days) {
        this.days = days;
    }
    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.Hotel_id
     *
     * @return the value of order_info.Hotel_id
     */
    private String contimentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel_info.City_ID
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    private String cityId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel_info.Country_Code
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    private String countryCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel_info.Hotel_name
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    private String hotelName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel_info.Hotel_phone
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    private String hotelPhone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel_info.Hotel_grade
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    private Integer hotelGrade;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel_info.Hotel_address
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    private String hotelAddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel_info.Hotel_photo5
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    private String hotelPhoto5;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel_info.Hotel_photo4
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    private String hotelPhoto4;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel_info.Hotel_photo3
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    private String hotelPhoto3;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel_info.Hotel_photo2
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    private String hotelPhoto2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel_info.Hotel_photo1
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    private String hotelPhoto1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel_info.Hotel_name_en
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    private String hotelNameEn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel_info.Hotel_zipcode
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    private String hotelZipcode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel_info.Hotel_checkin
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    private String hotelCheckin;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel_info.Hotel_checkout
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    private String hotelCheckout;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel_info.Hotel_roomnum
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    private Integer hotelRoomnum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel_info.Hotel_ratesfrom
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    private Float hotelRatesfrom;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel_info.Hotel_rating
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    private Float hotelRating;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel_info.Hotel_currency
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    private String hotelCurrency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel_info.Hotel_reviewnum
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    private Integer hotelReviewnum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel_info.Hotel_overview
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    private String hotelOverview;
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel_info.Hotel_longitude
     *
     * @mbg.generated Sun Aug 04 09:25:55 GMT+08:00 2019
     */
    private Double hotelLongitude;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel_info.Hotel_latitude
     *
     * @mbg.generated Sun Aug 04 09:25:55 GMT+08:00 2019
     */
    private Double hotelLatitude;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel_info.Hotel_id
     *
     * @return the value of hotel_info.Hotel_id
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
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
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    public void setHotelId(String hotelId) {
        this.hotelId = hotelId == null ? null : hotelId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.RoomID
     *
     * @return the value of order_info.RoomID
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
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
     * @mbg.generated Fri Aug 02 11:18:42 GMT+08:00 2019
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
     * @mbg.generated Fri Aug 02 11:18:42 GMT+08:00 2019
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
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
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
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
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
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
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
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
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
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
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
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
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
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    public void setCustomNum(Integer customNum) {
        this.customNum = customNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    public String getContimentId() {
        return contimentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel_info.Contiment_ID
     *
     * @param contimentId the value for hotel_info.Contiment_ID
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    public void setContimentId(String contimentId) {
        this.contimentId = contimentId == null ? null : contimentId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel_info.City_ID
     *
     * @return the value of hotel_info.City_ID
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    public String getCityId() {
        return cityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel_info.City_ID
     *
     * @param cityId the value for hotel_info.City_ID
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    public void setCityId(String cityId) {
        this.cityId = cityId == null ? null : cityId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel_info.Country_Code
     *
     * @return the value of hotel_info.Country_Code
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel_info.Country_Code
     *
     * @param countryCode the value for hotel_info.Country_Code
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode == null ? null : countryCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel_info.Hotel_name
     *
     * @return the value of hotel_info.Hotel_name
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    public String getHotelName() {
        return hotelName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel_info.Hotel_name
     *
     * @param hotelName the value for hotel_info.Hotel_name
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    public void setHotelName(String hotelName) {
        this.hotelName = hotelName == null ? null : hotelName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel_info.Hotel_phone
     *
     * @return the value of hotel_info.Hotel_phone
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    public String getHotelPhone() {
        return hotelPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel_info.Hotel_phone
     *
     * @param hotelPhone the value for hotel_info.Hotel_phone
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    public void setHotelPhone(String hotelPhone) {
        this.hotelPhone = hotelPhone == null ? null : hotelPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel_info.Hotel_grade
     *
     * @return the value of hotel_info.Hotel_grade
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    public Integer getHotelGrade() {
        return hotelGrade;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel_info.Hotel_grade
     *
     * @param hotelGrade the value for hotel_info.Hotel_grade
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    public void setHotelGrade(Integer hotelGrade) {
        this.hotelGrade = hotelGrade;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel_info.Hotel_address
     *
     * @return the value of hotel_info.Hotel_address
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    public String getHotelAddress() {
        return hotelAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel_info.Hotel_address
     *
     * @param hotelAddress the value for hotel_info.Hotel_address
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress == null ? null : hotelAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel_info.Hotel_photo5
     *
     * @return the value of hotel_info.Hotel_photo5
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    public String getHotelPhoto5() {
        return hotelPhoto5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel_info.Hotel_photo5
     *
     * @param hotelPhoto5 the value for hotel_info.Hotel_photo5
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    public void setHotelPhoto5(String hotelPhoto5) {
        this.hotelPhoto5 = hotelPhoto5 == null ? null : hotelPhoto5.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel_info.Hotel_photo4
     *
     * @return the value of hotel_info.Hotel_photo4
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    public String getHotelPhoto4() {
        return hotelPhoto4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel_info.Hotel_photo4
     *
     * @param hotelPhoto4 the value for hotel_info.Hotel_photo4
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    public void setHotelPhoto4(String hotelPhoto4) {
        this.hotelPhoto4 = hotelPhoto4 == null ? null : hotelPhoto4.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel_info.Hotel_photo3
     *
     * @return the value of hotel_info.Hotel_photo3
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    public String getHotelPhoto3() {
        return hotelPhoto3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel_info.Hotel_photo3
     *
     * @param hotelPhoto3 the value for hotel_info.Hotel_photo3
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    public void setHotelPhoto3(String hotelPhoto3) {
        this.hotelPhoto3 = hotelPhoto3 == null ? null : hotelPhoto3.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel_info.Hotel_photo2
     *
     * @return the value of hotel_info.Hotel_photo2
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    public String getHotelPhoto2() {
        return hotelPhoto2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel_info.Hotel_photo2
     *
     * @param hotelPhoto2 the value for hotel_info.Hotel_photo2
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    public void setHotelPhoto2(String hotelPhoto2) {
        this.hotelPhoto2 = hotelPhoto2 == null ? null : hotelPhoto2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel_info.Hotel_photo1
     *
     * @return the value of hotel_info.Hotel_photo1
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    public String getHotelPhoto1() {
        return hotelPhoto1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel_info.Hotel_photo1
     *
     * @param hotelPhoto1 the value for hotel_info.Hotel_photo1
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    public void setHotelPhoto1(String hotelPhoto1) {
        this.hotelPhoto1 = hotelPhoto1 == null ? null : hotelPhoto1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel_info.Hotel_name_en
     *
     * @return the value of hotel_info.Hotel_name_en
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    public String getHotelNameEn() {
        return hotelNameEn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel_info.Hotel_name_en
     *
     * @param hotelNameEn the value for hotel_info.Hotel_name_en
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    public void setHotelNameEn(String hotelNameEn) {
        this.hotelNameEn = hotelNameEn == null ? null : hotelNameEn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel_info.Hotel_zipcode
     *
     * @return the value of hotel_info.Hotel_zipcode
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    public String getHotelZipcode() {
        return hotelZipcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel_info.Hotel_zipcode
     *
     * @param hotelZipcode the value for hotel_info.Hotel_zipcode
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    public void setHotelZipcode(String hotelZipcode) {
        this.hotelZipcode = hotelZipcode == null ? null : hotelZipcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel_info.Hotel_checkin
     *
     * @return the value of hotel_info.Hotel_checkin
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    public String getHotelCheckin() {
        return hotelCheckin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel_info.Hotel_checkin
     *
     * @param hotelCheckin the value for hotel_info.Hotel_checkin
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    public void setHotelCheckin(String hotelCheckin) {
        this.hotelCheckin = hotelCheckin == null ? null : hotelCheckin.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel_info.Hotel_checkout
     *
     * @return the value of hotel_info.Hotel_checkout
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    public String getHotelCheckout() {
        return hotelCheckout;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel_info.Hotel_checkout
     *
     * @param hotelCheckout the value for hotel_info.Hotel_checkout
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    public void setHotelCheckout(String hotelCheckout) {
        this.hotelCheckout = hotelCheckout == null ? null : hotelCheckout.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel_info.Hotel_roomnum
     *
     * @return the value of hotel_info.Hotel_roomnum
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    public Integer getHotelRoomnum() {
        return hotelRoomnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel_info.Hotel_roomnum
     *
     * @param hotelRoomnum the value for hotel_info.Hotel_roomnum
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    public void setHotelRoomnum(Integer hotelRoomnum) {
        this.hotelRoomnum = hotelRoomnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel_info.Hotel_ratesfrom
     *
     * @return the value of hotel_info.Hotel_ratesfrom
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    public Float getHotelRatesfrom() {
        return hotelRatesfrom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel_info.Hotel_ratesfrom
     *
     * @param hotelRatesfrom the value for hotel_info.Hotel_ratesfrom
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    public void setHotelRatesfrom(Float hotelRatesfrom) {
        this.hotelRatesfrom = hotelRatesfrom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel_info.Hotel_rating
     *
     * @return the value of hotel_info.Hotel_rating
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    public Float getHotelRating() {
        return hotelRating;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel_info.Hotel_rating
     *
     * @param hotelRating the value for hotel_info.Hotel_rating
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    public void setHotelRating(Float hotelRating) {
        this.hotelRating = hotelRating;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel_info.Hotel_currency
     *
     * @return the value of hotel_info.Hotel_currency
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    public String getHotelCurrency() {
        return hotelCurrency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel_info.Hotel_currency
     *
     * @param hotelCurrency the value for hotel_info.Hotel_currency
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    public void setHotelCurrency(String hotelCurrency) {
        this.hotelCurrency = hotelCurrency == null ? null : hotelCurrency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel_info.Hotel_reviewnum
     *
     * @return the value of hotel_info.Hotel_reviewnum
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    public Integer getHotelReviewnum() {
        return hotelReviewnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel_info.Hotel_reviewnum
     *
     * @param hotelReviewnum the value for hotel_info.Hotel_reviewnum
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    public void setHotelReviewnum(Integer hotelReviewnum) {
        this.hotelReviewnum = hotelReviewnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel_info.Hotel_overview
     *
     * @return the value of hotel_info.Hotel_overview
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    public String getHotelOverview() {
        return hotelOverview;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel_info.Hotel_longitude
     *
     * @return the value of hotel_info.Hotel_longitude
     *
     * @mbg.generated Sun Aug 04 09:25:55 GMT+08:00 2019
     */
    public Double getHotelLongitude() {
        return hotelLongitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel_info.Hotel_longitude
     *
     * @param hotelLongitude the value for hotel_info.Hotel_longitude
     *
     * @mbg.generated Sun Aug 04 09:25:55 GMT+08:00 2019
     */
    public void setHotelLongitude(Double hotelLongitude) {
        this.hotelLongitude = hotelLongitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel_info.Hotel_latitude
     *
     * @return the value of hotel_info.Hotel_latitude
     *
     * @mbg.generated Sun Aug 04 09:25:55 GMT+08:00 2019
     */
    public Double getHotelLatitude() {
        return hotelLatitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel_info.Hotel_latitude
     *
     * @param hotelLatitude the value for hotel_info.Hotel_latitude
     *
     * @mbg.generated Sun Aug 04 09:25:55 GMT+08:00 2019
     */
    public void setHotelLatitude(Double hotelLatitude) {
        this.hotelLatitude = hotelLatitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel_info.Hotel_overview
     *
     * @param hotelOverview the value for hotel_info.Hotel_overview
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    public void setHotelOverview(String hotelOverview) {
        this.hotelOverview = hotelOverview == null ? null : hotelOverview.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hotel_info
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
}
