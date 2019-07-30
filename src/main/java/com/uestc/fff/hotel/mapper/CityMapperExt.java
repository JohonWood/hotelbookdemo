package com.uestc.fff.hotel.mapper;

import com.uestc.fff.hotel.domain.City;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CityMapperExt {
    List<City> searchCountry(@Param("cityName") String cityName);
}
