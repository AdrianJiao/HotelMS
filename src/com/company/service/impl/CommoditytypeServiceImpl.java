package com.company.service.impl;

import com.company.bean.Commoditytype;
import com.company.mapper.CommoditytypeMapper;
import com.company.service.CommoditytypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommoditytypeServiceImpl implements CommoditytypeService {
    @Autowired
    CommoditytypeMapper commoditytypeMapper;

    /**
     * 查询所有商品分类数据
     * @return 所有商品分类集合
     */
    @Override
    public List<Commoditytype> findCommoditytypeList() {
        return commoditytypeMapper.findCommoditytypeList();
    }

    @Override
    public void newAdd(Commoditytype co) {
        commoditytypeMapper.insert(co);
    }

    @Override
    public void newdeleteById(String id) {
        commoditytypeMapper.deleteByPrimaryKey(id);
    }
}
