package com.company.bean;

public class Commoditytype {
    private String commodityTypeID;

    private String txtname;

    public String getCommodityTypeID() {
        return commodityTypeID;
    }

    public void setCommodityTypeID(String commodityTypeID) {
        this.commodityTypeID = commodityTypeID == null ? null : commodityTypeID.trim();
    }

    public String getTxtname() {
        return txtname;
    }

    public void setTxtname(String txtname) {
        this.txtname = txtname == null ? null : txtname.trim();
    }
}