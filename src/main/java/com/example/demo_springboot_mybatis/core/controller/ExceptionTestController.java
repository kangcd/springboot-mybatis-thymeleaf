package com.example.demo_springboot_mybatis.core.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.demo_springboot_mybatis.core.util.response.Result;
import com.example.demo_springboot_mybatis.core.util.response.ResultUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionTestController {

    @GetMapping("/exception")
    public Result exception() {
        String str="sssskkk";
        JSONObject jsonObject= JSON.parseObject(str);
        return ResultUtil.success(jsonObject);
    }
}
