package com.example.demo_springboot_mybatis.core.aspect;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * 记录请求接口日志切面
 */
@Slf4j
@Aspect//定义切面类
@Component//让spring管理bean
public class WebLogAspect {
    /*
     * 指定切入点匹配表达式，注意它是以方法的形式进行声明的。
     * 分析：
     *  execution 是方法的织入语言
     * 	第一个 * ：返回任意类型
     *  main.java.com.spring.aop.service： 包。
     *  ..：service包以及其子包。
     *  第二个 * ：service包以及其子包下的任意类。
     *  第三个 * ：service包以及其子包下的任意类的任意方法。
     *  (..) ：方法的参数为任意。
     *  总结：对 main.java.com.spring.aop.service包以及其子包下的任意类的任意方法作切入
     */
    @Pointcut("execution(public * com.example.demo_springboot_mybatis..controller..*.*(..))")
    public void webLog() {
    }

    @Before("webLog()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {
        log.debug( "********************进入doBefore切面******************");
        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        // 记录下请求内容
        log.debug("URL : " + request.getRequestURL().toString());
        log.debug("HTTP_METHOD : " + request.getMethod());
        log.debug("IP : " + request.getRemoteAddr());
        log.debug("CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        log.debug("ARGS : " + Arrays.toString(joinPoint.getArgs()));

    }

    @AfterReturning(returning = "ret", pointcut = "webLog()")
    public void doAfterReturning(Object ret) throws Throwable {
        // 处理完请求，返回内容
        log.debug("RESPONSE : " + JSONObject.toJSONString(ret));
        log.debug( "********************doAfterReturning******************");
    }
}