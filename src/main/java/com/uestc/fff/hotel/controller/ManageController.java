
package com.uestc.fff.hotel.controller;

//import com.sun.org.apache.xpath.internal.operations.Mod;
import com.uestc.fff.hotel.domain.*;
import com.uestc.fff.hotel.service.CityManageService;
import com.uestc.fff.hotel.service.CountryManageService;
import com.uestc.fff.hotel.service.HotelManageService;
import com.uestc.fff.hotel.service.UserManageService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/manage")
public class ManageController {
    @Autowired
    private CountryManageService countryManageService ;
    @Autowired
    private CityManageService cityManageService;
    @Autowired
    private HotelManageService hotelManageService;
    @Autowired
    private UserManageService userManageService;

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

    @GetMapping("/countrytoCity")
    public String countryToCity(@RequestParam String countryCode,Model model) {
        model.addAttribute("listCity", cityManageService.findCityByCountryCode(countryCode));
        return "CityTable";
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

    /****************************/
    /******OrderManagement*******/
    /****************************/

    @GetMapping("/orderManage")
    public String orderManage(@RequestParam String hotelID, @RequestParam String hotelName, Model model) {
        OrderInfoExample orderInfoExample = new OrderInfoExample();
        orderInfoExample.createCriteria().andHotelIdEqualTo(hotelID);
        List<OrderInfo> orderInfoList = hotelManageService.listOrderInfo(orderInfoExample);
        model.addAttribute("listOrder", hotelManageService.userManagementList(orderInfoList));
        model.addAttribute("hotelName", hotelName);
        model.addAttribute("hotelID", hotelID);
        return "HotelOrderManagement";
    }

    @PostMapping("/orderSearch")
    public String orderSearch(@RequestParam String hotelName,
                              @RequestParam String hotelID,
                              @RequestParam String way,
                              @RequestParam String searchInfo,
                              Model model) {
        OrderInfoExample orderInfoExample = new OrderInfoExample();
        List<OrderInfo> orderInfoList;
        if ("按用户名查询".equals(way)) {
            UserInfoExample userInfoExample = new UserInfoExample();
            userInfoExample.createCriteria().andUserNameLike("%"+searchInfo+"%");
            UserInfo userInfo = hotelManageService.findUserByExample(userInfoExample).get(0);
            orderInfoExample.createCriteria().andUserIdEqualTo(userInfo.getUserId());
            orderInfoList = hotelManageService.listOrderInfo(orderInfoExample);
        }else {
            orderInfoExample.createCriteria().andOrderIdLike("%"+searchInfo+"%");
            orderInfoList = hotelManageService.listOrderInfo(orderInfoExample);
        }
        model.addAttribute("listOrder", hotelManageService.userManagementList(orderInfoList));
        model.addAttribute("hotelName", hotelName);
        model.addAttribute("hotelID", hotelID);
        return "HotelOrderManagement";
    }

    @GetMapping("/orderEdit")
    public String orderEdit(@RequestParam String orderID,
                            @RequestParam String hotelName,
                            @RequestParam String hotelID,
                            Model model) {
        model.addAttribute("hotelName",hotelName);
        model.addAttribute("hotelID",hotelID);
        model.addAttribute("OrderInfo", hotelManageService.findOrderbyPrimaryKey(orderID));
        return "HotelOrderEdit";
    }

    @PostMapping("/orderEdit")
    public String orderSave(@RequestParam String hotelName,
                            @RequestParam String hotelID,
                            OrderInfo orderInfo,
                            Model model) {
        hotelManageService.saveOrder(orderInfo);
        OrderInfoExample orderInfoExample = new OrderInfoExample();
        orderInfoExample.createCriteria().andHotelIdEqualTo(hotelID);
        List<OrderInfo> orderInfoList = hotelManageService.listOrderInfo(orderInfoExample);
        model.addAttribute("listOrder", hotelManageService.userManagementList(orderInfoList));
        model.addAttribute("hotelName", hotelName);
        model.addAttribute("hotelID", hotelID);
        return "HotelOrderManagement";
    }

    @GetMapping("/deleteOrder")
    @ResponseBody
    public Boolean deleteOrder(@RequestParam String orderID) {
        hotelManageService.deleteOrderByID(orderID);
        return true;
    }

    /************************************/
    /**********UserManagement**********/
    /************************************/

    @GetMapping("/user")
    public String userTable(Model model) {
        model.addAttribute("listUser", userManageService.listUser(new UserInfoExample()));
        return "UserTable";
    }

    @PostMapping("/searchUser")
    public String searchUser(@RequestParam String userName, Model model) {
        UserInfoExample userInfoExample = new UserInfoExample();
        userInfoExample.createCriteria().andUserNameLike("%" + userName + "%");
        model.addAttribute("listUser", userManageService.listUser(userInfoExample));
        return "UserTable";
    }

    @GetMapping("/deleteUser")
    @ResponseBody
    public Boolean deleteUser(@RequestParam String userCode){
        userManageService.deleteUserByUserID(userCode);
        return true;
    }

    @GetMapping("/editUser")
    public String editUser(@RequestParam String userId, Model model) {
        UserInfoExample userInfoExample = new UserInfoExample();
        userInfoExample.createCriteria().andUserIdEqualTo(userId);
        UserInfo userInfo = userManageService.listUser(userInfoExample).get(0);
        model.addAttribute("userID", userInfo.getUserId());
        model.addAttribute("listUser", userInfo);
        return "UserEdit";
    }

    @PostMapping("/editUser")
    public String updateUser(@RequestParam String userCode, UserInfo listUser) {
        UserInfoExample userInfoExample = new UserInfoExample();
        userInfoExample.createCriteria().andUserIdEqualTo(userCode);
        System.out.println(userCode);
        userManageService.updateUserById(listUser, userInfoExample);
        return "redirect:/manage/user";
    }
}
