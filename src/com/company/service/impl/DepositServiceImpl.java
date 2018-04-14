package com.company.service.impl;

import com.company.bean.Deposit;
import com.company.mapper.DepositMapper;
import com.company.service.DepositService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DepositServiceImpl implements DepositService{

    @Autowired
    DepositMapper depositMapper;

    @Override
    public int insertSelective(Deposit record) {
        return depositMapper.insertSelective(record);
    }

    @Override
    public List<Deposit> queryDepositsByCheckID(String checkInId) {
        return depositMapper.queryDepositsByCheckID(checkInId);
    }
}
