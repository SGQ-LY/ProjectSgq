package com.example.controller;

import com.example.bean.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

   @Autowired
   UserService userService;

    @RequestMapping("/login")
    public String checkUser(HttpServletRequest request){
        System.out.println("LoginControl");
        String loginName = request.getParameter("loginName");
        String passWord = request.getParameter("passWord");
        System.out.println(loginName);
        System.out.println(passWord);
        User user1 = new User();
        user1.setLoginname(loginName);
        user1.setPassword(passWord);
        User user = userService.getUser(user1);
        System.out.println(user.toString());
        if(user != null){
            HttpSession session = request.getSession();
            session.setAttribute("user",user);
            return "home";
        }
        return "login";
    }

}
