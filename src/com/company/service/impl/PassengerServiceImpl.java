package com.company.service.impl;

import com.company.bean.Passenger;
import com.company.mapper.PassengerMapper;
import com.company.service.PassengerService;

public class PassengerServiceImpl  implements PassengerService{

    PassengerMapper passengerMapper;

    @Override
    public int deleteById(Integer id) {
        return passengerMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Passenger passenger) {
        return passengerMapper.insert(passenger);
    }

    @Override
    public Passenger selectById(Integer id) {
        return passengerMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateById(Passenger passenger) {
        return passengerMapper.updateByPrimaryKey(passenger);
    }
}
