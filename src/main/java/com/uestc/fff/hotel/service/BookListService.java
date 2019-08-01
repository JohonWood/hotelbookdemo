package com.uestc.fff.hotel.service;

import com.uestc.fff.hotel.domain.*;
import com.uestc.fff.hotel.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookListService {
    @Autowired
    private OrderInfoWithHotelMapper orderInfoWithHotelMapper;
    @Autowired
    private HotelInfoMapper hotelInfoMapper;
    @Autowired
    private RoomInfoMapper roomInfoMapper;
    @Autowired
    private OrderInfoMapper orderInfoMapper;
    @Autowired
    private UserInfoMapper userInfoMapper;

    public List<OrderInfoWithHotel> MyListOrder(String uid){ return orderInfoWithHotelMapper.selectAll(uid); }

    public HotelInfo HotelInfomation(String hid){
        return hotelInfoMapper.selectByPrimaryKey(hid);
    }

    public RoomInfo RoomInfomation(String rid){
        return roomInfoMapper.selectByPrimaryKey(rid);
    }

    public List<RoomInfo> RoomInfoList(String hid) { return  roomInfoMapper.selectByHotel(hid); }

    public OrderInfo OrderInfomation(String oid){
        return orderInfoMapper.selectByPrimaryKey(oid);
    }

    public UserInfo UserInfomation(String uid)  { return userInfoMapper.selectByPrimaryKey(uid); }

    public void DeleteOrder(String oid){ orderInfoMapper.deleteByPrimaryKey(oid); }

    //public long NumOfAllOrders() { return orderInfoMapper.countByExample(new OrderInfoExample()); }
}

