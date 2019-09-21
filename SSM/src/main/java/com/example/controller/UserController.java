package com.example.controller;

import com.alibaba.fastjson.JSON;
import com.example.bean.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @ResponseBody
    @RequestMapping("/getalluser")
    public String getAllUser(){
        List<User> allUsers = userService.getAllUsers();
        System.out.println("查询所有用户");
        System.out.println(allUsers.toString());
        String s = com.alibaba.fastjson.JSON.toJSONString(allUsers);
        System.out.println(s);
        return s;

    }
}
