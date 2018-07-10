package com.example.demo_springboot_mybatis.module.user.service;


import com.example.demo_springboot_mybatis.module.user.entity.User;

public interface UserService {
    User getUser(String id);
}
