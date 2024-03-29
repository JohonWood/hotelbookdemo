package com.uestc.fff.hotel.service;

import com.uestc.fff.hotel.domain.*;
import com.uestc.fff.hotel.domain.Area;
import com.uestc.fff.hotel.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import javax.swing.plaf.FontUIResource;
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
    public List<FullSearResult> filterGrade(String lowGrade,String highGrade,List<FullSearResult> origin){
        List<FullSearResult> resultList=new ArrayList<FullSearResult>();
        for(FullSearResult originReslt:origin){
            if(originReslt.getHotelGrade()<=Integer.parseInt(highGrade)&&originReslt.getHotelGrade()>=Integer.parseInt(lowGrade)){
                resultList.add(originReslt);
            }
        }
        return resultList;
    }
    public List<FullSearResult> filterRating(String rating,List<FullSearResult> origin){
        List<FullSearResult> resultList=new ArrayList<FullSearResult>();
        for (FullSearResult originResult:origin){
            if(originResult.getHotelRating()>=Float.parseFloat(rating)){
                resultList.add(originResult);
            }
        }

        return resultList;
    }
    public List<FullSearResult> orderRating(List<FullSearResult> origin){
        List<FullSearResult> ordered=new ArrayList<FullSearResult>();
        int temp=0;
        int i=0;
        Float temp1=0F;
        int t=origin.size();
        int s=t;
        for(int j=0;j<t;j++){
            temp1=0F;
            temp=0;
            for(int k=0;k<origin.size();k++){
                if(origin.get(k).getHotelRating()>=temp1){
                    temp=k;
                    temp1=origin.get(k).getHotelRating();
                }
            }
            ordered.add(origin.get(temp));
            origin.remove(temp);
        }

        return ordered;

    }

    public List<FullSearResult> orderGrade(List<FullSearResult> origin){
        List<FullSearResult> ordered=new ArrayList<FullSearResult>();
        int temp=0;
        int i=0;
        int temp1=0;
        int t=origin.size();
        int s=t;
        for(int j=0;j<t;j++){
            temp1=0;
            temp=0;
            for(int k=0;k<origin.size();k++){
                if(origin.get(k).getHotelGrade()>=temp1){
                    temp=k;
                    temp1=origin.get(k).getHotelGrade();
                }
            }
            ordered.add(origin.get(temp));
            origin.remove(temp);
        }

        return ordered;

    }

    public List<FullSearResult> orderPriceHTL(List<FullSearResult> origin){
        List<FullSearResult> ordered=new ArrayList<FullSearResult>();
        int temp=0;
        int i=0;
        Float temp1=0F;
        int t=origin.size();
        int s=t;
        for(int j=0;j<t;j++){
            temp1=0F;
            temp=0;
            for(int k=0;k<origin.size();k++){
                if(origin.get(k).getLeastPrice()>=temp1){
                    temp=k;
                    temp1=origin.get(k).getLeastPrice();
                }
            }
            ordered.add(origin.get(temp));
            origin.remove(temp);
        }

        return ordered;

    }
    public List<FullSearResult> orderPriceLTH(List<FullSearResult> origin){
        List<FullSearResult> ordered=new ArrayList<FullSearResult>();
        int temp=0;
        int i=0;
        Float temp1=0F;
        int t=origin.size();
        int s=t;
        for(int j=0;j<t;j++){
            temp1=origin.get(0).getLeastPrice();
            temp=0;
            for(int k=0;k<origin.size();k++){
                if(origin.get(k).getLeastPrice()<=temp1){
                    temp=k;
                    temp1=origin.get(k).getLeastPrice();
                }
            }
            ordered.add(origin.get(temp));
            origin.remove(temp);
        }

        return ordered;

    }

}
