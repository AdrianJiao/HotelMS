package com.company.bean;

import java.util.Date;

public class Consumption {
    private String checkinid;

    private String commodityname;

    private Integer consumptionnumber;

    private Double consumptionmoney;

    private Date consumptiontime;

    public String getCheckinid() {
        return checkinid;
    }

    public void setCheckinid(String checkinid) {
        this.checkinid = checkinid == null ? null : checkinid.trim();
    }

    public String getCommodityname() {
        return commodityname;
    }

    public void setCommodityname(String commodityname) {
        this.commodityname = commodityname == null ? null : commodityname.trim();
    }

    public Integer getConsumptionnumber() {
        return consumptionnumber;
    }

    public void setConsumptionnumber(Integer consumptionnumber) {
        this.consumptionnumber = consumptionnumber;
    }

    public Double getConsumptionmoney() {
        return consumptionmoney;
    }

    public void setConsumptionmoney(Double consumptionmoney) {
        this.consumptionmoney = consumptionmoney;
    }

    public Date getConsumptiontime() {
        return consumptiontime;
    }

    public void setConsumptiontime(Date consumptiontime) {
        this.consumptiontime = consumptiontime;
    }
}