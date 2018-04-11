package com.company.bean;

import java.util.Date;

public class Consumption {
    private String checkInId;

    private String commodityName;

    private Integer consumptionNumber;

    private Double consumptionMoney;

    private Date consumptionTime;

    public String getCheckInId() {
        return checkInId;
    }

    public void setCheckInId(String checkInId) {
        this.checkInId = checkInId == null ? null : checkInId.trim();
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName == null ? null : commodityName.trim();
    }

    public Integer getConsumptionNumber() {
        return consumptionNumber;
    }

    public void setConsumptionNumber(Integer consumptionNumber) {
        this.consumptionNumber = consumptionNumber;
    }

    public Double getConsumptionMoney() {
        return consumptionMoney;
    }

    public void setConsumptionMoney(Double consumptionMoney) {
        this.consumptionMoney = consumptionMoney;
    }

    public Date getConsumptionTime() {
        return consumptionTime;
    }

    public void setConsumptionTime(Date consumptionTime) {
        this.consumptionTime = consumptionTime;
    }
}