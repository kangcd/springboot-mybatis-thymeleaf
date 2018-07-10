package com.example.demo_springboot_mybatis.core.util.exception;

import com.example.demo_springboot_mybatis.core.util.response.Result;
import com.example.demo_springboot_mybatis.core.util.response.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 异常统一处理类
 */
@Slf4j //日志注解
@ControllerAdvice//注解定义全局异常处理类
public class ExceptionHandle {
    @ResponseBody
    @ExceptionHandler(value = Exception.class)//注解声明异常处理方法
    public Result Handle(Exception e){
        //自定义异常类型
        if (e instanceof BaseException){
            BaseException grilException = (BaseException) e;
            return ResultUtil.error(grilException.getCode(),grilException.getMessage());
        }else {
            //将系统异常以打印出来
            log.info("[系统异常]{}",e);
            return ResultUtil.error(-1,"未知错误");
        }

    }
}