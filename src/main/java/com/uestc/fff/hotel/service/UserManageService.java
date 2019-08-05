package com.uestc.fff.hotel.service;

import com.uestc.fff.hotel.domain.UserInfo;
import com.uestc.fff.hotel.domain.UserInfoExample;
import com.uestc.fff.hotel.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserManageService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    public List<UserInfo> listUser(UserInfoExample userInfoExample) {
        return userInfoMapper.selectByExample(userInfoExample);
    }

    public void deleteUserByUserID(String userCode) {
        userInfoMapper.deleteByPrimaryKey(userCode);
    }

    public void updateUserById(UserInfo listUser, UserInfoExample userInfoExample) {
        userInfoMapper.updateByExample(listUser, userInfoExample);
    }
}
