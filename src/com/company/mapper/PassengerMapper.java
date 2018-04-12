package com.company.mapper;

import com.company.bean.Passenger;

public interface PassengerMapper {

    //删除选中
    int deleteByPrimaryKey(Integer pid);

    //插入全部
    int insert(Passenger record);

    //插入选中
    int insertSelective(Passenger record);

    //根据选中id
    Passenger selectByPrimaryKey(Integer pid);

    //更新选中
    int updateByPrimaryKeySelective(Passenger record);

    //更新全部
    int updateByPrimaryKey(Passenger record);
}