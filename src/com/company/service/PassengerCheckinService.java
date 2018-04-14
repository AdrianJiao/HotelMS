package com.company.service;

import com.company.bean.PassengerCheckin;
import com.company.utils.Page;
import com.company.vo.PassengerCheckinVO;

import java.util.List;
import java.util.Map;

public interface PassengerCheckinService {

    //分页查询
    Page<PassengerCheckinVO> queryPartPassengerCheckins(String txtname, int isBillID , int currentPage);

    //分页查询记录数量
    int countPartPassengerCheckinByRoomNameAndBillState(String txtname, int isBillID);
}
