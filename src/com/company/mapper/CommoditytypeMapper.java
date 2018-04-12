package com.company.mapper;

import com.company.bean.Commoditytype;

import java.util.List;

public interface CommoditytypeMapper {
    /**
     * 通过id进行删除
     * @param commodityTypeID
     * @return
     */
    int deleteByPrimaryKey(String commodityTypeID);

    /**
     * 插入数据
     * @param record
     * @return
     */
    int insert(Commoditytype record);

    /**
     *插入一条数据，只插入不为null的字段，不会影响有默认值的字段
     * @param record
     * @return
     */
    int insertSelective(Commoditytype record);

    /**
     *通过id进行查询
     * @param commodityTypeID
     * @return
     */
    Commoditytype selectByPrimaryKey(String commodityTypeID);

    /**
     *更新
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Commoditytype record);

    /**
     *更新
     * @param record
     * @return
     */
    int updateByPrimaryKey(Commoditytype record);

    /**
     *查询所有
     * @return
     */
    List<Commoditytype> findAllCommoditytype();
}