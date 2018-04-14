package com.company.mapper;

import com.company.bean.PassengerCheckin;

import java.util.List;
import java.util.Map;

public interface PassengerCheckinMapper {
    int deleteByPrimaryKey(String passengerCheckInId);

    int insert(PassengerCheckin record);

    int insertSelective(PassengerCheckin record);

    PassengerCheckin selectByPrimaryKey(String passengerCheckInId);

    int updateByPrimaryKeySelective(PassengerCheckin record);

    int updateByPrimaryKey(PassengerCheckin record);

    //分页和模糊查询
    List<PassengerCheckin> queryPartPassengerCheckins(Map<String,Object> map);

    //计算分页和模糊查询的总记录数
    int countPartPassengerCheckinByRoomNameAndBillState(Map<String,Object> map);

    //根据passengerCheckInId查到PassengerCheckin数据
    PassengerCheckin queryPassengerCheckinByPassengerCheckInId(String passengerCheckInId);
}