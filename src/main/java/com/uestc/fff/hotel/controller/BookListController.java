package com.uestc.fff.hotel.controller;

import com.uestc.fff.hotel.domain.UserInfo;
import com.uestc.fff.hotel.domain.order;
import com.uestc.fff.hotel.service.BookListService;
import com.uestc.fff.hotel.service.searchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@Controller
@RequestMapping("/mybook")
public class BookListController {
    @Autowired
    private BookListService serviceBook;
    @Autowired
    private searchService serviceSearch;

    @RequestMapping("/booklist")
    public String BookListPages(Model model, HttpSession session, HttpServletResponse response){
        UserInfo userInfotest = (UserInfo) session.getAttribute("user");
        response.setContentType("text/html;charset=utf-8");

        model.addAttribute("isLogin",true);
        model.addAttribute("User_name","Quincy");
        model.addAttribute("numOfOrders",serviceSearch.countOrder("1"));
        List<order> orderList=serviceSearch.orderList("1");
        model.addAttribute("orderList",orderList);
        List<String> listOfCountry=serviceSearch.searchCountry();
        model.addAttribute("countryList",listOfCountry);

        try{
            PrintWriter writer = response.getWriter();
            if (userInfotest == null) {
                writer.write("<script> alert('请先登录'); location.href='/user/login';</script>");
            }
            else {
                model.addAttribute("OrderWithHotel",serviceBook.MyListOrder(userInfotest.getUserId()));
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        return "BookList";
    }

    @RequestMapping("/bookinfo")
    public String BookInfoPages(@RequestParam("oid") String oid, Model model, HttpSession session, HttpServletResponse response){
        UserInfo userInfotest = (UserInfo) session.getAttribute("user");
        response.setContentType("text/html;charset=utf-8");

        model.addAttribute("isLogin",true);
        model.addAttribute("User_name","Quincy");
        model.addAttribute("numOfOrders",serviceSearch.countOrder("1"));
        List<order> orderList=serviceSearch.orderList("1");
        model.addAttribute("orderList",orderList);
        List<String> listOfCountry=serviceSearch.searchCountry();
        model.addAttribute("countryList",listOfCountry);
        try{
            PrintWriter writer = response.getWriter();
            if (userInfotest == null) {
                writer.write("<script> alert('请先登录'); location.href='/user/login';</script>");
            }
            else {
                    String uid = serviceBook.OrderInfomation(oid).getUserId();
                    String hid = serviceBook.OrderInfomation(oid).getHotelId();
                    String rid = serviceBook.OrderInfomation(oid).getRoomid();
                    model.addAttribute("Hotels",serviceBook.HotelInfomation(hid));
                    model.addAttribute("Rooms",serviceBook.RoomInfomation(rid));
                    model.addAttribute("Orders",serviceBook.OrderInfomation(oid));
                    model.addAttribute("Users", serviceBook.UserInfomation(uid));
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        return "BookInfo";
    }

    @GetMapping("/checkout")
    @ResponseBody
    public Boolean CheckOut(@RequestParam("oid") String oid){
        serviceBook.DeleteOrder(oid);
        return true;
    }

    @RequestMapping("/book")
    public String BookPages(Model model){
        model.addAttribute("isLogin",true);
        model.addAttribute("User_name","Quincy");
        model.addAttribute("numOfOrders",serviceSearch.countOrder("1"));
        List<order> orderList=serviceSearch.orderList("1");
        model.addAttribute("orderList",orderList);
        List<String> listOfCountry=serviceSearch.searchCountry();
        model.addAttribute("countryList",listOfCountry);
        model.addAttribute("Hotels",serviceBook.HotelInfomation("108573"));
        return "Book";
    }
}