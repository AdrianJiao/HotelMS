package com.company.mapper;
import com.company.bean.ReceivetargetReserve;

import java.util.List;
import java.util.Map;

public interface ReceivetargetReserveMapper {
    int deleteByPrimaryKey(String receivetargetReserveId);

    int insert(ReceivetargetReserve record);

    int insertSelective(ReceivetargetReserve record);

    ReceivetargetReserve selectByPrimaryKey(String receivetargetReserveId);

    int updateByPrimaryKeySelective(ReceivetargetReserve record);

    int updateByPrimaryKey(ReceivetargetReserve record);

    //分页和模糊查询
    List<ReceivetargetReserve> queryPartReceivetargetReserves(Map<String,Object> map);

    //计算分页和模糊查询的总记录数
    int countPartReceivetargetReserveByNameAndReserveState(Map<String,Object> map);
}