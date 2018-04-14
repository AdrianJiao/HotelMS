package com.company.service.impl;

import com.company.bean.Deposit;
import com.company.mapper.DepositMapper;
import com.company.service.DepositService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepositServiceImpl implements DepositService{

    @Autowired
    DepositMapper depositMapper;

    @Override
    public int insertSelective(Deposit record) {
        return depositMapper.insertSelective(record);
    }
}
