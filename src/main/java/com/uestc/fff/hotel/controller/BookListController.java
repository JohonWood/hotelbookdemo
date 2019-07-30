package com.uestc.fff.hotel.controller;

import com.uestc.fff.hotel.service.BookListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class BookListController {
    @Autowired
    private BookListService serviceBook;

    @RequestMapping("/booklist")
    public String BookListPages(Model model){
        model.addAttribute("OrderWithHotel",serviceBook.MyListOrder("510105199907131778"));
        return "BookList";
    }

    @RequestMapping("/bookinfo")
    public String BookInfoPages(Model model){
        model.addAttribute("Hotels",serviceBook.HotelInfomation("103872"));
        model.addAttribute("Rooms",serviceBook.RoomInfomation("01"));
        model.addAttribute("Orders",serviceBook.OrderInfomation("1515626"));
        model.addAttribute("Users", serviceBook.UserInfomation("510105199907131778"));
        return "BookInfo";
    }

}