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

    //根据tid查询Receivetarget(填充name字段)
    Receivetarget queryReceivetargetByTid(int tid);

    //批量删除
    int deleteBatchByTid(String[] tid);

    //查询所有接待对象信息(填充name字段)
    List<Receivetarget> queryAllReceivetarget();

    //根据团队名称查询所有对象信息(填充name字段)
    List<Receivetarget> queryReceivetargetByTeamName(String teamName);
}