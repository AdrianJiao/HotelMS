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
     *查询所有商品种类
     * @return
     */
    @Override
    public List<Commoditytype> findAllCommoditytype() {
        return commoditytypeMapper.findAllCommoditytype();
    }

    /**
     * 增加商品种类
     * @param commoditytype
     * @return
     */
    @Override
    public int addCommodityType(Commoditytype commoditytype) {
        return commoditytypeMapper.insert(commoditytype);
    }

    /**
     * 删除商品种类
     * @param commodityTypeID
     * @return
     */
    @Override
    public int deleteCommodityType(String commodityTypeID) {
        return commoditytypeMapper.deleteByPrimaryKey(commodityTypeID);
    }
}
