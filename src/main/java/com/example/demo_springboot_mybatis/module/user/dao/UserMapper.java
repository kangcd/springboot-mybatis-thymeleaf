package com.example.demo_springboot_mybatis.module.user.dao;

import com.example.demo_springboot_mybatis.module.user.entity.User;
import org.springframework.stereotype.Component;

@Component(value = "userMapper")
public interface UserMapper {
    int deleteByPrimaryKey(String id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}