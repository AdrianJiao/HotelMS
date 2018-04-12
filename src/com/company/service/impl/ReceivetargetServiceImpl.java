package com.company.service.impl;

import com.company.bean.Receivetarget;
import com.company.mapper.ReceivetargetMapper;
import com.company.service.ReceivetargetService;
import com.company.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReceivetargetServiceImpl implements ReceivetargetService{

    @Autowired
    ReceivetargetMapper receivetargetMapper;

    @Override
    public int addReceivetarget(Receivetarget receivetarget) {
        return receivetargetMapper.insert(receivetarget);
    }

    @Override
    public int updateReceivetarget(Receivetarget receivetarget) {
        return receivetargetMapper.updateByPrimaryKeySelective(receivetarget);
    }

    @Override
    public List<Receivetarget> queryReceivetargetByTeamCode(String teamCode) {
        return receivetargetMapper.queryReceivetargetByTeamCode(teamCode);
    }

    @Override
    public int countReceivetargetNum() {
        return receivetargetMapper.countReceivetargetNum();
    }

    @Override
    public Page<Receivetarget> queryPartReceivetargets(int currentPage) {
        int totalRecordsNum = receivetargetMapper.countReceivetargetNum();

        List<Receivetarget> receivetargets = receivetargetMapper.queryPartReceivetargets(
                Page.RECEIVETARGET_PER_PAGE_RECORD_NUM,
                (currentPage - 1) * Page.RECEIVETARGET_PER_PAGE_RECORD_NUM);

        return new Page<>(Page.RECEIVETARGET_PER_PAGE_RECORD_NUM,totalRecordsNum,receivetargets,currentPage);
    }
}
