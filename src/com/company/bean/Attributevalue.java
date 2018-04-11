package com.company.bean;

public class Attributevalue {
    private Integer far_id;

    private Integer aid;

    private String attributeDetailsName;

    public Integer getFar_id() {
        return far_id;
    }

    public void setFar_id(Integer far_id) {
        this.far_id = far_id;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAttributeDetailsName() {
        return attributeDetailsName;
    }

    public void setAttributeDetailsName(String attributeDetailsName) {
        this.attributeDetailsName = attributeDetailsName == null ? null : attributeDetailsName.trim();
    }
}