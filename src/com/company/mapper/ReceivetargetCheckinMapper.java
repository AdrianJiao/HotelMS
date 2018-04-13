package com.company.mapper;

import com.company.bean.ReceivetargetCheckin;

import java.util.Map;

public interface ReceivetargetCheckinMapper {
    int deleteByPrimaryKey(String receivetargetCheckInId);

    int insert(ReceivetargetCheckin record);

    int insertSelective(ReceivetargetCheckin record);

    ReceivetargetCheckin selectByPrimaryKey(String receivetargetCheckInId);

    int updateByPrimaryKeySelective(ReceivetargetCheckin record);

    int updateByPrimaryKey(ReceivetargetCheckin record);
}