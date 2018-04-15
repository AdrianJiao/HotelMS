package com.company.mapper;

import com.company.bean.ReceivetargetCheckin;

import java.util.List;
import java.util.Map;

public interface ReceivetargetCheckinMapper {
    int deleteByPrimaryKey(String receivetargetCheckInId);

    int insert(ReceivetargetCheckin record);

    int insertSelective(ReceivetargetCheckin record);

    ReceivetargetCheckin selectByPrimaryKey(String receivetargetCheckInId);

    int updateByPrimaryKeySelective(ReceivetargetCheckin record);

    int updateByPrimaryKey(ReceivetargetCheckin record);

    //分页和模糊查询
    List<ReceivetargetCheckin> queryPartReceivetargetCheckins(Map<String,Object> map);

    //计算分页和模糊查询的总记录数
    int countPartReceivetargetCheckinByRoomNameAndBillState(Map<String,Object> map);

    //根据receivetargetCheckInId查到ReceivetargetCheckin数据
    ReceivetargetCheckin queryReceivetargetCheckinByReceivetargetCheckInId(String receivetargetCheckInId);
}