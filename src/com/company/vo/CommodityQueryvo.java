package com.company.vo;

import com.company.bean.Commodity;

public class CommodityQueryvo {
    //需要输入的商品名称
    private String txtname;
    //商品类别名称
    private String commodityTypeID;
    //当前页面
    private Integer page;
    //每页显示数量
    private Integer size = 10 ;
    //开始行
    private Integer startrow = 0;

    public Integer getStartrow() {
        return startrow;
    }

    public void setStartrow(Integer startrow) {
        this.startrow = startrow;
    }

    public String getTxtname() {
        return txtname;
    }

    public void setTxtname(String txtname) {
        this.txtname = txtname;
    }

    public String getCommodityTypeID() {
        return commodityTypeID;
    }

    public void setCommodityTypeID(String commodityTypeID) {
        this.commodityTypeID = commodityTypeID;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "CommodityQueryvo{" +
                "txtname='" + txtname + '\'' +
                ", commodityTypeID='" + commodityTypeID + '\'' +
                ", page=" + page +
                ", size=" + size +
                ", startrow=" + startrow +
                '}';
    }
}
