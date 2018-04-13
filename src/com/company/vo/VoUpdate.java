package com.company.vo;

import com.company.bean.Commodity;

import java.io.Serializable;

public class VoUpdate implements Serializable{

    private Commodity commodity;

    private String id;

    @Override
    public String toString() {
        return "VoUpdate{" +
                "commodity=" + commodity +
                ", id='" + id + '\'' +
                '}';
    }

    public Commodity getCommodity() {
        return commodity;
    }

    public void setCommodity(Commodity commodity) {
        this.commodity = commodity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
