package com.company.service.impl;

import com.company.bean.PassengerCheckin;
import com.company.bean.Receivetarget;
import com.company.mapper.PassengerCheckinMapper;
import com.company.service.PassengerCheckinService;
import com.company.utils.Page;
import com.company.vo.PassengerCheckinVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

@Service
public class PassengerCheckinServiceImpl implements PassengerCheckinService {

    @Autowired
    PassengerCheckinMapper passengerCheckinMapper;

    //注意这里使用的是PassengerCheckinVO类
    @Override
    public Page<PassengerCheckinVO> queryPartPassengerCheckins(String txtname, int isBillID, int currentPage) {

        //统计符合要求的总条数
        int totalRecordsNum = countPartPassengerCheckinByRoomNameAndBillState(txtname,isBillID);

        HashMap<String, Object> parameters = new HashMap<>();
        parameters.put("limit",Page.CHCKIN_PER_PAGE_RECORD_NUM);
        parameters.put("offset",(currentPage - 1) * Page.CHCKIN_PER_PAGE_RECORD_NUM);
        parameters.put("txtname",txtname);
        parameters.put("isBillID",isBillID);

        List<PassengerCheckin> passengerCheckins = passengerCheckinMapper.queryPartPassengerCheckins(parameters);

        //将PassengerCheckin装换为PassengerCheckinVO
        List<PassengerCheckinVO> passengerCheckinVOS = new LinkedList<>();
        for (PassengerCheckin passengerCheckin : passengerCheckins) {
            passengerCheckinVOS.add(new PassengerCheckinVO(passengerCheckin));
        }
        return new Page<>(Page.CHCKIN_PER_PAGE_RECORD_NUM,totalRecordsNum,passengerCheckinVOS,currentPage);
    }

    @Override
    public int countPartPassengerCheckinByRoomNameAndBillState(String txtname, int isBillID) {
        HashMap<String, Object> parameters = new HashMap<>();
        parameters.put("txtname",txtname);
        parameters.put("isBillID",isBillID);
        return passengerCheckinMapper.countPartPassengerCheckinByRoomNameAndBillState(parameters);
    }

    @Override
    public int insert(PassengerCheckin record) {
        return passengerCheckinMapper.insert(record);
    }

    @Override
    public int insertSelective(PassengerCheckin record) {
        return passengerCheckinMapper.insertSelective(record);
    }

    @Override
    public PassengerCheckin queryPassengerCheckinByPassengerCheckInId(String passengerCheckInId) {
        return passengerCheckinMapper.queryPassengerCheckinByPassengerCheckInId(passengerCheckInId);
    }

    @Override
    public int updateByPrimaryKeySelective(PassengerCheckin record) {
        return passengerCheckinMapper.updateByPrimaryKeySelective(record);
    }
}
