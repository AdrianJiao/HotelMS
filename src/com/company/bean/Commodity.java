package com.company.bean;

public class Commodity {
    private String commodityname;

    private String commoditytypeid;

    private Double saleprice;

    private String uomid;

    public String getCommodityname() {
        return commodityname;
    }

    public void setCommodityname(String commodityname) {
        this.commodityname = commodityname == null ? null : commodityname.trim();
    }

    public String getCommoditytypeid() {
        return commoditytypeid;
    }

    public void setCommoditytypeid(String commoditytypeid) {
        this.commoditytypeid = commoditytypeid == null ? null : commoditytypeid.trim();
    }

    public Double getSaleprice() {
        return saleprice;
    }

    public void setSaleprice(Double saleprice) {
        this.saleprice = saleprice;
    }

    public String getUomid() {
        return uomid;
    }

    public void setUomid(String uomid) {
        this.uomid = uomid == null ? null : uomid.trim();
    }
}