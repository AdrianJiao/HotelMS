package com.company.service.impl;

import com.company.bean.Commodity;
import com.company.mapper.CommodityMapper;
import com.company.service.CommodityService;
import com.company.vo.MyPage;
import com.company.vo.CommodityQueryvo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommodityServiceImpl implements CommodityService{
    @Autowired
    CommodityMapper commodityMapper;

    @Override
    public MyPage<Commodity> findCommodityList(CommodityQueryvo vo) {

        //commodityMapper

        //commodityMapper.findCommodityList(QueryVo vo);


        return null;
    }
}
