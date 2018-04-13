package com.company.mapper;

import com.company.bean.Commoditytype;

import java.util.List;

public interface CommoditytypeMapper {
    int deleteByPrimaryKey(String commodityTypeID);

    int insert(Commoditytype record);

    int insertSelective(Commoditytype record);

    Commoditytype selectByPrimaryKey(String commodityTypeID);

    int updateByPrimaryKeySelective(Commoditytype record);

    int updateByPrimaryKey(Commoditytype record);

    List<Commoditytype> findCommoditytypeList();

    String findCommoditytypeIdByName(String commodityTypeID);
}