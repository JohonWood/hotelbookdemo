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
    public List<String> searchCountry(){
        List<Country> countries=countryMapper.selectByExample(new CountryExample());//new ArrayList<Country>();
        List<String> listOfCountry=new ArrayList<String>();
        for (Country country : countries){
            listOfCountry.add(country.getCountryName());
        }
        return listOfCountry;
    }
    public List<String> searchCity(String countryName){
        List<String> listOfCity=new ArrayList<String >();
        List<Country> countries=countryMapper.selectByExample(new CountryExample());
        List<City> cities=cityMapper.selectByExample(new CityExample());
        String countryCode=null;
        for (Country country : countries){
            if(country.getCountryName().equals(countryName)){
                countryCode=country.getCountryCode();
            }
        }
        for (City city:cities){
            if(city.getCountryCode().equals(countryCode)){
                listOfCity.add(city.getCityName());
            }
            else{
                listOfCity.add("暂未开通");
            }
        }
        return listOfCity;
    }
    List<order> orderList(String userID){
        List<OrderInfo> orderInfoList=orderInfoMapper.selectByExample(new OrderInfoExample());
        List<HotelInfo> hotelInfoList=hotelInfoMapper.selectByExample(new HotelInfoExample());
        List<RoomInfo> roomInfoList= roomInfoMapper.selectByExample(new RoomInfoExample());
        List<OrderInfo> userOrders=new ArrayList<OrderInfo>();
        for(OrderInfo orderInfo: orderInfoList){
            if(orderInfo.getUserId().equals(userID)){
                userOrders.add(orderInfo);
            }
        }
        for(OrderInfo userOrder: userOrders){
            order uOrder=new order();
            for(HotelInfo hotelInfo:hotelInfoList){

                if(userOrder.getHotelId().equals(hotelInfo.getHotelId())){
                    uOrder.setHotelName(hotelInfo.getHotelName());
                }
            }
            for()
        }
    }
}
