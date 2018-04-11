package com.company.mapper;

import com.company.bean.Passenger;

public interface PassengerMapper {
    int deleteByPrimaryKey(Integer pid);

    int insert(Passenger record);

    int insertSelective(Passenger record);

    Passenger selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(Passenger record);

    int updateByPrimaryKey(Passenger record);
}