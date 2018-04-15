package com.company.service.impl;

import com.company.bean.PassengerCheckin;
import com.company.bean.ReceivetargetCheckin;
import com.company.mapper.ReceivetargetCheckinMapper;
import com.company.service.ReceivetargetCheckinService;
import com.company.utils.Page;
import com.company.vo.PassengerCheckinVO;
import com.company.vo.ReceivetargetCheckinVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

@Service
public class ReceivetargetCheckinServiceImpl implements ReceivetargetCheckinService{

    @Autowired
    ReceivetargetCheckinMapper receivetargetCheckinMapper;

    @Override
    public int insert(ReceivetargetCheckin record) {
        return receivetargetCheckinMapper.insert(record);
    }

    @Override
    public int insertSelective(ReceivetargetCheckin record) {
        return receivetargetCheckinMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKeySelective(ReceivetargetCheckin record) {
        return receivetargetCheckinMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public Page<ReceivetargetCheckinVO> queryPartReceivetargetCheckins(String txtname, int isBillID, int currentPage) {

        //统计符合要求的总条数
        int totalRecordsNum = countPartReceivetargetCheckinByRoomNameAndBillState(txtname,isBillID);

        HashMap<String, Object> parameters = new HashMap<>();
        parameters.put("limit",Page.CHCKIN_PER_PAGE_RECORD_NUM);
        parameters.put("offset",(currentPage - 1) * Page.CHCKIN_PER_PAGE_RECORD_NUM);
        parameters.put("txtname",txtname);
        parameters.put("isBillID",isBillID);

        List<ReceivetargetCheckin> receivetargetCheckins = receivetargetCheckinMapper.
                queryPartReceivetargetCheckins(parameters);

        System.out.println("数据库查询结果"+receivetargetCheckins);

        //将ReceivetargetCheckin装换为ReceivetargetCheckinVO
        List<ReceivetargetCheckinVO> receivetargetCheckinVOS = new LinkedList<>();

        for (ReceivetargetCheckin receivetargetCheckin : receivetargetCheckins) {
            receivetargetCheckinVOS.add(new ReceivetargetCheckinVO(receivetargetCheckin));
        }
        return new Page<>(Page.CHCKIN_PER_PAGE_RECORD_NUM,totalRecordsNum,receivetargetCheckinVOS,currentPage);
    }

    @Override
    public int countPartReceivetargetCheckinByRoomNameAndBillState(String txtname, int isBillID) {
        HashMap<String, Object> parameters = new HashMap<>();
        parameters.put("txtname",txtname);
        parameters.put("isBillID",isBillID);
        return receivetargetCheckinMapper.countPartReceivetargetCheckinByRoomNameAndBillState(parameters);
    }

    @Override
    public ReceivetargetCheckin queryReceivetargetCheckinByReceivetargetCheckInId(String receivetargetCheckInId) {
        return receivetargetCheckinMapper.
                queryReceivetargetCheckinByReceivetargetCheckInId(receivetargetCheckInId);
    }
}
