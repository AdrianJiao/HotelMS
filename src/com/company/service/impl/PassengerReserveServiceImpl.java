package com.company.service.impl;


import com.company.bean.PassengerReserve;
import com.company.mapper.PassengerReserveMapper;
import com.company.service.PassengerReserveService;
import com.company.utils.Page;
import com.company.vo.PassengerReserveVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

@Service
public class PassengerReserveServiceImpl implements PassengerReserveService{

    @Autowired
    PassengerReserveMapper passengerReserveMapper;


    @Override
    public Page<PassengerReserveVO> queryPartPassengerReserves(String txtname, int reserveState, int currentPage) {
        //统计符合要求的总条数
        int totalRecordsNum = countPartPassengerReserveByNameAndReserveState(txtname,reserveState);

        HashMap<String, Object> parameters = new HashMap<>();
        parameters.put("limit", Page.RRESERVE_PER_PAGE_RECORD_NUM);
        parameters.put("offset",(currentPage - 1) * Page.RRESERVE_PER_PAGE_RECORD_NUM);
        parameters.put("txtname",txtname);
        parameters.put("reserveState",reserveState);

        List<PassengerReserve> passengerReserves = passengerReserveMapper.queryPartPassengerReserves(parameters);

        //转换
        List<PassengerReserveVO> passengerReserveVOS = new LinkedList<>();
        for (PassengerReserve passengerReserve : passengerReserves) {
            passengerReserveVOS.add(new PassengerReserveVO(passengerReserve));
        }
        return new Page<>(Page.RRESERVE_PER_PAGE_RECORD_NUM, totalRecordsNum, passengerReserveVOS, currentPage);
    }

    @Override
    public int countPartPassengerReserveByNameAndReserveState(String txtname, int reserveState) {
        HashMap<String, Object> parameters = new HashMap<>();
        parameters.put("txtname",txtname);
        parameters.put("reserveState",reserveState);
        return passengerReserveMapper.countPartPassengerReserveByNameAndReserveState(parameters);
    }

    /**
     * 选择性插入
     * @param passengerReserve
     * @return
     */
    @Override
    public int insertSelective(PassengerReserve passengerReserve) {
        return passengerReserveMapper.insertSelective(passengerReserve);
    }
}
