package com.uestc.fff.hotel.mapper;

import com.uestc.fff.hotel.domain.Country;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CountryMapperExt {
    List<Country> searchCountry(@Param("countryName") String countryName);
}
