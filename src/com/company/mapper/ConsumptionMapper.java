package com.company.mapper;

import com.company.bean.Consumption;

public interface ConsumptionMapper {
    int deleteByPrimaryKey(String checkInId);

    int insert(Consumption record);

    int insertSelective(Consumption record);

    Consumption selectByPrimaryKey(String checkInId);

    int updateByPrimaryKeySelective(Consumption record);

    int updateByPrimaryKey(Consumption record);
}