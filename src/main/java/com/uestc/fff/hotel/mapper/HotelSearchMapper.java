package com.uestc.fff.hotel.mapper;

import com.uestc.fff.hotel.domain.FullSearResult;
import com.uestc.fff.hotel.domain.Key;

import java.util.List;

public interface HotelSearchMapper {
    Float priceLeast(String hotelID);
    List<FullSearResult> fullResultSearch(Key key);

}
