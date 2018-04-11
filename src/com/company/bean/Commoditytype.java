package com.company.bean;

public class Commoditytype {
    private String commoditytypeid;

    private String txtname;

    public String getCommoditytypeid() {
        return commoditytypeid;
    }

    public void setCommoditytypeid(String commoditytypeid) {
        this.commoditytypeid = commoditytypeid == null ? null : commoditytypeid.trim();
    }

    public String getTxtname() {
        return txtname;
    }

    public void setTxtname(String txtname) {
        this.txtname = txtname == null ? null : txtname.trim();
    }
}