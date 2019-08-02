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
    @Autowired
    HotelSearchMapper hotelSearchMapper;
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
    public List<FullSearResult> fullSearch(String hotelKey,String countryKey,String cityKey) {
        Key key = new Key();
        key.setCityKey(cityKey);
        key.setCountryKey(countryKey);
        key.setHotelKey("%" + hotelKey + "%");
        List<FullSearResult> searchResultList=hotelSearchMapper.fullResultSearch(key);

        if (!searchResultList.isEmpty()) {
            return searchResultList;
        }
        else{
            return null;
        }
    }

    public List<FullSearResult> filterPrice(String lowPrice,String highPrice,List<FullSearResult> origin){
        List<FullSearResult> resultList=new ArrayList<FullSearResult>();
        if(lowPrice==""&&highPrice==""){
            return origin;
        }
        else if(lowPrice==""){
            for(FullSearResult fullSearResult:origin){
                if(fullSearResult.getLeastPrice()<=Integer.parseInt(highPrice)){
                    resultList.add(fullSearResult);
                }
            }
            return resultList;
        }
        else if(highPrice==""){
            for(FullSearResult fullSearResult:origin){
                if(fullSearResult.getLeastPrice()>=Integer.parseInt(lowPrice)){
                    resultList.add(fullSearResult);
                }
            }
            return resultList;
        }
        else{
            for(FullSearResult fullSearResult:origin){
                if(fullSearResult.getLeastPrice()>=Integer.parseInt(lowPrice)&&fullSearResult.getLeastPrice()<=Integer.parseInt(highPrice)){
                    resultList.add(fullSearResult);
                }
            }
            return resultList;
        }
    }

}
