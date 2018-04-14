package com.company.vo;

public class CommodityPage {

    private String commodityName;
    private String commodityTypeName;
    private String uOMID;
    private double salePrice;

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public String getCommodityTypeName() {
        return commodityTypeName;
    }

    public void setCommodityTypeName(String commodityTypeName) {
        this.commodityTypeName = commodityTypeName;
    }

    public String getuOMID() {
        return uOMID;
    }

    public void setuOMID(String uOMID) {
        this.uOMID = uOMID;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }
}
