package com.company.mapper;

import com.company.bean.Receivetarget;

public interface ReceivetargetMapper {
    int deleteByPrimaryKey(Integer tid);

    int insert(Receivetarget record);

    int insertSelective(Receivetarget record);

    Receivetarget selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(Receivetarget record);

    int updateByPrimaryKey(Receivetarget record);
}