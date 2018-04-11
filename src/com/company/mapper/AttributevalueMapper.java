package com.company.mapper;

import com.company.bean.Attributevalue;

public interface AttributevalueMapper {
    int deleteByPrimaryKey(Integer far_id);

    int insert(Attributevalue record);

    int insertSelective(Attributevalue record);

    Attributevalue selectByPrimaryKey(Integer far_id);

    int updateByPrimaryKeySelective(Attributevalue record);

    int updateByPrimaryKey(Attributevalue record);
}