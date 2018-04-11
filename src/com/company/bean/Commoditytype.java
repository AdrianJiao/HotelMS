package com.company.bean;

public class Commoditytype {
    private String commodityTypeID;

    private String commodityTypeName;

    public String getCommodityTypeID() {
        return commodityTypeID;
    }

    public void setCommodityTypeID(String commodityTypeID) {
        this.commodityTypeID = commodityTypeID == null ? null : commodityTypeID.trim();
    }

    public String getCommodityTypeName() {
        return commodityTypeName;
    }

    public void setCommodityTypeName(String commodityTypeName) {
        this.commodityTypeName = commodityTypeName == null ? null : commodityTypeName.trim();
    }
}