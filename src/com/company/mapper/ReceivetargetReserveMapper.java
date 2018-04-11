package com.company.mapper;

import com.company.bean.ReceivetargetReserve;

public interface ReceivetargetReserveMapper {
    int deleteByPrimaryKey(String receivetargetReserveId);

    int insert(ReceivetargetReserve record);

    int insertSelective(ReceivetargetReserve record);

    ReceivetargetReserve selectByPrimaryKey(String receivetargetReserveId);

    int updateByPrimaryKeySelective(ReceivetargetReserve record);

    int updateByPrimaryKey(ReceivetargetReserve record);
}