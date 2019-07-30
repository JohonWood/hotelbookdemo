package com.uestc.fff.hotel.service;

import com.uestc.fff.hotel.domain.HotelInfo;
import com.uestc.fff.hotel.domain.HotelInfoExample;
import com.uestc.fff.hotel.mapper.HotelInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelManageService {
    @Autowired
    private HotelInfoMapper hotelInfoMapper;

    public List<HotelInfo> listHotel(){
        return hotelInfoMapper.selectByExample(new HotelInfoExample());
    }

    public List<HotelInfo> searchHotel(String Name) {
        return hotelInfoMapper.searchHotel(Name);
    }
}
