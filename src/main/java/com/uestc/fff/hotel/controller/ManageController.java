package com.uestc.fff.hotel.controller;

import com.uestc.fff.hotel.domain.Country;
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

    @RequestMapping("/city")
    public String findCity(Model model){
        System.out.println("city");
        return "CountryTable";
    }

    @RequestMapping("/hotel")
    public String findHotel(Model model){
        System.out.println("hotel");
        return "CountryTable";
    }

    @GetMapping("/deleteCountry")
    @ResponseBody
    public Boolean deleteCountry(@RequestParam("countryCode") String code){
        countryManageService.deleteCountryByCode(code);
        return true;
    }

    @PostMapping("/searchCountry")
    public String searchCountry(@RequestParam("countryName") String countryName,Model model){
        countryName = "%" + countryName + "%";
        model.addAttribute("listCountry",countryManageService.searchCountry(countryName));
        return "CountryTable";
    }

    @GetMapping("/editCountry")
    public String editCountry(@RequestParam("countryCode") String countryCode, Model model) {
        Country country = countryManageService.findCountryByCountryCode(countryCode);
        model.addAttribute("country", country);
        return "editCountry";
    }

    @PostMapping("/editCountry")
    public String updateCountry(Country country) {
        countryManageService.updateCountry(country);
        return "redirect:/manage/country";
    }

    @GetMapping("/addCountry")
    public String addCountry(Model model){
        model.addAttribute("country",new Country());
        return "addCountry";
    }

    @PostMapping("/addCountry")
    public String saveCountry(Country country) {
        countryManageService.saveCountry(country);
        return "redirect:/manage/country";
    }
}
