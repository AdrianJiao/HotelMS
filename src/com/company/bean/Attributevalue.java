package com.company.bean;

public class Attributevalue {
    private Integer id;

    private Integer far_id;

    private String attributeDetailsName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFar_id() {
        return far_id;
    }

    public void setFar_id(Integer far_id) {
        this.far_id = far_id;
    }

    public String getAttributeDetailsName() {
        return attributeDetailsName;
    }

    public void setAttributeDetailsName(String attributeDetailsName) {
        this.attributeDetailsName = attributeDetailsName == null ? null : attributeDetailsName.trim();
    }
}