package com.company.mapper;

import com.company.bean.Deposit;

public interface DepositMapper {
    int deleteByPrimaryKey(String checkinid);

    int insert(Deposit record);

    int insertSelective(Deposit record);

    Deposit selectByPrimaryKey(String checkinid);

    int updateByPrimaryKeySelective(Deposit record);

    int updateByPrimaryKey(Deposit record);
}