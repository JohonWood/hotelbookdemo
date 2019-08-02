package com.uestc.fff.hotel.service;

import com.uestc.fff.hotel.domain.*;
import com.uestc.fff.hotel.mapper.HotelInfoMapper;
import com.uestc.fff.hotel.mapper.OrderInfoMapper;
import com.uestc.fff.hotel.mapper.RoomInfoMapper;
import com.uestc.fff.hotel.mapper.UserInfoMapper;
import org.omg.PortableInterceptor.HOLDING;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HotelManageService {
    @Autowired
    private HotelInfoMapper hotelInfoMapper;
    @Autowired
    private RoomInfoMapper roomInfoMapper;
    @Autowired
    private OrderInfoMapper orderInfoMapper;
    @Autowired
    private UserInfoMapper userInfoMapper;

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

    public void saveRoom(RoomInfo roomInfo) {
        roomInfoMapper.insert(roomInfo);
    }

    public RoomInfo findRoomByPrimaryKey(String roomID) {
        return roomInfoMapper.selectByPrimaryKey(roomID);
    }

    public void updateRoom(RoomInfo roomInfo) {
        roomInfoMapper.updateByPrimaryKey(roomInfo);
    }

    public void deleteRoomByID(String roomID) {
        roomInfoMapper.deleteByPrimaryKey(roomID);
    }


    public List<OrderInfo> listOrderInfo(OrderInfoExample orderInfoExample) {
        return orderInfoMapper.selectByExample(orderInfoExample);
    }

    public UserInfo findUserByPrimaryKey(String userId) {
        return userInfoMapper.selectByPrimaryKey(userId);
    }

    public List<UserManagement> userManagementList(List<OrderInfo> orderInfoList){
        List<UserManagement> userManagements = new ArrayList<>();
        for ( OrderInfo order1:orderInfoList) {
            UserInfo userInfo = this.findUserByPrimaryKey(order1.getUserId());
            UserManagement userManagement = new UserManagement();
            userManagement.setOrderId(order1.getOrderId());
            userManagement.setCheckinTime(order1.getCheckinTime());
            userManagement.setCreateTime(order1.getCreateTime());
            userManagement.setCustomNum(order1.getCustomNum());
            userManagement.setHotelId(order1.getHotelId());
            userManagement.setOrderTotalFee(order1.getOrderTotalFee());
            userManagement.setRoomnum(order1.getRoomNum());
            userManagement.setUserName(userInfo.getUserName());
            userManagements.add(userManagement);
        }
        return userManagements;
    }

    public List<UserInfo> findUserByExample(UserInfoExample userInfoExample) {
        return userInfoMapper.selectByExample(userInfoExample);
    }
}