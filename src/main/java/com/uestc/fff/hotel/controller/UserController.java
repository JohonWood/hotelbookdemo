package com.uestc.fff.hotel.controller;


import com.uestc.fff.hotel.domain.UserInfo;
import com.uestc.fff.hotel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 注册API
     * @method：post
     * @param userInfo（从View层传回来的userInfo对象）
     * @return 重定向
     * */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String registerPages(Model model,
                                @ModelAttribute(value = "userInfo")UserInfo userInfo,
                                HttpServletResponse response){

        if(userService.register(userInfo))
        {
            return response.encodeRedirectURL("/login");
            //重定向到登录页面
        }
        else
        {
            return "register";
        }
    }


    /**
     * 登录API
     * @method：post
     * @param userInfo（从View层传回来的userInfo对象）
     * @return 重定向
     * */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginPages(Model model,
                             @ModelAttribute(value = "userInfo")UserInfo userInfo,
                             HttpServletResponse response,
                             HttpSession session){
        if(userService.login(userInfo))
        {
            //用session保存用户登录信息
            session.setAttribute("userInfo",userInfo);
        }
        return "login";
    }


}
