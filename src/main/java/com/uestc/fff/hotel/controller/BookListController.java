package com.uestc.fff.hotel.controller;

//import com.sun.tools.corba.se.idl.constExpr.Or;
import com.uestc.fff.hotel.domain.*;
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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

@Controller
@RequestMapping("/mybook")
public class BookListController {
    @Autowired
    private BookListService serviceBook;
    @Autowired
    private searchService serviceSearch;

/******************************************************订单列表页面******************************************************/
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

/*******************************************************订单详情页面******************************************************/

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
                model.addAttribute("RoomAll",RoomNumInfo);
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
    /****************************************退房操作*****************************************/
    @PostMapping("/checkout")
    public void CheckOut(OrderInfo orderInfo, OrderTR orderTR, HttpServletResponse response){
        //serviceBook.DeleteOrder(oid);
        String rid1 = orderTR.getRoomId1();
        String rid2 = orderTR.getRoomId2();
        String rid3 = orderTR.getRoomId3();
        serviceBook.UpdateDays(orderInfo.getOrderId());
        serviceBook.IncreaseLastRooms(rid1);
        if(!rid2.equals("")){
            serviceBook.IncreaseLastRooms(orderTR.getRoomId2());
        }
        if(!rid3.equals("")){
            serviceBook.IncreaseLastRooms(orderTR.getRoomId3());
        }

        response.setContentType("text/html;charset=utf-8");
        PrintWriter writer = null;
        try {
            writer = response.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.write("<script> alert('退房成功'); location.href='/mybook/booklist';</script>");
        writer.flush();
    }

/*******************************************************酒店详情页面******************************************************/

    @RequestMapping("/book")
    public String BookPages(@RequestParam("hotelID") String hid, Model model, HttpSession session){
        UserInfo userInfotest = (UserInfo) session.getAttribute("user");
        boolean islogin;

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
        model.addAttribute("Hotels",serviceBook.HotelInfomation(hid));
        model.addAttribute("RoomList", serviceBook.RoomInfoList(hid));

        return "Book";
    }

/*******************************************************确认订单页面******************************************************/

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
        PrintWriter writer = null;

        try{
            writer = response.getWriter();
            if (userInfotest == null) {
                writer.write("<script> alert('请先登录');</script>");
                return "login";
            }
        }catch (IOException e) {
            e.printStackTrace();
        }

        OrderInfo orderInfo = new OrderInfo();
        OrderTR orderTR = new OrderTR();

        String hid = hotelInfo.getHotelId();
        String uid = userInfotest.getUserId();

        model.addAttribute("User_name",userInfotest.getLoginName());
        model.addAttribute("numOfOrders",serviceSearch.countOrder(userInfotest.getUserId()));
        List<order> orderList=serviceSearch.orderList(userInfotest.getUserId());
        model.addAttribute("orderList",orderList);
        model.addAttribute("isLogin",true);
        List<String> listOfCountry=serviceSearch.searchCountry();
        model.addAttribute("countryList",listOfCountry);

        model.addAttribute("Users", serviceBook.UserInfomation(uid));
        model.addAttribute("Hotels",serviceBook.HotelInfomation(hid));

        RoomInfo r1 = serviceBook.RoomByType(hid,Se1);
        Float price = r1.getRoomFee();//计算总价
        model.addAttribute("Type1", r1);
        if(r1.getRoomLast()==0){
            writer.write("<script> alert('该房型已被预定完，请选择其他房型'); history.go(-1);</script>");
            writer.flush();
        }

        orderTR.setRoomId1(r1.getRoomid());
        if(!Se2.equals("")) {
            RoomInfo r2 = serviceBook.RoomByType(hid,Se2);
            if(r2.getRoomLast()==0){
                writer.write("<script> alert('该房型已被预定完，请选择其他房型'); history.go(-1);</script>");
                writer.flush();
            }
            price += r2.getRoomFee();
            orderTR.setRoomId2(r2.getRoomid());
            model.addAttribute("Type2", r2);
        }
        else { model.addAttribute("Type2", false); }
        if(!Se3.equals("")) {
            RoomInfo r3 = serviceBook.RoomByType(hid,Se3);
            if(r3.getRoomLast()==0){
                writer.write("<script> alert('该房型已被预定完，请选择其他房型'); history.go(-1);</script>");
                writer.flush();
            }
            price += r3.getRoomFee();
            orderTR.setRoomId3(r3.getRoomid());
            model.addAttribute("Type3", r3);
        }
        else { model.addAttribute("Type3", false); }
        price *= RoomD;

        String d1 = RoomDate.substring(0,5);
        String d2 = RoomDate.substring(6);
        String cdate = d2+'/'+d1+" 00:00:00";
        //用于显示确认订单信息
        model.addAttribute("RoomNums",RoomN);
        model.addAttribute("CheckinDate",cdate);
        model.addAttribute("CusNum", RoomP);
        model.addAttribute("LiveDay", RoomD);
        model.addAttribute("TotalPrice", price);

        //为创建订单作准备
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//格式时间对象
        Date date1 = new Date();
        try{
            date1=sdf.parse(cdate);
        }catch(ParseException e){}
        orderInfo.setHotelId(hid);
        orderInfo.setRoomNum(RoomN);
        orderInfo.setCheckinTime(date1);
        orderInfo.setOrderTotalFee(price);
        orderInfo.setCustomNum(RoomP);
        orderInfo.setDays(RoomD);

        model.addAttribute("OrderInfo",orderInfo);
        model.addAttribute("OtrInfo",orderTR);

        return "BookConfirm";
    }
    /*****************************************下单操作*****************************************/
    @PostMapping("/bookAction")
    public void BookAction(OrderInfo orderInfo0, OrderTR orderTR0,
                             HttpSession session, HttpServletResponse response, Model model){
        UserInfo userInfotest = (UserInfo) session.getAttribute("user");
        String uid = userInfotest.getUserId();
        OrderInfo orderInfo = new OrderInfo();
        OrderTR orderTR = new OrderTR();
        Date date2 = new Date();

        model.addAttribute("OrderWithHotel",serviceBook.MyListOrder(userInfotest.getUserId()));

        model.addAttribute("User_name",userInfotest.getLoginName());
        model.addAttribute("numOfOrders",serviceSearch.countOrder(userInfotest.getUserId()));
        List<order> orderList=serviceSearch.orderList(userInfotest.getUserId());
        model.addAttribute("orderList",orderList);
        model.addAttribute("isLogin",true);
        List<String> listOfCountry=serviceSearch.searchCountry();
        model.addAttribute("countryList",listOfCountry);

        //orderId自动生成
        CreateUuid16 createUuid16 = new CreateUuid16();
        createUuid16.setUuid16();
        String oid = createUuid16.uuid16;

        String rid1 = orderTR0.getRoomId1();
        String rid2 = orderTR0.getRoomId2();
        String rid3 = orderTR0.getRoomId3();

        orderInfo.setOrderId(oid);
        orderInfo.setUserId(uid);
        orderInfo.setHotelId(orderInfo0.getHotelId());
        orderInfo.setRoomNum(orderInfo0.getRoomNum());
        orderInfo.setCreateTime(date2);
        orderInfo.setOrderTotalFee(orderInfo0.getOrderTotalFee());
        orderInfo.setCheckinTime(orderInfo0.getCheckinTime());
        orderInfo.setCustomNum(orderInfo0.getCustomNum());
        orderInfo.setDays(orderInfo0.getDays());

        orderTR.setOrderId(oid);
        orderTR.setRoomId1(rid1);
        orderTR.setRoomId2(rid2);
        orderTR.setRoomId3(rid3);

        serviceBook.SaveOrder(orderInfo);
        serviceBook.SaveOrderTR(orderTR);
        serviceBook.DecreaseLastRooms(rid1);
        if(!rid2.equals("")){
            serviceBook.DecreaseLastRooms(rid2);
        }
        if(!rid3.equals("")){
            serviceBook.DecreaseLastRooms(rid3);
        }

        response.setContentType("text/html;charset=utf-8");
        PrintWriter writer = null;
        try {
            writer = response.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.write("<script> alert('预定成功'); location.href='/mybook/booklist';</script>");
        writer.flush();
    }
}
