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

    @RequestMapping("/map")
    public String hostPages(Model model){
        String test;
        test = "hello";
        model.addAttribute("tests",test);
        return "HotelMapTest";
    }

}
