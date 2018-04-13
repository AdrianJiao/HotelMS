package com.company.service.impl;

import com.company.bean.User;
import com.company.mapper.UserMapper;
import com.company.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public boolean checkUser(User user) {
        int isLoginSuccess = userMapper.selectByUsernameAndPassword(user);
        return isLoginSuccess > 0 ? true : false;
    }




}
