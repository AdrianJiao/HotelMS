package com.company.mapper;

import com.company.bean.Attribute;

public interface AttributeMapper {
    int deleteByPrimaryKey(Integer far_id);

    int insert(Attribute record);

    int insertSelective(Attribute record);

    Attribute selectByPrimaryKey(Integer far_id);

    int updateByPrimaryKeySelective(Attribute record);

    int updateByPrimaryKey(Attribute record);
}