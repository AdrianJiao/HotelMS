package com.company.mapper;

import com.company.bean.Commodity;
import com.company.utils.Page;
import com.company.vo.CommodityPage;
import com.company.vo.CommodityQueryvo;
import com.company.vo.VoUpdate;

import java.util.List;

public interface CommodityMapper {
    int deleteByPrimaryKey(String commodityName);

    int insert(Commodity record);

    int insertSelective(Commodity record);

    Commodity selectByPrimaryKey(String commodityName);

    int updateByPrimaryKeySelective(Commodity record);

    int updateByPrimaryKey(Commodity record);

    //查询分类商品分页对象
    List<CommodityPage> findPageCommodity(CommodityQueryvo vo);

    //查询分类商品的总条数
    Integer findAllCommodityCount(CommodityQueryvo vo);

    //验证商品名是否已经存在
    int checkAddCommodityName(String commodityName);
    //查询所有商品
    List<Commodity> findCommodityList();
    //按商品名进行查询
    Commodity findCommodityByName(String id);
    //按商品名修改商品
    void updateCommodityById(VoUpdate voUpdate);
}