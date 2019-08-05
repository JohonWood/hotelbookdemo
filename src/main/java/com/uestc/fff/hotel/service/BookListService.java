package com.uestc.fff.hotel.service;

import com.uestc.fff.hotel.domain.*;
import com.uestc.fff.hotel.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    @Autowired
    private RoomListMapper roomListMapper;
    @Autowired
    private OrderTRMapper orderTRMapper;

    public List<OrderInfoWithHotel> MyListOrder(String uid){ return orderInfoWithHotelMapper.selectAll(uid); }

    public HotelInfo HotelInfomation(String hid){
        return hotelInfoMapper.selectByPrimaryKey(hid);
    }

    public RoomInfo RoomInfomation(String rid){
        return roomInfoMapper.selectByPrimaryKey(rid);
    }

    public OrderTR RoomNumInfo(String oid){ return RoomNumInfoMapper.selectByOid(oid); }

    public List<RoomInfo> RoomInfoList(String hid) { return  roomListMapper.selectByHotel(hid); }

    public RoomInfo RoomByType(String hid, String rtype){ return  roomListMapper.selectByType(hid, rtype); }

    public OrderInfo OrderInfomation(String oid){
        return orderInfoMapper.selectByPrimaryKey(oid);
    }

    public UserInfo UserInfomation(String uid)  { return userInfoMapper.selectByPrimaryKey(uid); }

    //public void DeleteOrder(String oid){ orderInfoMapper.deleteByPrimaryKey(oid); }

    public void UpdateDays(String oid){
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setOrderId(oid);
        orderInfo.setDays(-1);
        orderInfoMapper.updateByPrimaryKeySelective(orderInfo);
    }

    public void SaveOrder(OrderInfo orderInfo){ orderInfoMapper.insertSelective(orderInfo); }

    public void SaveOrderTR(OrderTR orderTR){ orderTRMapper.insertSelective(orderTR); }
}

