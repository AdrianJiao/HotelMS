package com.company.mapper;

import com.company.bean.Commoditytype;

public interface CommoditytypeMapper {
    int deleteByPrimaryKey(String commoditytypeid);

    int insert(Commoditytype record);

    int insertSelective(Commoditytype record);

    Commoditytype selectByPrimaryKey(String commoditytypeid);

    int updateByPrimaryKeySelective(Commoditytype record);

    int updateByPrimaryKey(Commoditytype record);
}