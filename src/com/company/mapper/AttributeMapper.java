package com.company.mapper;

import com.company.bean.Attribute;

public interface AttributeMapper {
    int deleteByPrimaryKey(Integer aid);

    int insert(Attribute record);

    int insertSelective(Attribute record);

    Attribute selectByPrimaryKey(Integer aid);

    int updateByPrimaryKeySelective(Attribute record);

    int updateByPrimaryKey(Attribute record);
}