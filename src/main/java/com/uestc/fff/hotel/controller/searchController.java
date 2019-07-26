package com.uestc.fff.hotel.controller;

import com.uestc.fff.hotel.domain.Area;
import com.uestc.fff.hotel.domain.order;
import com.uestc.fff.hotel.services.searchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/test")
public class testController {
    @Autowired
    searchService service;
    @RequestMapping("/host")
    public String hostPages(Model model){
        model.addAttribute("isLogin",false);
        model.addAttribute("User_name","Quincy");
        model.addAttribute("numOfOrders",6);
        List<order> orderList=new ArrayList<order>();
        order order1=new order();
        order1.setCheckInTime("7月22日");
        order1.setHotelName("电子科技大学酒店");
        order1.setRoomType("豪华大床饭");

        order order2=new order();
        order2.setCheckInTime("8月22日");
        order2.setHotelName("巴拉巴拉酒店");
        order2.setRoomType("双人房");

        order order3=new order();
        order3.setCheckInTime("8月22日");
        order3.setHotelName("巴拉巴拉酒店");
        order3.setRoomType("双人房");

        orderList.add(order1);
        orderList.add(order2);
        orderList.add(order3);
        model.addAttribute("orderList",orderList);

        List<String> co=new ArrayList<String>();
        co.add("China");
        co.add("United Kindom");
        model.addAttribute("countryList",co);
       return "host";
    }


    @RequestMapping("/city")
    @ResponseBody
    public List<String> cityList(@RequestParam("country") String country, Model model, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        for (Area area:service.setArea()){
            if(area.getCoutry().equals(country)){
                List<String> city=area.getCity();
                return city;
            }
        }
        return null;


//        if(country.equals("China")){
//            service.setArea();
//            List<String> city=new ArrayList<String>();
//            city.add("hangzhou");
//            city.add("chengdu");
//            System.out.println("1");
//            return city;
//        }
//
//        return null;
    }
    @PostMapping("/post")
    public void receiveParam(String hotelKey, String countryKey,String cityKey){
        System.out.println(
                hotelKey+countryKey+cityKey
        );

    }


}
