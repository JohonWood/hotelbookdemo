package com.uestc.fff.hotel.domain;

import java.util.List;

public class Area {
    private String country;
    private List<String> city;


    public String getCoutry() {
        return country;
    }

    public void setCoutry(String coutry) {
        this.country = coutry;
    }

    public List<String> getCity() {
        return city;
    }

    public void setCity(List<String> city) {
        this.city = city;
    }
}
