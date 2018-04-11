package com.company.utils;

public class MyException extends Exception{
    //异常信息
    private  String message ;

    //自定义异常构造方法
    public MyException(String message) {
        super(message);
        this.message = message;
    }
}