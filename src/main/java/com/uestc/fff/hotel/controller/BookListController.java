package com.uestc.fff.hotel.controller;

import com.uestc.fff.hotel.domain.UserInfo;
import com.uestc.fff.hotel.service.BookListService;
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

@Controller
@RequestMapping("/mybook")
public class BookListController {
    @Autowired
    private BookListService serviceBook;

    @RequestMapping("/booklist")
    public String BookListPages(Model model, HttpSession session, HttpServletResponse response) throws IOException {
        UserInfo userInfotest = (UserInfo) session.getAttribute("user");
        response.setContentType("text/html;charset=utf-8");
        try{
            PrintWriter writer = response.getWriter();
            if (userInfotest == null) { writer.write("<script> alert('请先登录'); history.go(-1);</script>"); }
            else { model.addAttribute("OrderWithHotel",serviceBook.MyListOrder(userInfotest.getUserId())); }
        }catch (IOException e){
            e.printStackTrace();
        }
        return "BookList";
    }

    @RequestMapping("/bookinfo")
    public String BookInfoPages(Model model){
        //UserInfo userInfotest = (UserInfo) session.getAttribute("user");
        model.addAttribute("Hotels",serviceBook.HotelInfomation("103872"));
        model.addAttribute("Rooms",serviceBook.RoomInfomation("170"));
        model.addAttribute("Orders",serviceBook.OrderInfomation("1"));
        model.addAttribute("Users", serviceBook.UserInfomation("1"));
        return "BookInfo";
    }

    @GetMapping("/checkout")
    @ResponseBody
    public Boolean CheckOut(@RequestParam("oid") String oid){
        serviceBook.DeleteOrder(oid);
        return true;
    }

}