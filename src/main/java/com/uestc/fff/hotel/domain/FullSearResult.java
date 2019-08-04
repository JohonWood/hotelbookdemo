package com.uestc.fff.hotel.domain;

public class FullSearResult {
    private String hotelId;
    private String hotelName;
    private int hotelGrade;
    private String hotelAddress;
    private String hotelPhoto1;
    private float hotelRating;
    private String hotelOverview;
    private Float leastPrice;
    private double lng;
    private double lat;

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getHotelGrade() {
        return hotelGrade;
    }

    public void setHotelGrade(int hotelGrade) {
        this.hotelGrade = hotelGrade;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String getHotelPhoto1() {
        return hotelPhoto1;
    }

    public void setHotelPhoto1(String hotelPhoto1) {
        this.hotelPhoto1 = hotelPhoto1;
    }

    public float getHotelRating() {
        return hotelRating;
    }

    public void setHotelRating(float hotelRating) {
        this.hotelRating = hotelRating;
    }

    public String getHotelOverview() {
        return hotelOverview;
    }

    public void setHotelOverview(String hotelOverview) {
        this.hotelOverview = hotelOverview;
    }

    public Float getLeastPrice() {
        return leastPrice;
    }

    public void setLeastPrice(Float leastPrice) {
        this.leastPrice = leastPrice;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }
}
