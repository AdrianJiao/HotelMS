package com.company.bean;

public class Attribute {
    private Integer aid;

    private String attributeName;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName == null ? null : attributeName.trim();
    }

    @Override
    public String toString() {
        return "Attribute{" +
                "aid=" + aid +
                ", attributeName='" + attributeName + '\'' +
                '}';
    }
}