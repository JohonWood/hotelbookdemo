
package com.uestc.fff.hotel.controller;

import com.uestc.fff.hotel.domain.*;
import com.uestc.fff.hotel.service.CityManageService;
import com.uestc.fff.hotel.service.CountryManageService;
import com.uestc.fff.hotel.service.HotelManageService;
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
    @Autowired
    private CityManageService cityManageService;
    @Autowired
    private HotelManageService hotelManageService;

    /************************************/
    /**********CountryManagement*********/
    /************************************/
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

    @PostMapping("/searchCountry")
    public String searchCountry(@RequestParam("countryName") String countryName,Model model){
        model.addAttribute("listCountry",countryManageService.searchCountry(countryName));
        return "CountryTable";
    }

    @GetMapping("/editCountry")
    public String editCountry(@RequestParam("countryCode") String countryCode, Model model) {
        Country country = countryManageService.findCountryByCountryCode(countryCode);
        model.addAttribute("country", country);
        return "CountryEdit";
    }

    @PostMapping("/editCountry")
    public String updateCountry(Country country) {
        countryManageService.updateCountry(country);
        return "redirect:/manage/country";
    }

    @GetMapping("/addCountry")
    public String addCountry(Model model){
        model.addAttribute("country",new Country());
        return "CountryAdd";
    }

    @PostMapping("/addCountry")
    public String saveCountry(Country country) {
        countryManageService.saveCountry(country);
        return "redirect:/manage/country";
    }


    /************************************/
    /**********CityManagement************/
    /************************************/
    @RequestMapping("/city")
    public String listCity(Model model){
        model.addAttribute("listCity", cityManageService.listCity());
        return "CityTable";
    }

    @GetMapping("/deleteCity")
    @ResponseBody
    public Boolean deleteCity(@RequestParam("cityID") String cityID){
        cityManageService.deleteCityByID(cityID);
        return true;
    }

    @PostMapping("/searchCity")
    public String searchCity(@RequestParam("cityName") String cityName, Model model){
        model.addAttribute("listCity",cityManageService.searchCity(cityName));
        return "CityTable";
    }

    @GetMapping("/editCity")
    public String editCity(@RequestParam("cityID") String cityID, Model model) {
        City city = cityManageService.findCountryByCountryCode(cityID);
        model.addAttribute("listCity", city);
        return "CityEdit";
    }

    @PostMapping("/editCity")
    public String updateCity(City city) {
        cityManageService.updateCountry(city);
        return "redirect:/manage/city";
    }

    @GetMapping("/addCity")
    public String addCity(Model model) {
        model.addAttribute("listCity",new City());
        return "CityAdd";
    }

    @PostMapping("/addCity")
    public String saveCity(City city){
        cityManageService.saveCity(city);
        return "redirect:/manage/city";
    }

    @GetMapping("/CityHotel")
    public String cityListHotel(@RequestParam("cityID") String cityID, Model model) {
        HotelInfoExample hotelInfoExample = new HotelInfoExample();
        hotelInfoExample.createCriteria().andCityIdEqualTo(cityID);
        model.addAttribute("listHotel", hotelManageService.listHotel(hotelInfoExample));
        return "HotelTable";
    }

    /************************************/
    /**********HotelManagement**********/
    /************************************/
    @RequestMapping("/hotel")
    public String listHotel(Model model){
        model.addAttribute("listHotel", hotelManageService.listHotel(new HotelInfoExample()));
        return "HotelTable";
    }

    @PostMapping("/searchHotel")
    public String searchHotel(@RequestParam("hotelName") String hotelName,Model model) {
        model.addAttribute("listHotel", hotelManageService.searchHotel(hotelName));
        return "HotelTable";
    }

    @GetMapping("/descriptionCity")
    public String descriptionCity(@RequestParam("hotelID") String hotelID, Model model) {
        model.addAttribute("hotel",hotelManageService.searchAHotel(hotelID));
        return "HotelDescription";
    }

    @GetMapping("/room")
    public String roomManagement(@RequestParam("hotelID") String hotelID, @RequestParam("hotelName") String hotelName, Model model) {
        RoomInfoExample roomInfoExample = new RoomInfoExample();
        roomInfoExample.createCriteria().andHotelIdEqualTo(hotelID);
        model.addAttribute("listRoom", hotelManageService.listRoom(roomInfoExample));
        model.addAttribute("hotelName", hotelName);
        model.addAttribute("hotelID", hotelID);
        return "HotelRoom";
    }

    @GetMapping("/addRoom")
    public String addRoom(@RequestParam("hotelName") String hotelName,@RequestParam("hotelID") String hotelID,Model model){
        RoomInfo roomInfo = new RoomInfo();
        roomInfo.setHotelId(hotelID);
        roomInfo.setRoomStatus(false);
        model.addAttribute("room",roomInfo);
        model.addAttribute("hotelName", hotelName);
        return "HotelAddRoom";
    }

    @PostMapping("/addRoom")
    public String saveRoom(RoomInfo roomInfo,@RequestParam("hotelName") String hotelName,Model model) {
        String hotelID = roomInfo.getHotelId();
        RoomInfoExample roomInfoExample = new RoomInfoExample();
        roomInfoExample.createCriteria().andHotelIdEqualTo(hotelID);
        hotelManageService.saveRoom(roomInfo);
        model.addAttribute("listRoom", hotelManageService.listRoom(roomInfoExample));
        model.addAttribute("hotelName", hotelName);
        model.addAttribute("hotelID", hotelID);
        return "HotelRoom";
    }

    @GetMapping("/editRoom")
    public String editRoom(@RequestParam String roomID,
                           @RequestParam String hotelName,
                           Model model) {
        model.addAttribute("hotelName", hotelName);
        model.addAttribute("room", hotelManageService.findRoomByPrimaryKey(roomID));
        return "HotelEditRoom";
    }

    @PostMapping("/editRoom")
    public String updateRoom(@RequestParam String hotelName, RoomInfo room, Model model) {
        hotelManageService.updateRoom(room);
        String hotelID = room.getHotelId();
        System.out.println(room.getRoomid());
        RoomInfoExample roomInfoExample = new RoomInfoExample();
        roomInfoExample.createCriteria().andHotelIdEqualTo(hotelID);
        model.addAttribute("listRoom", hotelManageService.listRoom(roomInfoExample));
        model.addAttribute("hotelName", hotelName);
        model.addAttribute("hotelID", hotelID);
        return "HotelRoom";
    }

    @GetMapping("/deleteRoom")
    @ResponseBody
    public Boolean deleteRoom(@RequestParam String roomID){
        hotelManageService.deleteRoomByID(roomID);
        return true;
    }
}
