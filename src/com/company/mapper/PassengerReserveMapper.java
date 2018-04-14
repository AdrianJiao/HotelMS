package com.company.mapper;

import com.company.bean.PassengerCheckin;
import com.company.bean.PassengerReserve;

import java.util.List;
import java.util.Map;

public interface PassengerReserveMapper {
    int deleteByPrimaryKey(String passengerReserveId);

    int insert(PassengerReserve record);

    int insertSelective(PassengerReserve record);

    PassengerReserve selectByPrimaryKey(String passengerReserveId);

    int updateByPrimaryKeySelective(PassengerReserve record);

    int updateByPrimaryKey(PassengerReserve record);

    //分页和模糊查询
    List<PassengerReserve> queryPartPassengerReserves(Map<String,Object> map);

    //计算分页和模糊查询的总记录数
    int countPartPassengerReserveByNameAndReserveState(Map<String,Object> map);
}