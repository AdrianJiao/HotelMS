package com.company.service;

import com.company.bean.Attributevalue;

import java.util.List;

public interface AttributevalueService {
    List<Attributevalue> queryAttributevalueByAid(int aid);
    Attributevalue queryAttributevalueByFar_id(Integer far_id);
}
