package com.company.service;

import com.company.bean.Commodity;
import com.company.vo.MyPage;
import com.company.vo.CommodityQueryvo;

public interface CommodityService {

    MyPage<Commodity> findCommodityList(CommodityQueryvo vo);
}
