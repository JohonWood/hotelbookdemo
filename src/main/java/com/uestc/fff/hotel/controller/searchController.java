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

import javax.servlet.http.Cookie;
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
    @RequestMapping("test")
    public String test(Model model,HttpServletRequest httpServletRequest){
        System.out.println(httpServletRequest.getParameter("hotelID"));
        return "test";
    }
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
    public String receiveParam(String hotelKey, String countryKey,String cityKey,Model model, HttpSession session,HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        List<FullSearResult> resultList=service.fullSearch(hotelKey,countryKey,cityKey);
        List<FullSearResult> fullSearResultList=new ArrayList<FullSearResult>();
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
        model.addAttribute("pagePointer",0);
        session.setAttribute("pagePointer",0);
        if(resultList==null){
            model.addAttribute("resultNum",0);
            session.setAttribute("resultList", fullSearResultList);
            session.setAttribute("originList",fullSearResultList);
            session.setAttribute("orderedList",fullSearResultList);
        }
        else{
            session.setAttribute("resultList", resultList);
            session.setAttribute("originList",resultList);
            session.setAttribute("orderedList",resultList);
            if(resultList.size()<10){
                for(int i=0;i<resultList.size();i++){
                    fullSearResultList.add(resultList.get(i));
                }
            }
            else{
                for(int i=0;i<10;i++){
                    fullSearResultList.add(resultList.get(i));
                }
            }
            Cookie cookie = new Cookie("resultSession", session.getId());
            cookie.setMaxAge(86400);//保存一天
            httpServletResponse.addCookie(cookie);


            model.addAttribute("resultNum",resultList.size());
            model.addAttribute("resultList",fullSearResultList);
            model.addAttribute("fullResult",resultList);
        }

        return "searchResult";
    }
    @RequestMapping("/down")
    @ResponseBody
    public List<FullSearResult>  resultMap( Model model, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,HttpSession session) throws UnsupportedEncodingException {
        int indexOfList=Integer.parseInt(httpServletRequest.getParameter("indexOfList"));
        List<FullSearResult> fullSearResultList=(List<FullSearResult>) session.getAttribute("resultList");
        List<FullSearResult> resultList=new ArrayList<FullSearResult>();
        if (indexOfList + 10>fullSearResultList.size()) {
            for(int i=indexOfList;i<fullSearResultList.size();i++){
                resultList.add(fullSearResultList.get(i));
            }
        }
        else{
            for(int i=indexOfList;i<indexOfList+10;i++){
                resultList.add(fullSearResultList.get(i));
            }
        }
        return resultList;
    }

    @RequestMapping("/filter")
    @ResponseBody
    public List<FullSearResult> filterResult(Model model ,HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse,HttpSession session){
        String lowPrice=httpServletRequest.getParameter("lowPrice");
        String highPrice=httpServletRequest.getParameter("highPrice");
        String highGrade=httpServletRequest.getParameter("highGrade");
        String lowGrade=httpServletRequest.getParameter("lowGrade");
        String rating=httpServletRequest.getParameter("rating");
        List<FullSearResult> fullSearResultList=(List<FullSearResult>) session.getAttribute("orderedList");
        List<FullSearResult> resultList=service.filterPrice(lowPrice,highPrice,fullSearResultList);
        resultList=service.filterGrade(lowGrade,highGrade,resultList);
        resultList=service.filterRating(rating,resultList);
        session.setAttribute("resultList",resultList);
        return resultList;
    }
    @RequestMapping("/order")
    @ResponseBody
    public List<FullSearResult> orderResult(Model model ,HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse,HttpSession session){
        String orderChoose=httpServletRequest.getParameter("orderChoose");

        List<FullSearResult> resultList=(List<FullSearResult>) session.getAttribute("resultList");
        List<FullSearResult> orderedList=(List<FullSearResult>) session.getAttribute("orderedList");
        if(orderChoose.equals("1")){
            resultList=service.orderRating(resultList);
            orderedList=service.orderRating(orderedList);

        }
        else if(orderChoose.equals("2")){
            resultList=service.orderGrade(resultList);
            orderedList=service.orderGrade(orderedList);

        }
        else if(orderChoose.equals("3.5")){
            resultList=service.orderPriceHTL(resultList);
            orderedList=service.orderPriceHTL(orderedList);

        }
        else if(orderChoose.equals("3")){
            resultList=service.orderPriceLTH(resultList);
            orderedList=service.orderPriceLTH(orderedList);
        }
        session.setAttribute("resultList",resultList);
        session.setAttribute("orderedList",orderedList);
        return resultList;
    }

    @RequestMapping("/location")
    @ResponseBody
    public List<FullSearResult> locResult(Model model ,HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse,HttpSession session){
        List<FullSearResult> resultList=(List<FullSearResult>) session.getAttribute("resultList");
        return resultList;
    }

    @RequestMapping("/searchList")
    @ResponseBody
    public List<FullSearResult> searchList(Model model,HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse,HttpSession session) throws UnsupportedEncodingException {
        String hotelKey=httpServletRequest.getParameter("hotelKey");
        String countryKey=URLDecoder.decode(httpServletRequest.getParameter("countryKey"),"UTF-8");
        String cityKey=URLDecoder.decode(httpServletRequest.getParameter("cityKey"),"UTF-8");
        System.out.println(hotelKey+countryKey+cityKey);
        List<FullSearResult> resultList=service.fullSearch(hotelKey,countryKey,cityKey);
        List<FullSearResult> fullSearResultList=new ArrayList<FullSearResult>();
        if(resultList==null){
            session.setAttribute("resultList", fullSearResultList);
            session.setAttribute("originList",fullSearResultList);
            session.setAttribute("orderedList",fullSearResultList);
            return fullSearResultList;
        }
        else {
            session.setAttribute("resultList", resultList);
            session.setAttribute("originList", resultList);
            session.setAttribute("orderedList",resultList);
        }

        return resultList;
    }

    @RequestMapping("/pageInit")
    @ResponseBody
    public SearchSession pageInit(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse,HttpSession session){
        SearchSession searchSession=new SearchSession();
        if((int)session.getAttribute("pagePointer")==0){
            searchSession.setResultList(null);
        }

        searchSession.setPagePointer((int)session.getAttribute("pagePointer"));
        return searchSession;
    }

}
