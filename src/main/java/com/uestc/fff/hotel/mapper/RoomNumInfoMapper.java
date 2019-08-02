package com.uestc.fff.hotel.mapper;

import com.uestc.fff.hotel.domain.OrderTR;

public interface RoomNumInfoMapper {
   OrderTR selectByOid(String orderId);
}