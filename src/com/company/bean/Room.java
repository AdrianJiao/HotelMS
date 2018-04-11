package com.company.bean;

public class Room {
    private String roomnumber;

    private String roomstateid;

    private Integer roomamount;

    private String guestroomlevelid;

    private Double standardpriceday;

    private Double standardprice;

    private Double maxduration;

    private Double firstprice;

    private Double firstduration;

    public String getRoomnumber() {
        return roomnumber;
    }

    public void setRoomnumber(String roomnumber) {
        this.roomnumber = roomnumber == null ? null : roomnumber.trim();
    }

    public String getRoomstateid() {
        return roomstateid;
    }

    public void setRoomstateid(String roomstateid) {
        this.roomstateid = roomstateid == null ? null : roomstateid.trim();
    }

    public Integer getRoomamount() {
        return roomamount;
    }

    public void setRoomamount(Integer roomamount) {
        this.roomamount = roomamount;
    }

    public String getGuestroomlevelid() {
        return guestroomlevelid;
    }

    public void setGuestroomlevelid(String guestroomlevelid) {
        this.guestroomlevelid = guestroomlevelid == null ? null : guestroomlevelid.trim();
    }

    public Double getStandardpriceday() {
        return standardpriceday;
    }

    public void setStandardpriceday(Double standardpriceday) {
        this.standardpriceday = standardpriceday;
    }

    public Double getStandardprice() {
        return standardprice;
    }

    public void setStandardprice(Double standardprice) {
        this.standardprice = standardprice;
    }

    public Double getMaxduration() {
        return maxduration;
    }

    public void setMaxduration(Double maxduration) {
        this.maxduration = maxduration;
    }

    public Double getFirstprice() {
        return firstprice;
    }

    public void setFirstprice(Double firstprice) {
        this.firstprice = firstprice;
    }

    public Double getFirstduration() {
        return firstduration;
    }

    public void setFirstduration(Double firstduration) {
        this.firstduration = firstduration;
    }
}