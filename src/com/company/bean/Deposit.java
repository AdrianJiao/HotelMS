package com.company.bean;

import java.util.Date;

public class Deposit {
    private String checkinid;

    private Date depositregistertime;

    private Double deposit;

    private String depositpaywayname;

    public String getCheckinid() {
        return checkinid;
    }

    public void setCheckinid(String checkinid) {
        this.checkinid = checkinid == null ? null : checkinid.trim();
    }

    public Date getDepositregistertime() {
        return depositregistertime;
    }

    public void setDepositregistertime(Date depositregistertime) {
        this.depositregistertime = depositregistertime;
    }

    public Double getDeposit() {
        return deposit;
    }

    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }

    public String getDepositpaywayname() {
        return depositpaywayname;
    }

    public void setDepositpaywayname(String depositpaywayname) {
        this.depositpaywayname = depositpaywayname == null ? null : depositpaywayname.trim();
    }
}