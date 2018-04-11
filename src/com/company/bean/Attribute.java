package com.company.bean;

public class Attribute {
    private Integer far_id;

    private String attributeName;

    public Integer getFar_id() {
        return far_id;
    }

    public void setFar_id(Integer far_id) {
        this.far_id = far_id;
    }

    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName == null ? null : attributeName.trim();
    }
}