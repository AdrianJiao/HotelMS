package com.company.service;

import com.company.bean.Passenger;

public interface PassengerService {

    public int deleteById(Integer id);

    public int insert(Passenger passenger);

    public Passenger selectById(Integer id);

    public int updateById(Passenger passenger);


}
