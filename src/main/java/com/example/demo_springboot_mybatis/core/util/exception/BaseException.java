package com.example.demo_springboot_mybatis.core.util.exception;

public class BaseException extends RuntimeException{
    private Integer code;

    public BaseException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
