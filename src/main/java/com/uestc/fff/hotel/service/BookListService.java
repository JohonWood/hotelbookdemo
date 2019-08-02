package com.uestc.fff.hotel.service;

import com.sun.tools.corba.se.idl.constExpr.Or;
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
    @Autowired
    private RoomNumInfoMapper RoomNumInfoMapper;

    public List<OrderInfoWithHotel> MyListOrder(String uid){ return orderInfoWithHotelMapper.selectAll(uid); }

    public HotelInfo HotelInfomation(String hid){
        return hotelInfoMapper.selectByPrimaryKey(hid);
    }

    public RoomInfo RoomInfomation(String rid){
        return roomInfoMapper.selectByPrimaryKey(rid);
    }

    public OrderTR RoomNumInfo(String oid){ return RoomNumInfoMapper.selectByOid(oid); }

    //public List<RoomInfo> RoomInfoList(String hid) { return  roomInfoMapper.selectByHotel(hid); }

    public OrderInfo OrderInfomation(String oid){
        return orderInfoMapper.selectByPrimaryKey(oid);
    }

    public UserInfo UserInfomation(String uid)  { return userInfoMapper.selectByPrimaryKey(uid); }

    public void DeleteOrder(String oid){ orderInfoMapper.deleteByPrimaryKey(oid); }

    public long CountAllOrders() { return orderInfoMapper.countByExample(new OrderInfoExample()); }
}

