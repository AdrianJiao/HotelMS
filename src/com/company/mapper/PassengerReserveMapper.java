package com.company.mapper;

import com.company.bean.PassengerReserve;

public interface PassengerReserveMapper {
    int deleteByPrimaryKey(String passengerreserveid);

    int insert(PassengerReserve record);

    int insertSelective(PassengerReserve record);

    PassengerReserve selectByPrimaryKey(String passengerreserveid);

    int updateByPrimaryKeySelective(PassengerReserve record);

    int updateByPrimaryKey(PassengerReserve record);
}