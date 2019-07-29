package com.uestc.fff.hotel.controller;

import com.uestc.fff.hotel.service.ServiceTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class testController {
    @Autowired
    private ServiceTest serviceTest;

    @RequestMapping("/test")
    public String TestPages(Model model){
        model.addAttribute("Hotels",serviceTest.listHotel());
        return "HotelTest";
    }

    @RequestMapping("/host")
    public String hostPages(Model model){
        //model.addAttribute("Hotels",serviceTest.listHotel());
        return "host";
    }

    @RequestMapping("/booklist")
    public String BookListPages(Model model){
        model.addAttribute("Orders",serviceTest.listOrder());
        return "BookList";
    }

    @RequestMapping("/bookinfo")
    public String BookInfoPages(Model model){
        return "BookInfo";
    }

}
