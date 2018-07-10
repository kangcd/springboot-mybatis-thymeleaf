package com.example.demo_springboot_mybatis.core.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "/logger")
public class LoggerTestController {


    @RequestMapping(value ="/logger")
    public String logger(){
        log.info("info");
        log.error("error");
        log.warn("warn");
        log.debug("debug");
        log.trace("trace");
        return  "logger";
    }
}
