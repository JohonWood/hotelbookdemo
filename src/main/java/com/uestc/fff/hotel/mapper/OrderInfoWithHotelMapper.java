package com.uestc.fff.hotel.mapper;

import com.uestc.fff.hotel.domain.OrderInfoWithHotel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderInfoWithHotelMapper {

    OrderInfoWithHotel selectOne(String userId);

    List<OrderInfoWithHotel> selectAll(String userId);

}