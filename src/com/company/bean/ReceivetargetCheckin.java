package com.company.bean;

import java.util.Date;

public class ReceivetargetCheckin {
    private String receivetargetcheckinid;

    private Integer tid;

    private Integer pid;

    private String roomnumber;

    private Date registertime;

    private String rentouttypeid;

    private String passengertypeid;

    private Double staynumber;

    private String billunitid;

    private String depositpaywayid;

    private Integer changingroomnumber;

    private Double changroommoney;

    private Date changroomtime;

    private Double sumconst;

    private String isbillid;

    private Date paytime;

    public String getReceivetargetcheckinid() {
        return receivetargetcheckinid;
    }

    public void setReceivetargetcheckinid(String receivetargetcheckinid) {
        this.receivetargetcheckinid = receivetargetcheckinid == null ? null : receivetargetcheckinid.trim();
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getRoomnumber() {
        return roomnumber;
    }

    public void setRoomnumber(String roomnumber) {
        this.roomnumber = roomnumber == null ? null : roomnumber.trim();
    }

    public Date getRegistertime() {
        return registertime;
    }

    public void setRegistertime(Date registertime) {
        this.registertime = registertime;
    }

    public String getRentouttypeid() {
        return rentouttypeid;
    }

    public void setRentouttypeid(String rentouttypeid) {
        this.rentouttypeid = rentouttypeid == null ? null : rentouttypeid.trim();
    }

    public String getPassengertypeid() {
        return passengertypeid;
    }

    public void setPassengertypeid(String passengertypeid) {
        this.passengertypeid = passengertypeid == null ? null : passengertypeid.trim();
    }

    public Double getStaynumber() {
        return staynumber;
    }

    public void setStaynumber(Double staynumber) {
        this.staynumber = staynumber;
    }

    public String getBillunitid() {
        return billunitid;
    }

    public void setBillunitid(String billunitid) {
        this.billunitid = billunitid == null ? null : billunitid.trim();
    }

    public String getDepositpaywayid() {
        return depositpaywayid;
    }

    public void setDepositpaywayid(String depositpaywayid) {
        this.depositpaywayid = depositpaywayid == null ? null : depositpaywayid.trim();
    }

    public Integer getChangingroomnumber() {
        return changingroomnumber;
    }

    public void setChangingroomnumber(Integer changingroomnumber) {
        this.changingroomnumber = changingroomnumber;
    }

    public Double getChangroommoney() {
        return changroommoney;
    }

    public void setChangroommoney(Double changroommoney) {
        this.changroommoney = changroommoney;
    }

    public Date getChangroomtime() {
        return changroomtime;
    }

    public void setChangroomtime(Date changroomtime) {
        this.changroomtime = changroomtime;
    }

    public Double getSumconst() {
        return sumconst;
    }

    public void setSumconst(Double sumconst) {
        this.sumconst = sumconst;
    }

    public String getIsbillid() {
        return isbillid;
    }

    public void setIsbillid(String isbillid) {
        this.isbillid = isbillid == null ? null : isbillid.trim();
    }

    public Date getPaytime() {
        return paytime;
    }

    public void setPaytime(Date paytime) {
        this.paytime = paytime;
    }
}