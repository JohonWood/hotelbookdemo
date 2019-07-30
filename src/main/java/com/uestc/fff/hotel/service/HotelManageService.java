package com.uestc.fff.hotel.service;

import com.uestc.fff.hotel.domain.HotelInfo;
import com.uestc.fff.hotel.domain.HotelInfoExample;
import com.uestc.fff.hotel.domain.RoomInfo;
import com.uestc.fff.hotel.domain.RoomInfoExample;
import com.uestc.fff.hotel.mapper.HotelInfoMapper;
import com.uestc.fff.hotel.mapper.RoomInfoMapper;
import org.omg.PortableInterceptor.HOLDING;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelManageService {
    @Autowired
    private HotelInfoMapper hotelInfoMapper;
    @Autowired
    private RoomInfoMapper roomInfoMapper;

    public List<HotelInfo> listHotel(HotelInfoExample hotelInfoExample){
        return hotelInfoMapper.selectByExample(hotelInfoExample);
    }

    public HotelInfo searchAHotel(String id) {
        return hotelInfoMapper.selectByPrimaryKey(id);
    }

    public List<HotelInfo> searchHotel(String Name) {
        HotelInfoExample hotelInfoExample = new HotelInfoExample();
        hotelInfoExample.createCriteria().andHotelNameLike("%" + Name + "%");
        return hotelInfoMapper.selectByExample(hotelInfoExample);
    }

    public List<RoomInfo> listRoom(RoomInfoExample roomInfoExample) {
        return roomInfoMapper.selectByExample(roomInfoExample);
    }
}