package com.company.service;

import com.company.bean.Receivetarget;
import com.company.utils.Page;

import java.util.List;

public interface ReceivetargetService {

    int addReceivetarget(Receivetarget receivetarget);

    int updateReceivetarget(Receivetarget receivetarget);

    List<Receivetarget> queryReceivetargetByTeamCode(String teamCode);

    //查询接待对象的数量
    int countReceivetargetNum();

    //分页查询结果
    Page<Receivetarget> queryPartReceivetargets(int currentPage);
}
