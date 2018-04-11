package com.company.mapper;

import com.company.bean.ReceivetargetCheckin;

public interface ReceivetargetCheckinMapper {
    int deleteByPrimaryKey(String receivetargetcheckinid);

    int insert(ReceivetargetCheckin record);

    int insertSelective(ReceivetargetCheckin record);

    ReceivetargetCheckin selectByPrimaryKey(String receivetargetcheckinid);

    int updateByPrimaryKeySelective(ReceivetargetCheckin record);

    int updateByPrimaryKey(ReceivetargetCheckin record);
}