package com.uestc.fff.hotel.service;

import com.uestc.fff.hotel.domain.UserInfo;
import com.uestc.fff.hotel.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    public void insertUserInfo(UserInfo userInfo)
    {
        userInfoMapper.insert(userInfo);
    }

    public UserInfo findUserByUserID(String userID)
    {
        return userInfoMapper.selectByPrimaryKey(userID);
    }

    public void updateUserInfo(UserInfo userInfo)
    {
        userInfoMapper.updateByPrimaryKey(userInfo);
    }
}


