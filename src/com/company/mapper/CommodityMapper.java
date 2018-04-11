package com.company.mapper;

import com.company.bean.Commodity;

public interface CommodityMapper {
    int deleteByPrimaryKey(String commodityName);

    int insert(Commodity record);

    int insertSelective(Commodity record);

    Commodity selectByPrimaryKey(String commodityName);

    int updateByPrimaryKeySelective(Commodity record);

    int updateByPrimaryKey(Commodity record);
}