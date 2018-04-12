package com.company.service.impl;

import com.company.bean.Attributevalue;
import com.company.mapper.AttributevalueMapper;
import com.company.service.AttributevalueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttributevalueServiceImpl implements AttributevalueService {

    @Autowired
    AttributevalueMapper attributevalueMapper;

    @Override
    public List<Attributevalue> queryAttributevalueByAid(int aid) {
        return attributevalueMapper.queryAttributevalueByAid(aid);
    }
}
