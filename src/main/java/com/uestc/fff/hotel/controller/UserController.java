package com.uestc.fff.hotel.controller;

import com.uestc.fff.hotel.domain.UserInfo;
import com.uestc.fff.hotel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;


@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    /************注册****************/
    @RequestMapping(value = "/register")
    public String registerPages(){
        return "register";
    }

     @PostMapping(value = "/registerAction")
     public void registerCheck(@RequestParam("userID")String userID,
                                 @RequestParam("userName") String userName,
                                 @RequestParam("userPhone") String userPhone,
                                 @RequestParam("loginName") String loginName,
                                 @RequestParam("loginPassword") String loginPassword,
                                 HttpServletResponse response)
     {
         response.setContentType("text/html;charset=utf-8");//操作返回消息提示
         try (PrintWriter writer = response.getWriter())
         {
             if (userID == null || userName == null || userPhone == null || loginName == null || loginPassword == null)
             //判断输入的注册信息是否有空值
             {
                 writer.write("<script> alert('请将资料填写完整');history.go(-1); </script>");
                 //System.out.println("请将资料填写完整");
                 //return "register";
             }
             UserInfo testid = userService.findUserByUserID(userID);
             if (testid == null) {
                 UserInfo dbUser = new UserInfo();
                 dbUser.setUserId(userID);
                 dbUser.setUserName(userName);
                 dbUser.setUserPhone(userPhone);
                 dbUser.setLoginName(loginName);
                 dbUser.setLoginPassword(loginPassword);
                 userService.insertUserInfo(dbUser);
                 //保存注册信息到数据库
                 writer.write("<script> alert('注册成功,请登录'); location.href='login';</script>");
                 //System.out.println("注册成功");
                 //return "login";
             } else {
                 writer.write("<script> alert('账号已被使用，请重新注册'); history.go(-1);</script>");
                 //System.out.println("帐号" + userID + "已被使用,请重新注册");
                 //return "register";
             }
             writer.flush();
         } catch (IOException e) {
             e.printStackTrace();
         }
     }


     /*************登录***************/
    @RequestMapping(value = "/login")
    public String loginPages(){
        return "login";
    }

    @PostMapping(value = "/loginAction")
    public void loginCheck(@RequestParam("id")String userID,
                             @RequestParam("password")String userPassword,
                             HttpServletResponse response,
                             HttpSession session)
    {
        response.setContentType("text/html;charset=utf-8");//操作返回消息提示
        try (PrintWriter writer = response.getWriter()) {
            UserInfo dbUser = userService.findUserByUserID(userID);
            if(dbUser == null)
            {
                writer.write("<script> alert('该账号不存在'); history.go(-1);</script>");
                //System.out.println("该用户不存在");
                //return "login";
            }
            else if( !dbUser.getLoginPassword().equals(userPassword) )
            {
                writer.write("<script> alert('密码错误'); history.go(-1);</script>");
                //System.out.println("密码错误");
                //return "login";
            }
            else
            {

                //用session保存用户登录信息
                session.setAttribute("user", dbUser);



                //创建cookie对象来保存session的id
                Cookie cookie = new Cookie("jessionid",session.getId());
                cookie.setMaxAge(86400);//保存一天
                response.addCookie(cookie);

                System.out.println(dbUser.getUserId());
                if ( "admin".equals(dbUser.getUserId())){
                    writer.write("<script> alert('登录成功'); location.href='/manage/country';</script>");
                }
                else{
                    writer.write("<script> alert('登录成功'); location.href='/504/host?islogin=true';</script>");
                }

                //System.out.println("登录成功");
                //return "testlogin";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @RequestMapping(value = "/testlogin")
    public String loginTest(HttpSession session){
        UserInfo userInfotest = (UserInfo) session.getAttribute("user");
        System.out.println("你的帐号为"+userInfotest.getUserId()+userInfotest.getLoginPassword()+userInfotest.getLoginName());
        return "testlogin";
    }


    @RequestMapping(value = "/loginout")
    public String logOutTest(HttpSession session) {
        //从session中删除user属性，用户退出登录
        session.removeAttribute("user");
        return "loginout";
    }
}
