package com.company.bean;

import java.util.Date;

public class Deposit {
    private String checkInId;

    private Date depositRegisterTime;

    private Double deposit;

    private String depositPayWayId;

    //depositPayWayName是对应depositPayWayId查出来的参数
    private String depositPayWayName;

    public String getDepositPayWayName() {
        return depositPayWayName;
    }

    public void setDepositPayWayName(String depositPayWayName) {
        this.depositPayWayName = depositPayWayName;
    }

    public String getCheckInId() {
        return checkInId;
    }

    public void setCheckInId(String checkInId) {
        this.checkInId = checkInId == null ? null : checkInId.trim();
    }

    public Date getDepositRegisterTime() {
        return depositRegisterTime;
    }

    public void setDepositRegisterTime(Date depositRegisterTime) {
        this.depositRegisterTime = depositRegisterTime;
    }

    public Double getDeposit() {
        return deposit;
    }

    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }

    public String getDepositPayWayId() {
        return depositPayWayId;
    }

    public void setDepositPayWayId(String depositPayWayId) {
        this.depositPayWayId = depositPayWayId == null ? null : depositPayWayId.trim();
    }

    @Override
    public String toString() {
        return "Deposit{" +
                "checkInId='" + checkInId + '\'' +
                ", depositRegisterTime=" + depositRegisterTime +
                ", deposit=" + deposit +
                ", depositPayWayId='" + depositPayWayId + '\'' +
                ", depositPayWayName='" + depositPayWayName + '\'' +
                '}';
    }
}