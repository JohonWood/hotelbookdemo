package com.uestc.fff.hotel.controller;

import com.uestc.fff.hotel.domain.*;
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
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/504")
public class searchController {
    @Autowired
    searchService service;
    @RequestMapping("/host")
    public String hostPages(Model model, HttpSession session){
        //service.selectArea();
        boolean islogin;
        UserInfo userInfotest = (UserInfo) session.getAttribute("user");
        if (userInfotest == null) { islogin = false; }
        else  {
            islogin = true;
            model.addAttribute("User_name",userInfotest.getLoginName());
            model.addAttribute("numOfOrders",service.countOrder(userInfotest.getUserId()));
            List<order> orderList=service.orderList(userInfotest.getUserId());
            model.addAttribute("orderList",orderList);
        }
        model.addAttribute("isLogin",islogin);

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
    public String receiveParam(String hotelKey, String countryKey,String cityKey,Model model, HttpSession session){
        List<FullSearResult> resultList=service.fullSearch(hotelKey,countryKey,cityKey);
        boolean islogin;
        UserInfo userInfotest = (UserInfo) session.getAttribute("user");
        if (userInfotest == null) { islogin = false; }
        else  {
            islogin = true;
            model.addAttribute("User_name",userInfotest.getLoginName());
            model.addAttribute("numOfOrders",service.countOrder(userInfotest.getUserId()));
            List<order> orderList=service.orderList(userInfotest.getUserId());
            model.addAttribute("orderList",orderList);
        }
        model.addAttribute("isLogin",islogin);
        List<String> listOfCountry=service.searchCountry();
        model.addAttribute("countryList",listOfCountry);
        if(resultList==null){
            model.addAttribute("resultNum",0);
        }
        else{
            model.addAttribute("resultNum",resultList.size());
            model.addAttribute("resultList",resultList);
        }

        return "searchResult";
    }
    @RequestMapping("/test")
    @ResponseBody
    public List<FullSearResult>  resultMap( Model model, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws UnsupportedEncodingException {
        List<FullSearResult> tets=service.fullSearch("香格里拉","中国","成都");
//        for(FullSearResult fullSearResult :tets){
//            System.out.println(fullSearResult.getHotelName());
//        }
//        Map text=new HashMap();
//        text.put("text1","sdadasdasd");
//        text.put("text2","asddfdqwere");
        return tets;

    }


}
