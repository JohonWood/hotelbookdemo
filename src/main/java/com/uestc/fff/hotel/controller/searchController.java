package com.uestc.fff.hotel.controller;

import com.uestc.fff.hotel.domain.Area;
import com.uestc.fff.hotel.domain.order;
import com.uestc.fff.hotel.service.searchService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/test")
public class searchController {
    @Autowired
    searchService service;
    @RequestMapping("/host")
    public String hostPages(Model model){
        //service.selectArea();
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
        List<String> listOfCountry=service.searchCountry();
        model.addAttribute("countryList",listOfCountry);
       return "host";
    }


    @RequestMapping("/city")
    @ResponseBody
    public List<String> cityList( Model model, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws UnsupportedEncodingException {
        String country = URLDecoder.decode(httpServletRequest.getParameter("country"),"UTF-8");
        return service.searchCity(country);

    }
    @PostMapping("/post")
    public void receiveParam(String hotelKey, String countryKey,String cityKey){
        System.out.println(
                hotelKey+countryKey+cityKey
        );

    }


}
