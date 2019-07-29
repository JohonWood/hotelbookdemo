package com.uestc.fff.hotel.service;

import com.uestc.fff.hotel.domain.*;
import com.uestc.fff.hotel.domain.Area;
import com.uestc.fff.hotel.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class searchService {
    @Autowired
    CountryMapper countryMapper;
    @Autowired
    HotelInfoMapper hotelInfoMapper;
    @Autowired
    CityMapper cityMapper;
    @Autowired
    OrderInfoMapper orderInfoMapper;
    @Autowired
    RoomInfoMapper roomInfoMapper;
    @Autowired
    searchMapper searchMapper;
    public List<String> searchCountry(){
        List<Country> countries=countryMapper.selectByExample(new CountryExample());//new ArrayList<Country>();
        List<String> listOfCountry=new ArrayList<String>();
        for (Country country : countries){
            listOfCountry.add(country.getCountryName());
        }
        return listOfCountry;
    }
    public List<String> searchCity(String countryName){
        List<String> listOfCity=searchMapper.selectByCountry(countryName);
        if(listOfCity.isEmpty()){
            listOfCity.add("暂未开通");
        }
        return listOfCity;
    }
    public  List<order> orderList(String userID){
        List<order> listOfOder=searchMapper.selectOrder(userID);
        return listOfOder;
    }
    public int countOrder(String userID){
        return searchMapper.countOrder(userID);
    }
    public void test(String key){
        List<HotelInfo> hotelInfos=searchMapper.selectByKey(key);
        if(!hotelInfos.isEmpty()){
            for(HotelInfo hotelInfo:hotelInfos){
                System.out.println(hotelInfo.getHotelName());
            }
        }
        else{
            System.out.println("good");
        }

    }

}
