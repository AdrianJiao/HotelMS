package com.company.mapper;

import com.company.bean.Deposit;

import java.util.List;
import java.util.Map;

public interface DepositMapper {
    int deleteByPrimaryKey(String checkInId);

    int insert(Deposit record);

    int insertSelective(Deposit record);

    Deposit selectByPrimaryKey(String checkInId);

    int updateByPrimaryKeySelective(Deposit record);

    int updateByPrimaryKey(Deposit record);

    //通过CheckID和LvKeLeiXingIdInt查询所有记录
    List<Deposit> queryDepositsByCheckID(String checkInId);
}