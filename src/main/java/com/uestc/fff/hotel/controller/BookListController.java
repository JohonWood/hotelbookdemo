package com.uestc.fff.hotel.controller;

import com.uestc.fff.hotel.domain.HotelInfo;
import com.uestc.fff.hotel.domain.OrderTR;
import com.uestc.fff.hotel.domain.UserInfo;
import com.uestc.fff.hotel.domain.order;
import com.uestc.fff.hotel.service.BookListService;
import com.uestc.fff.hotel.service.searchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

        try{
            PrintWriter writer = response.getWriter();
            if (userInfotest == null) {
                writer.write("<script> alert('请先登录');</script>");
                return "login";
            }
            else {
                model.addAttribute("OrderWithHotel",serviceBook.MyListOrder(userInfotest.getUserId()));

                model.addAttribute("User_name",userInfotest.getLoginName());
                model.addAttribute("numOfOrders",serviceSearch.countOrder(userInfotest.getUserId()));
                List<order> orderList=serviceSearch.orderList(userInfotest.getUserId());
                model.addAttribute("orderList",orderList);
                model.addAttribute("isLogin",true);
                List<String> listOfCountry=serviceSearch.searchCountry();
                model.addAttribute("countryList",listOfCountry);
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
        boolean islogin;

        try{
            PrintWriter writer = response.getWriter();
            if (userInfotest == null) {
                writer.write("<script> alert('请先登录');</script>");
                return "login";
            }
            else {
                String uid = serviceBook.OrderInfomation(oid).getUserId();
                String hid = serviceBook.OrderInfomation(oid).getHotelId();

                OrderTR RoomNumInfo = serviceBook.RoomNumInfo(oid);
                String rid1 = RoomNumInfo.getRoomId1();
                String rid2 = RoomNumInfo.getRoomId2();
                String rid3 = RoomNumInfo.getRoomId3();
                model.addAttribute("Room1",serviceBook.RoomInfomation(rid1));
                if(rid2!=null) { model.addAttribute("Room2", serviceBook.RoomInfomation(rid2)); }
                else { model.addAttribute("Room2", false); }
                if(rid3!=null) { model.addAttribute("Room3", serviceBook.RoomInfomation(rid3)); }
                else { model.addAttribute("Room3", false); }

                model.addAttribute("Hotels",serviceBook.HotelInfomation(hid));
                model.addAttribute("Orders",serviceBook.OrderInfomation(oid));
                model.addAttribute("Users", serviceBook.UserInfomation(uid));
                model.addAttribute("User_name",userInfotest.getLoginName());
                model.addAttribute("numOfOrders",serviceSearch.countOrder(userInfotest.getUserId()));
                List<order> orderList=serviceSearch.orderList(userInfotest.getUserId());
                model.addAttribute("orderList",orderList);
                model.addAttribute("isLogin",true);
                List<String> listOfCountry=serviceSearch.searchCountry();
                model.addAttribute("countryList",listOfCountry);
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
    public String BookPages(Model model, HttpSession session){
        UserInfo userInfotest = (UserInfo) session.getAttribute("user");
        boolean islogin;
        String hid = "108387";

        if (userInfotest == null) { islogin = false; }
        else  {
            islogin = true;
            model.addAttribute("User_name",userInfotest.getLoginName());
            model.addAttribute("numOfOrders",serviceSearch.countOrder(userInfotest.getUserId()));
            List<order> orderList=serviceSearch.orderList(userInfotest.getUserId());
            model.addAttribute("orderList",orderList);
        }

        model.addAttribute("isLogin",islogin);
        List<String> listOfCountry=serviceSearch.searchCountry();
        model.addAttribute("countryList",listOfCountry);
        model.addAttribute("Hotels",serviceBook.HotelInfomation("108573"));
        model.addAttribute("RoomList", serviceBook.RoomInfoList(hid));

        return "Book";
    }

    @RequestMapping("/bookconfirm")
    public String BookConfirmPages(HotelInfo hotelInfo,
                                   @RequestParam("RoomN") int RoomN,
                                   @RequestParam("Se1") String Se1,
                                   @RequestParam("Se2") String Se2,
                                   @RequestParam("Se3") String Se3,
                                   @RequestParam("RoomD") int RoomD,
                                   @RequestParam("RoomP") int RoomP,
                                   @RequestParam("RoomDate") String RoomDate,
                                   Model model, HttpSession session, HttpServletResponse response){
        UserInfo userInfotest = (UserInfo) session.getAttribute("user");
        response.setContentType("text/html;charset=utf-8");
        String hid = hotelInfo.getHotelId();

        try{
            PrintWriter writer = response.getWriter();
            if (userInfotest == null) {
                writer.write("<script> alert('请先登录');</script>");
                return "login";
            }
            else {

            }
        }catch (IOException e) {
            e.printStackTrace();
        }

        model.addAttribute("User_name",userInfotest.getLoginName());
        model.addAttribute("numOfOrders",serviceSearch.countOrder(userInfotest.getUserId()));
        List<order> orderList=serviceSearch.orderList(userInfotest.getUserId());
        model.addAttribute("orderList",orderList);
        model.addAttribute("isLogin",true);
        List<String> listOfCountry=serviceSearch.searchCountry();
        model.addAttribute("countryList",listOfCountry);
        model.addAttribute("Hotels",serviceBook.HotelInfomation(hid));
        //model.addAttribute("RoomList", serviceBook.RoomInfoList(hid));
        model.addAttribute("numOfAllOrders", serviceBook.CountAllOrders());

        return "BookConfirm";
    }
}
