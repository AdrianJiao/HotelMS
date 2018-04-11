package com.company.mapper;

import com.company.bean.Receivetarget;
import com.company.utils.Page;

import java.util.List;

public interface ReceivetargetMapper {
    int deleteByPrimaryKey(Integer tid);

    int insert(Receivetarget record);

    int insertSelective(Receivetarget record);

    Receivetarget selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(Receivetarget record);

    int updateByPrimaryKey(Receivetarget record);

    Page queryPartReceivetarget();
}