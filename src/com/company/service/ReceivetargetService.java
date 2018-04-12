package com.company.service;

import com.company.bean.Receivetarget;
import com.company.utils.Page;

import java.util.List;

public interface ReceivetargetService {

    int addReceivetarget(Receivetarget receivetarget);

    int updateReceivetarget(Receivetarget receivetarget);

    List<Receivetarget> queryReceivetargetByTeamCode(String teamCode);

    //查询所有接待对象的数量
    int countAllReceivetargetNum();

    //查询团名为某个参数的数量
    int countReceivetargetNumByTeamName(String txtname);

    //分页查询结果
    Page<Receivetarget> queryPartReceivetargets(int currentPage,String txtname);

    //根据tid查询Receivetarget(填充name字段)
    Receivetarget queryReceivetargetByTid(int tid);

    //批量删除
    int deleteBatchByTid(String[] tid);
}
