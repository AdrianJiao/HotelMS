package com.company.bean;

import java.util.Date;

public class Receivetarget {
    private Integer tid;

    private String targettypeid;

    private String principal;

    private String teamname;

    private String teamcode;

    private Date registertime;

    private String contactphonenumber;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTargettypeid() {
        return targettypeid;
    }

    public void setTargettypeid(String targettypeid) {
        this.targettypeid = targettypeid == null ? null : targettypeid.trim();
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal == null ? null : principal.trim();
    }

    public String getTeamname() {
        return teamname;
    }

    public void setTeamname(String teamname) {
        this.teamname = teamname == null ? null : teamname.trim();
    }

    public String getTeamcode() {
        return teamcode;
    }

    public void setTeamcode(String teamcode) {
        this.teamcode = teamcode == null ? null : teamcode.trim();
    }

    public Date getRegistertime() {
        return registertime;
    }

    public void setRegistertime(Date registertime) {
        this.registertime = registertime;
    }

    public String getContactphonenumber() {
        return contactphonenumber;
    }

    public void setContactphonenumber(String contactphonenumber) {
        this.contactphonenumber = contactphonenumber == null ? null : contactphonenumber.trim();
    }
}