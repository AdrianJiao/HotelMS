package com.company.bean;

public class Commodity {
    private String commodityName;

    private String commodityTypeID;

    private Double salePrice;

    private String uOMID;

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName == null ? null : commodityName.trim();
    }

    public String getCommodityTypeID() {
        return commodityTypeID;
    }

    public void setCommodityTypeID(String commodityTypeID) {
        this.commodityTypeID = commodityTypeID == null ? null : commodityTypeID.trim();
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public String getuOMID() {
        return uOMID;
    }

    public void setuOMID(String uOMID) {

        this.uOMID = uOMID == null ? null : uOMID.trim();
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "commodityName='" + commodityName + '\'' +
                ", commodityTypeID='" + commodityTypeID + '\'' +
                ", salePrice=" + salePrice +
                ", uOMID='" + uOMID + '\'' +
                '}';
    }
}