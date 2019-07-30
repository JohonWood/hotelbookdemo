<<<<<<< HEAD
package com.uestc.fff.hotel.mapper;

import com.uestc.fff.hotel.domain.City;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CityMapperExt {
    List<City> searchCountry(@Param("cityName") String cityName);
}
=======
package com.uestc.fff.hotel.mapper;

import com.uestc.fff.hotel.domain.City;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CityMapperExt {
    List<City> searchCountry(@Param("cityName") String cityName);
}
>>>>>>> 2b0298d56bc9aac760a69e2d6eae44e806f4fc9b
