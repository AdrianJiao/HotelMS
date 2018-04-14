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

    //插入数据
    int insert(PassengerCheckin record);

    //选择性插入
    int insertSelective(PassengerCheckin record);

    //根据passengerCheckInId查到PassengerCheckin数据
    PassengerCheckin queryPassengerCheckinByPassengerCheckInId(String passengerCheckInId);

    //更新旅客信息
    int updateByPrimaryKeySelective(PassengerCheckin record);
}
