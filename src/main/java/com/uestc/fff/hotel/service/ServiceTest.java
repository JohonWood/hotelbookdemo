package com.uestc.fff.hotel.service;

import com.uestc.fff.hotel.domain.*;
import com.uestc.fff.hotel.mapper.HotelInfoMapper;
import com.uestc.fff.hotel.mapper.OrderInfoByPMapper;
import com.uestc.fff.hotel.mapper.OrderInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceTest {
    @Autowired
    private HotelInfoMapper hotelInfoMapper;
    @Autowired
    private OrderInfoByPMapper orderInfoMapper;

    public List<HotelInfo> listHotel(){
        return hotelInfoMapper.selectByExample(new HotelInfoExample());
    }

    public OrderInfoByP listOrder(){
        return orderInfoMapper.selectAll("510105199907131778");
    }
}
