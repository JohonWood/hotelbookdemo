package com.uestc.fff.hotel.controller;

import com.uestc.fff.hotel.service.CountryManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/manage")
public class ManageController {
    @Autowired
    private CountryManageService countryManageService ;

    @RequestMapping("/country")
    public String findCountry(Model model){
        model.addAttribute("listCountry",countryManageService.listCountry());
        return "CountryTable";
    }
}
