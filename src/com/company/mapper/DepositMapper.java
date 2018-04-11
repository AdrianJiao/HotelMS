package com.company.mapper;

import com.company.bean.Deposit;

public interface DepositMapper {
    int deleteByPrimaryKey(String checkInId);

    int insert(Deposit record);

    int insertSelective(Deposit record);

    Deposit selectByPrimaryKey(String checkInId);

    int updateByPrimaryKeySelective(Deposit record);

    int updateByPrimaryKey(Deposit record);
}