package com.company.mapper;

import com.company.bean.Attributevalue;

public interface AttributevalueMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Attributevalue record);

    int insertSelective(Attributevalue record);

    Attributevalue selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Attributevalue record);

    int updateByPrimaryKey(Attributevalue record);
}