package com.company.mapper;

import com.company.bean.PassengerCheckin;

public interface PassengerCheckinMapper {
    int deleteByPrimaryKey(String passengerCheckInId);

    int insert(PassengerCheckin record);

    int insertSelective(PassengerCheckin record);

    PassengerCheckin selectByPrimaryKey(String passengerCheckInId);

    int updateByPrimaryKeySelective(PassengerCheckin record);

    int updateByPrimaryKey(PassengerCheckin record);
}