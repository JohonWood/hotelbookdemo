package com.uestc.fff.hotel.controller;

import com.uestc.fff.hotel.domain.UserInfo;
import com.uestc.fff.hotel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

import static com.uestc.fff.hotel.domain.pass.decryptBasedDes;
import static com.uestc.fff.hotel.domain.pass.encryptBasedDes;


@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    /************注册****************/
    @RequestMapping(value = "/register")
    public String registerPages() {
        return "register";
    }

    @PostMapping(value = "/registerAction")
    public void registerCheck(@RequestParam("userID") String userID,
                              @RequestParam("userName") String userName,
                              @RequestParam("userPhone") String userPhone,
                              @RequestParam("loginName") String loginName,
                              @RequestParam("loginPassword") String loginPassword,
                              @RequestParam("loginPasswordAgain") String loginPasswordAgain,
                              HttpServletResponse response) {
        response.setContentType("text/html;charset=utf-8");//操作返回消息提示
        try (PrintWriter writer = response.getWriter()) {
            UserInfo testid = userService.findUserByUserID(userID);
            if (testid == null && loginPassword.equals(loginPasswordAgain)) {
                UserInfo dbUser = new UserInfo();
                dbUser.setUserId(userID);
                dbUser.setUserName(userName);
                dbUser.setUserPhone(userPhone);
                dbUser.setLoginName(loginName);
                dbUser.setLoginPassword(encryptBasedDes(loginPassword));//将加密后的密码存入
                userService.insertUserInfo(dbUser); //保存注册信息到数据库

                writer.write("<script> alert('注册成功,请登录'); location.href='login';</script>");
                writer.flush();
                
            }
            else
             {
                writer.write("<script> alert('账号已被使用或两次输入密码不一致，请重新注册'); history.go(-1);</script>");
                writer.flush();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /*************登录***************/
    @RequestMapping(value = "/login")
    public String loginPages() {
        return "login";
    }

    @PostMapping(value = "/loginAction")
    public void loginCheck(@RequestParam("id") String userID,
                           @RequestParam("password") String userPassword,
                           HttpServletResponse response,
                           HttpSession session) {

        response.setContentType("text/html;charset=utf-8");//操作返回消息提示
        try (PrintWriter writer = response.getWriter()) {

            UserInfo dbUser = userService.findUserByUserID(userID);

            if (dbUser == null)
            {
                writer.write("<script> alert('该账号不存在'); history.go(-1);</script>");
                writer.flush();
                return;
            }
            if (!userPassword.equals(decryptBasedDes(dbUser.getLoginPassword())))//将数据库中加密的密码解密后与输入的密码进行比较
             {
                writer.write("<script> alert('密码错误'); history.go(-1);</script>");
                writer.flush();
                return;
            }
            else
            {
                //用session保存用户登录信息
                session.setAttribute("user", dbUser);
                //创建cookie对象来保存session的id
                Cookie cookie = new Cookie("userSessionID", session.getId());
                cookie.setMaxAge(86400);//保存一天
                response.addCookie(cookie);

                if ( "admin".equals(dbUser.getUserId()))
                {
                    writer.write("<script> alert('登录成功'); location.href='/manage/country';</script>");
                    writer.flush();
                    
                } else {//普通用户登录
                    writer.write("<script> alert('登录成功'); location.href='/504/host?islogin=true';</script>");
                    writer.flush();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/logoutAction")
    public void logOut(HttpSession session,
                       HttpServletResponse response,
                       HttpServletRequest request) {
        response.setContentType("text/html;charset=utf-8");
        try {
            PrintWriter writer = response.getWriter();
            Cookie[] cookies = request.getCookies();
            if (cookies != null) {
                for (Cookie cookie : cookies) {
                    if ("userSessionID".equals(cookie.getName())) {
                        cookie.setMaxAge(0);//设置原本的cookie记录有效期为0，相当于删除cookie
                        response.addCookie(cookie);
                    }
                }
            }
            //从session中删除user
            session.removeAttribute("user");
            writer.write("<script> alert('成功登出'); location.href='/504/host';</script>");//登出后返回主页面
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @GetMapping("/userinfo")
    public String userInfoPages(Model model, HttpSession session){
/*        boolean islogin;*/
        UserInfo userInfotest = (UserInfo) session.getAttribute("user");
        model.addAttribute("userID",userInfotest.getUserId());
        model.addAttribute("userName",userInfotest.getUserName());
        model.addAttribute("userPhone",userInfotest.getUserPhone());
        model.addAttribute("loginName",userInfotest.getLoginName());
        return "UserInfomation";
    }

    @PostMapping("/changeuserinfo")
    public void changeUserInfo(HttpSession session, HttpServletResponse response,
                               @RequestParam("name") String userName,
                               @RequestParam("phone") String userPhone,
                               @RequestParam("loginname") String loginName)
    {
        response.setContentType("text/html;charset=utf-8");
        UserInfo changeUser = (UserInfo) session.getAttribute("user");
        changeUser.setUserName(userName);
        changeUser.setUserPhone(userPhone);
        changeUser.setLoginName(loginName);
        userService.updateUserInfo(changeUser);
        try {
            response.getWriter().write("<script>alert('成功更新用户信息');location.href='/user/userinfo';</script>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @PostMapping("/changepassword")
    public void changePassword(HttpSession session, HttpServletResponse response,
                               @RequestParam("originpassword") String originPassword,
                               @RequestParam("newpassword") String newPassword,
                               @RequestParam("newpassword2") String newPassword2)
    {
        response.setContentType("text/html;charset=utf-8");
        UserInfo changeUser = (UserInfo) session.getAttribute("user");
        try
        {
            if(!originPassword.equals(decryptBasedDes(changeUser.getLoginPassword())))
            {
                response.getWriter().write("<script> alert('原密码不正确'); location.href='/user/userinfo';</script>");
                return;
            }
            if (!newPassword.equals(newPassword2))
            {
                response.getWriter().write("<script> alert('两次新密码输入不一致'); location.href='/user/userinfo';</script>");
                return;
            }
            else
            {
                changeUser.setLoginPassword(encryptBasedDes(newPassword));
                userService.updateUserInfo(changeUser);
                session.setAttribute("user",changeUser);
                response.getWriter().write("<script> alert('密码修改成功'); location.href='/user/userinfo';</script>");
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}

