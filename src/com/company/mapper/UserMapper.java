package com.company.mapper;

import com.company.bean.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    //通过用户名和密码查询用户是否存在
    int selectByUsernameAndPassword(User user);
}