package com.company.bean;

import java.util.Date;

public class ReceivetargetReserve {
    private String receivetargetreserveid;

    private Integer tid;

    private String roomnumber;

    private Integer predetermineday;

    private Double deposit;

    private String paywayid;

    private Date arrivetime;

    private String reservestate;

    public String getReceivetargetreserveid() {
        return receivetargetreserveid;
    }

    public void setReceivetargetreserveid(String receivetargetreserveid) {
        this.receivetargetreserveid = receivetargetreserveid == null ? null : receivetargetreserveid.trim();
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getRoomnumber() {
        return roomnumber;
    }

    public void setRoomnumber(String roomnumber) {
        this.roomnumber = roomnumber == null ? null : roomnumber.trim();
    }

    public Integer getPredetermineday() {
        return predetermineday;
    }

    public void setPredetermineday(Integer predetermineday) {
        this.predetermineday = predetermineday;
    }

    public Double getDeposit() {
        return deposit;
    }

    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }

    public String getPaywayid() {
        return paywayid;
    }

    public void setPaywayid(String paywayid) {
        this.paywayid = paywayid == null ? null : paywayid.trim();
    }

    public Date getArrivetime() {
        return arrivetime;
    }

    public void setArrivetime(Date arrivetime) {
        this.arrivetime = arrivetime;
    }

    public String getReservestate() {
        return reservestate;
    }

    public void setReservestate(String reservestate) {
        this.reservestate = reservestate == null ? null : reservestate.trim();
    }
}