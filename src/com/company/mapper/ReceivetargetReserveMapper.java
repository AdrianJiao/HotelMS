package com.company.mapper;

import com.company.bean.ReceivetargetReserve;

public interface ReceivetargetReserveMapper {
    int deleteByPrimaryKey(String receivetargetreserveid);

    int insert(ReceivetargetReserve record);

    int insertSelective(ReceivetargetReserve record);

    ReceivetargetReserve selectByPrimaryKey(String receivetargetreserveid);

    int updateByPrimaryKeySelective(ReceivetargetReserve record);

    int updateByPrimaryKey(ReceivetargetReserve record);
}