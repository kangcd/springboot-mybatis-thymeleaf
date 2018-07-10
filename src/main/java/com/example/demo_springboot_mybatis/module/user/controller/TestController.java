package com.example.demo_springboot_mybatis.module.user.controller;


import com.example.demo_springboot_mybatis.module.user.entity.User;
import com.example.demo_springboot_mybatis.module.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    UserService userService;

    @RequestMapping(value ="/test")
    public User test(){
        return  userService.getUser("1");
    }
}
