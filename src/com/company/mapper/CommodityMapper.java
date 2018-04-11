package com.company.mapper;

import com.company.bean.Commodity;

public interface CommodityMapper {
    int deleteByPrimaryKey(String commodityname);

    int insert(Commodity record);

    int insertSelective(Commodity record);

    Commodity selectByPrimaryKey(String commodityname);

    int updateByPrimaryKeySelective(Commodity record);

    int updateByPrimaryKey(Commodity record);
}