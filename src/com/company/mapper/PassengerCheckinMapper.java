package com.company.mapper;

import com.company.bean.PassengerCheckin;

public interface PassengerCheckinMapper {
    int deleteByPrimaryKey(String passengercheckinid);

    int insert(PassengerCheckin record);

    int insertSelective(PassengerCheckin record);

    PassengerCheckin selectByPrimaryKey(String passengercheckinid);

    int updateByPrimaryKeySelective(PassengerCheckin record);

    int updateByPrimaryKey(PassengerCheckin record);
}