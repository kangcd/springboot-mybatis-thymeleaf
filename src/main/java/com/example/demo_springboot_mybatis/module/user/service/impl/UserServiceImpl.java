package com.example.demo_springboot_mybatis.module.user.service.impl;

import com.example.demo_springboot_mybatis.module.user.dao.UserMapper;
import com.example.demo_springboot_mybatis.module.user.entity.User;
import com.example.demo_springboot_mybatis.module.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public User getUser(String id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
