package com.company.service;

import com.company.bean.ReceivetargetCheckin;
import com.company.utils.Page;
import com.company.vo.ReceivetargetCheckinVO;

public interface ReceivetargetCheckinService {

    //插入数据
    int insert(ReceivetargetCheckin record);

    //选择性插入
    int insertSelective(ReceivetargetCheckin record);

    //更新旅客信息
    int updateByPrimaryKeySelective(ReceivetargetCheckin record);

    //分页查询
    Page<ReceivetargetCheckinVO> queryPartReceivetargetCheckins(String txtname, int isBillID, int currentPage);

    //分页查询记录数量
    int countPartReceivetargetCheckinByRoomNameAndBillState(String txtname, int isBillID);

    //根据receivetargetCheckInId查到ReceivetargetCheckin数据
    ReceivetargetCheckin queryReceivetargetCheckinByReceivetargetCheckInId(String receivetargetCheckInId);
}
