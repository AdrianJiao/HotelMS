package com.company.mapper;

import com.company.bean.Receivetarget;

import java.util.List;
import java.util.Map;

public interface ReceivetargetMapper {
    int deleteByPrimaryKey(Integer tid);

    int insert(Receivetarget record);

    int insertSelective(Receivetarget record);

    Receivetarget selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(Receivetarget record);

    int updateByPrimaryKey(Receivetarget record);

    List<Receivetarget> queryReceivetargetByTeamCode(String teamCode);

    //查询所有接待对象的数量
    int countAllReceivetargetNum();

    //查询团名为某个参数的数量
    int countReceivetargetNumByTeamName(String txtname);

    //分页查询结果
    List<Receivetarget> queryPartReceivetargets(Map<String,Object> parameters);
}