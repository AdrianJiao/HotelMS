package com.company.service.impl;

import com.company.bean.PassengerReserve;
import com.company.bean.ReceivetargetReserve;
import com.company.mapper.ReceivetargetReserveMapper;
import com.company.service.ReceivetargetReserveService;
import com.company.utils.Page;
import com.company.vo.PassengerReserveVO;
import com.company.vo.ReceivetargetReserveVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

@Service
public class ReceivetargetReserveServiceImpl implements ReceivetargetReserveService {

    @Autowired
    ReceivetargetReserveMapper receivetargetReserveMapper;

    @Override
    public Page<ReceivetargetReserveVO> queryPartReceivetargetReserves(String txtname, int reserveState, int currentPage) {
        //统计符合要求的总条数
        int totalRecordsNum = countPartReceivetargetReserveByNameAndReserveState (txtname,reserveState);

        HashMap<String, Object> parameters = new HashMap<>();
        parameters.put("limit", Page.RRESERVE_PER_PAGE_RECORD_NUM);
        parameters.put("offset",(currentPage - 1) * Page.RRESERVE_PER_PAGE_RECORD_NUM);
        parameters.put("txtname",txtname);
        parameters.put("reserveState",reserveState);

        List<ReceivetargetReserve> receivetargetReserves = receivetargetReserveMapper.queryPartReceivetargetReserves(parameters);

        //转换
        List<ReceivetargetReserveVO> receivetargetReserveVOS = new LinkedList<>();

        for (ReceivetargetReserve receivetargetReserve : receivetargetReserves) {
            receivetargetReserveVOS.add(new ReceivetargetReserveVO(receivetargetReserve));
        }

        return new Page<>(Page.RRESERVE_PER_PAGE_RECORD_NUM, totalRecordsNum, receivetargetReserveVOS, currentPage);
    }

    @Override
    public int countPartReceivetargetReserveByNameAndReserveState(String txtname, int reserveState) {
        HashMap<String, Object> parameters = new HashMap<>();
        parameters.put("txtname",txtname);
        parameters.put("reserveState",reserveState);
        return receivetargetReserveMapper.countPartReceivetargetReserveByNameAndReserveState(parameters);
    }
}
