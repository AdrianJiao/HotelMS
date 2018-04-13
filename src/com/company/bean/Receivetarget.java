package com.company.bean;

import java.util.Date;

public class Receivetarget {
    private Integer tid;

    private String targetTypeID;

    private String principal;

    private String teamName;

    private String teamCode;

    private Date registerTime;

    private String contactPhoneNUmber;

    private String targetTypeName;

    public String getTargetTypeName() {
        return targetTypeName;
    }

    public void setTargetTypeName(String targetTypeName) {
        this.targetTypeName = targetTypeName;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTargetTypeID() {
        return targetTypeID;
    }

    public void setTargetTypeID(String targetTypeID) {
        this.targetTypeID = targetTypeID == null ? null : targetTypeID.trim();
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal == null ? null : principal.trim();
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName == null ? null : teamName.trim();
    }

    public String getTeamCode() {
        return teamCode;
    }

    public void setTeamCode(String teamCode) {
        this.teamCode = teamCode == null ? null : teamCode.trim();
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public String getContactPhoneNUmber() {
        return contactPhoneNUmber;
    }

    public void setContactPhoneNUmber(String contactPhoneNUmber) {
        this.contactPhoneNUmber = contactPhoneNUmber == null ? null : contactPhoneNUmber.trim();
    }

    @Override
    public String toString() {
        return "Receivetarget{" +
                "tid=" + tid +
                ", targetTypeID='" + targetTypeID + '\'' +
                ", principal='" + principal + '\'' +
                ", teamName='" + teamName + '\'' +
                ", teamCode='" + teamCode + '\'' +
                ", registerTime=" + registerTime +
                ", contactPhoneNUmber='" + contactPhoneNUmber + '\'' +
                ", targetTypeName='" + targetTypeName + '\'' +
                '}';
    }
}