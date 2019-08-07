package com.uestc.fff.hotel.controller;

import com.uestc.fff.hotel.domain.UserInfo;
import com.uestc.fff.hotel.domain.order;
import com.uestc.fff.hotel.mapper.RoomListMapper;
import com.uestc.fff.hotel.service.BookListService;
import com.uestc.fff.hotel.service.searchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("room")
public class RoomController {
    @Autowired
    private BookListService serviceBook;
    @Autowired
    private searchService serviceSearch;

    @RequestMapping("/roomdetail")
    public String RoomPage(@RequestParam("rid") String rid, @RequestParam("hid") String hid,
                           Model model, HttpSession session){

        UserInfo userInfotest = (UserInfo) session.getAttribute("user");
        boolean islogin;
        if (userInfotest == null) { islogin = false; }
        else  {
            islogin = true;
            model.addAttribute("User_name",userInfotest.getLoginName());
            model.addAttribute("numOfOrders",serviceSearch.countOrder(userInfotest.getUserId()));
            List<order> orderList=serviceSearch.orderList(userInfotest.getUserId());
            model.addAttribute("orderList",orderList);
        }

        model.addAttribute("isLogin",islogin);
        List<String> listOfCountry=serviceSearch.searchCountry();
        model.addAttribute("countryList",listOfCountry);
        model.addAttribute("Hotels",serviceBook.HotelInfomation(hid));

        model.addAttribute("RoomType",serviceBook.RoomInfomation(rid).getRoomType());
        model.addAttribute("RoomArea","50平方米");
        model.addAttribute("Floor","6楼");
        model.addAttribute("BedType","1.5米大床");
        model.addAttribute("Window","有窗");
        model.addAttribute("RoomOverview","1.酒店前台办理入住，无需支付房费和押金。\n2.前台办理离店手续，直接还卡走人，无需等待查房\n3.离店自动结账，无需排队付款");
        model.addAttribute("RoomThings","雨伞、书桌、多种规格电源插座、空调、衣柜、窗帘、床具、沙发、高速上网WIFI");
        model.addAttribute("RoomMedia","国内长途电话、有线频道、液晶电视机、台式电脑");
        model.addAttribute("RoomFood","电热水壶、咖啡/茶壶、瓶装水");
        model.addAttribute("RoomShower","拖鞋、24小时热水、浴缸、吹风机、洗浴间");
        return "RoomDetail";
    }

}
