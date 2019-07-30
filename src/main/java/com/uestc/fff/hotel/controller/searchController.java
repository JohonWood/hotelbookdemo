package com.uestc.fff.hotel.controller;

import com.uestc.fff.hotel.domain.Area;
import com.uestc.fff.hotel.domain.SearchResult;
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
        model.addAttribute("isLogin",true);
        model.addAttribute("User_name","Quincy");
        model.addAttribute("numOfOrders",service.countOrder("1"));
        List<order> orderList=service.orderList("1");
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
    public String receiveParam(String hotelKey, String countryKey,String cityKey,Model model){
        List<SearchResult> resultList=service.searchKey(hotelKey,countryKey,cityKey);
        model.addAttribute("isLogin",true);
        model.addAttribute("User_name","Quincy");
        model.addAttribute("numOfOrders",service.countOrder("1"));
        List<order> orderList=service.orderList("1");
        model.addAttribute("orderList",orderList);
        List<String> listOfCountry=service.searchCountry();
        model.addAttribute("countryList",listOfCountry);
        model.addAttribute("resultNum",resultList.size());
        model.addAttribute("resultList",resultList);
        return "searchResult";
    }


}
