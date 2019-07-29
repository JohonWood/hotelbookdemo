package com.uestc.fff.hotel.mapper;

import com.uestc.fff.hotel.domain.HotelInfo;
import com.uestc.fff.hotel.domain.order;

import java.util.List;

public interface searchMapper {
    List<String> selectByCountry(String countryCode);
    List<order> selectOrder(String userID);
    int countOrder(String userID);
    List<HotelInfo> selectByKey(String key);
}
