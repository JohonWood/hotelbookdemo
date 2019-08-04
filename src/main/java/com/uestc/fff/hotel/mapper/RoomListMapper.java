package com.uestc.fff.hotel.mapper;

import com.uestc.fff.hotel.domain.RoomInfo;
import com.uestc.fff.hotel.domain.RoomInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface RoomListMapper {
    List<RoomInfo> selectByHotel(String hotelId);

    RoomInfo selectByType(@Param("hid") String hotelId,@Param("type") String rtype);
}