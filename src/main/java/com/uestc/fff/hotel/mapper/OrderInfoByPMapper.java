package com.uestc.fff.hotel.mapper;

import com.uestc.fff.hotel.domain.OrderInfoByP;
import com.uestc.fff.hotel.domain.OrderInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderInfoByPMapper {

    OrderInfoByP selectAll(String userId);

}