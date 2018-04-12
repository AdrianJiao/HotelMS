package com.company.mapper;

import com.company.bean.Receivetarget;

import java.util.List;

public interface ReceivetargetMapper {
    int deleteByPrimaryKey(Integer tid);

    int insert(Receivetarget record);

    int insertSelective(Receivetarget record);

    Receivetarget selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(Receivetarget record);

    int updateByPrimaryKey(Receivetarget record);

    List<Receivetarget> queryReceivetargetByTeamCode(String teamCode);

    //查询接待对象的数量
    int countReceivetargetNum();

    //分页查询结果
    List<Receivetarget> queryPartReceivetargets(int limit,int offset);
}