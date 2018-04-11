package com.company.service.impl;

import com.company.bean.Receivetarget;
import com.company.mapper.ReceivetargetMapper;
import com.company.service.ReceivetargetService;
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
    public List<Receivetarget> queryPartReceivetargets() {
        return null;
    }

    @Override
    public int updateReceivetarget(Receivetarget receivetarget) {
        return receivetargetMapper.updateByPrimaryKeySelective(receivetarget);
    }

    @Override
    public Receivetarget queryReceivetargetByTeamCode(String teamCode) {
        return receivetargetMapper.queryReceivetargetByTeamCode(teamCode);
    }
}
