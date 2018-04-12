package com.company.service.impl;

import com.company.bean.Passenger;
import com.company.mapper.PassengerMapper;
import com.company.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service(value = "passengerService")
public class PassengerServiceImpl  implements PassengerService{

    @Autowired
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
