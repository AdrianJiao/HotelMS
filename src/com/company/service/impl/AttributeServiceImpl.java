package com.company.service.impl;

import com.company.mapper.AttributeMapper;
import com.company.service.AttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttributeServiceImpl implements AttributeService {

    @Autowired
    AttributeMapper attributeMapper;

    @Override
    public int queryAidByAttributeName(String attributeName) {
        return attributeMapper.queryAidByAttributeName(attributeName);
    }
}
