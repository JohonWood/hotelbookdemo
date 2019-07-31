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
}
/*
    public boolean register(){

        UserInfo testid = findUserByUserID();
        if (testid == null )
        {
            userInfoMapper.insert(userInfo);
            System.out.println("注册成功");
            return true;
        }
        else
        {
            System.out.println(userInfo.getUserId()+ "已被使用");
            return false;
        }
    }

    public boolean login(UserInfo userInfo){
        UserInfo dbUser = userInfoMapper.selectByPrimaryKey(userInfo.getUserId());
        if(dbUser == null)
        {
            System.out.println("该用户不存在");
            return false;
        }
        else if(!dbUser.getLoginPassword().equals(userInfo.getLoginPassword()))
        {
            System.out.println("密码错误");
            return false;
        }
        else
        {
            System.out.println("登录成功");
            return true;
        }
    }*/

