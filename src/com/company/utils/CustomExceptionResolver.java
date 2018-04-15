package com.company.utils;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CustomExceptionResolver implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(
            HttpServletRequest httpServletRequest,
            HttpServletResponse httpServletResponse,
            Object o,
            Exception e) {
        ModelAndView mv = new ModelAndView();
        if (e instanceof  MyException){

            //发生了自定义异常
            mv.setViewName("error/error-500");
            mv.addObject("errormsg",e.getMessage());
        }else{

            //发生了未知异常
            mv.setViewName("error/error-500");
            mv.addObject("errormsg","unknown error!");
        }
        return mv;
    }
}
