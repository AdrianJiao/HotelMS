package com.company.service;

import com.company.bean.Commoditytype;
import org.springframework.stereotype.Service;

import java.util.List;
public interface CommoditytypeService {
    /**
     * 查询所有商品种类
     * @return
     */
    List<Commoditytype> findAllCommoditytype();

    /**
     * 增加商品种类
     * @param commoditytype
     * @return
     */
    int addCommodityType(Commoditytype commoditytype);

    /**
     * 删除商品种类
     * @param commodityTypeID
     * @return
     */
    int deleteCommodityType(String commodityTypeID);
}
