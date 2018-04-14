package com.company.service;

import com.company.bean.Passenger;
import com.company.utils.Page;

import java.util.List;


public interface PassengerService {

    int deleteByPrimaryKey(Integer id);

    int insertAll(Passenger passenger);

    Passenger selectById(Integer id);

    int updateById(Passenger passenger);

    int countPassengerNumByName(String txtname);

    Page<Passenger> queryPartPassengers(int currentPage, String txtname);

    Passenger queryPassengerByPid(int pid);

    int deleteBatchByPid(String[] pid);

    List<Passenger> queryAllPassenger();

    List<Passenger> queryPassengerByName(String txtname);

    //插入后获取主键
    int insertAndGetId(Passenger passenger);

    //根据id获取用户不填充相应字段
    Passenger selectPassengerByIdWithoutFill(int pid);

}
