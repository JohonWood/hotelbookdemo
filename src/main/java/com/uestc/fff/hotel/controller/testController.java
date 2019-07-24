package com.uestc.fff.hotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class testController {
    @RequestMapping("/host")
    public String hostPages(Model model){
        return "host";
    }

}
