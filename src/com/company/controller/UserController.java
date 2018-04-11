package com.company.controller;

import com.company.bean.User;
import com.company.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    //跳转登录页面
    @RequestMapping(value = "/Login/tologin.do", method = RequestMethod.GET)
    public String login() {
        return "login/login";
    }

    //登录用户进行后台
    @RequestMapping(value = "/Login/tomain.do", method = RequestMethod.POST)
    public String login(User user, HttpSession session, Model model) {
        String username = user.getUserName();
        String password = user.getPassword();

        if (username != null && !"".equals(username.trim()) && password != null && !"".equals(password.trim())) {
            //查询用户
            boolean isLoginSuccess = userService.checkUser(user);

            if (!isLoginSuccess) {
                model.addAttribute("loginInfo", "用户名或密码不正确");
                return "login/login";

            } else {
                return "main/main";
            }

        } else {
            model.addAttribute("loginEmpty", "用户名不能为空");
            return "login/login";
        }
    }
}
