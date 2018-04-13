package com.company.service.impl;

import com.company.bean.Receivetarget;
import com.company.mapper.ReceivetargetMapper;
import com.company.service.ReceivetargetService;
import com.company.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
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
    public int countAllReceivetargetNum() {
        return receivetargetMapper.countAllReceivetargetNum();
    }

    @Override
    public int countReceivetargetNumByTeamName(String txtname) {
        return receivetargetMapper.countReceivetargetNumByTeamName(txtname);
    }


    @Override
    public Page<Receivetarget> queryPartReceivetargets(int currentPage,String txtname) {
        //统计符合要求的总条数
        int totalRecordsNum = receivetargetMapper.countReceivetargetNumByTeamName(txtname);

        HashMap<String, Object> parameters = new HashMap<>();
        parameters.put("limit",Page.RECEIVETARGET_PER_PAGE_RECORD_NUM);
        parameters.put("offset",(currentPage - 1) * Page.RECEIVETARGET_PER_PAGE_RECORD_NUM);
        parameters.put("txtname",txtname);

        List<Receivetarget> receivetargets = receivetargetMapper.queryPartReceivetargets(parameters);

        return new Page<>(Page.RECEIVETARGET_PER_PAGE_RECORD_NUM,totalRecordsNum,receivetargets,currentPage);
    }

    @Override
    public Receivetarget queryReceivetargetByTid(int tid) {
        return receivetargetMapper.queryReceivetargetByTid(tid);
    }

    @Override
    public int deleteBatchByTid(String[] tid) {
        return receivetargetMapper.deleteBatchByTid(tid);
    }

    @Override
    public List<Receivetarget> queryAllReceivetarget() {
        return receivetargetMapper.queryAllReceivetarget();
    }

    @Override
    public List<Receivetarget> queryReceivetargetByTeamName(String teamName) {
        return receivetargetMapper.queryReceivetargetByTeamName(teamName);
    }
}
