package com.uestc.fff.hotel.mapper;

import com.uestc.fff.hotel.domain.HotelInfo;

import java.util.List;

public interface HotelInfoMapperExt {
    public List<HotelInfo> searchHotel(String hotelName);
}
