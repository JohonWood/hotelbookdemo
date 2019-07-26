package com.uestc.fff.hotel.services;

import com.uestc.fff.hotel.domain.Area;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class searchService {


    public List<Area> setArea() {
        Map <String,String>map = new HashMap<String, String>();
        List <Area> areas=new ArrayList<Area>();
        Area CN=new Area();
        CN.setCoutry("China");
        List<String> CNcity=new ArrayList<String>();
        CNcity.add("hangzhou");
        CNcity.add("ChengDu");
        CN.setCity(CNcity);
        areas.add(CN);
        Area UK=new Area();
        UK.setCoutry("United Kindom");
        List<String> UKcity=new ArrayList<String>();
        UKcity.add("London");
        UKcity.add("Senten");
        UK.setCity(UKcity);
        areas.add(UK);
        return areas;
    }
}
