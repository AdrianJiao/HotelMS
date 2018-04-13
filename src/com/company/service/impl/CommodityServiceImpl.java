package com.company.service.impl;

import com.company.bean.Commodity;
import com.company.mapper.CommodityMapper;
import com.company.mapper.CommoditytypeMapper;
import com.company.service.CommodityService;
import com.company.utils.MyException;
import com.company.vo.CommodityPage;
import com.company.vo.Page;
import com.company.vo.CommodityQueryvo;
import com.company.vo.VoUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommodityServiceImpl implements CommodityService {
    @Autowired
    CommodityMapper commodityMapper;

    @Autowired
    CommoditytypeMapper commoditytypeMapper;

    @Override
    public Page<CommodityPage> findCommodityList(CommodityQueryvo vo) {

        Page<CommodityPage> page = new Page<CommodityPage>();
        page.setSize(10);
        vo.setSize(10);
        if (vo != null) {

            if (null != vo.getPage()) {
                //获取当前页
                page.setPage(vo.getPage());
//                vo.setPage(page.getPage());
                vo.setStartrow((vo.getPage() - 1) * vo.getSize());
//                page.setPage(vo.getPage());
            }

            if (null != vo.getCommodityTypeID()) {
                //获取商品分类名称的ID
//                commoditytypeMapper.findCommoditytypeIdByName(vo.getCommodityTypeID())
                vo.setCommodityTypeID(vo.getCommodityTypeID());
            }
        }


        //获取结果集
        page.setRows(commodityMapper.findPageCommodity(vo));


        //获取总条数
        vo.setCommodityTypeID(vo.getCommodityTypeID());
        page.setTotal(commodityMapper.findAllCommodityCount(vo));
        //System.out.println(commodityMapper.findAllCommodityCount(vo));
        int totalpage = 0;
        if (page.getTotal() % page.getSize() == 0) {
            totalpage = page.getTotal() / page.getSize();
        } else {
            totalpage = page.getTotal() / page.getSize() + 1;
        }

        page.setTotalpage(totalpage);

        return page;
    }

    @Override
    public boolean addCommodity(Commodity commodity) {
        int isAddSuccess = commodityMapper.insert(commodity);
        return isAddSuccess > 0 ? true : false;
    }

    @Override
    public int checkAddCommodityName(String commodityName) {
        return commodityMapper.checkAddCommodityName(commodityName);
    }

    @Override
    public List<Commodity> findCommodityList() {
        return commodityMapper.findCommodityList();
    }

    @Override
    public Commodity findCommodityByName(String id) {
        return commodityMapper.findCommodityByName(id);
    }

    @Override
    public void updateCommodity(String id, Commodity commodity) {
        VoUpdate voUpdate = new VoUpdate();
        voUpdate.setCommodity(commodity);
        voUpdate.setId(id);
        commodityMapper.updateCommodityById(voUpdate);

    }

    @Override
    public boolean deleteCommodityById(String id) {
        String[] strings = id.split(",");
        int isDeleteSuccess = 0;
        for (String s : strings) {
            try {

                isDeleteSuccess = commodityMapper.deleteByPrimaryKey(s);

            } catch (Exception ex) {

                throw new RuntimeException("商品删除异常");
            }
        }
        return isDeleteSuccess > 0 ? true : false;
    }
}
