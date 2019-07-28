package com.uestc.fff.hotel.controller;

import com.uestc.fff.hotel.service.CountryManageService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/deleteCountry")
    @ResponseBody
    public Boolean deleteCountry(@RequestParam("countryCode") String code){
        countryManageService.deleteCountryByCode(code);
        return true;
    }

    @PostMapping("/search")
    public String searchCountry(@RequestParam("countryName") String countryName,Model model){
        countryName = "%" + countryName + "%";
        model.addAttribute("listCountry",countryManageService.searchCountry(countryName));
        return "CountryTable";
    }
}
