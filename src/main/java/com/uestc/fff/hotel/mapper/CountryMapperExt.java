<<<<<<< HEAD
package com.uestc.fff.hotel.mapper;

import com.uestc.fff.hotel.domain.Country;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CountryMapperExt {
    List<Country> searchCountry(@Param("countryName") String countryName);
}
=======
package com.uestc.fff.hotel.mapper;

import com.uestc.fff.hotel.domain.Country;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CountryMapperExt {
    List<Country> searchCountry(@Param("countryName") String countryName);
}
>>>>>>> 2b0298d56bc9aac760a69e2d6eae44e806f4fc9b
