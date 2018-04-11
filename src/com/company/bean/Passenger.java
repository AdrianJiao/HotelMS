package com.company.bean;

import java.util.Date;

public class Passenger {
    private Integer pid;

    private String name;

    private String genderid;

    private Date birthdate;

    private String nationid;

    private String licenceissuingauthorty;

    private Date papersvalidity;

    private String profession;

    private String educationdegreeid;

    private String passengerlevelid;

    private String papersid;

    private String papersnumber;

    private String unitsoraddress;

    private String thingreasonid;

    private String wherearefrom;

    private String wheretogo;

    private String contactphonenumber;

    private String remarks;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getGenderid() {
        return genderid;
    }

    public void setGenderid(String genderid) {
        this.genderid = genderid == null ? null : genderid.trim();
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getNationid() {
        return nationid;
    }

    public void setNationid(String nationid) {
        this.nationid = nationid == null ? null : nationid.trim();
    }

    public String getLicenceissuingauthorty() {
        return licenceissuingauthorty;
    }

    public void setLicenceissuingauthorty(String licenceissuingauthorty) {
        this.licenceissuingauthorty = licenceissuingauthorty == null ? null : licenceissuingauthorty.trim();
    }

    public Date getPapersvalidity() {
        return papersvalidity;
    }

    public void setPapersvalidity(Date papersvalidity) {
        this.papersvalidity = papersvalidity;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession == null ? null : profession.trim();
    }

    public String getEducationdegreeid() {
        return educationdegreeid;
    }

    public void setEducationdegreeid(String educationdegreeid) {
        this.educationdegreeid = educationdegreeid == null ? null : educationdegreeid.trim();
    }

    public String getPassengerlevelid() {
        return passengerlevelid;
    }

    public void setPassengerlevelid(String passengerlevelid) {
        this.passengerlevelid = passengerlevelid == null ? null : passengerlevelid.trim();
    }

    public String getPapersid() {
        return papersid;
    }

    public void setPapersid(String papersid) {
        this.papersid = papersid == null ? null : papersid.trim();
    }

    public String getPapersnumber() {
        return papersnumber;
    }

    public void setPapersnumber(String papersnumber) {
        this.papersnumber = papersnumber == null ? null : papersnumber.trim();
    }

    public String getUnitsoraddress() {
        return unitsoraddress;
    }

    public void setUnitsoraddress(String unitsoraddress) {
        this.unitsoraddress = unitsoraddress == null ? null : unitsoraddress.trim();
    }

    public String getThingreasonid() {
        return thingreasonid;
    }

    public void setThingreasonid(String thingreasonid) {
        this.thingreasonid = thingreasonid == null ? null : thingreasonid.trim();
    }

    public String getWherearefrom() {
        return wherearefrom;
    }

    public void setWherearefrom(String wherearefrom) {
        this.wherearefrom = wherearefrom == null ? null : wherearefrom.trim();
    }

    public String getWheretogo() {
        return wheretogo;
    }

    public void setWheretogo(String wheretogo) {
        this.wheretogo = wheretogo == null ? null : wheretogo.trim();
    }

    public String getContactphonenumber() {
        return contactphonenumber;
    }

    public void setContactphonenumber(String contactphonenumber) {
        this.contactphonenumber = contactphonenumber == null ? null : contactphonenumber.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}