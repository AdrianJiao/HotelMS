package com.company.service;

import com.company.bean.Deposit;

import java.util.List;

public interface DepositService {
    int insertSelective(Deposit record);

    //通过CheckID查询所有记录
    List<Deposit> queryDepositsByCheckID(String checkInId);
}
