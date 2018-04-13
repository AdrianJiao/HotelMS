package com.company.service;

import com.company.bean.Commodity;
import com.company.vo.CommodityPage;
import com.company.vo.Page;
import com.company.vo.CommodityQueryvo;

import java.util.List;

public interface CommodityService {

    Page<CommodityPage> findCommodityList(CommodityQueryvo vo);

    boolean addCommodity(Commodity commodity);

    int checkAddCommodityName(String commodityName);

    List<Commodity> findCommodityList();

    Commodity findCommodityByName(String id);

    void updateCommodity(String id, Commodity commodity);

    boolean deleteCommodityById(String id);
}
