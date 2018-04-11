package com.company.bean;

import java.util.Date;

public class Passenger {
    private Integer pid;

    private String name;

    private String genderID;

    private Date birthDate;

    private String nationID;

    private String licenceIssuingAuthorty;

    private Date papersValidity;

    private String profession;

    private String educationDegreeID;

    private String passengerLevelID;

    private String papersID;

    private String papersNumber;

    private String unitsOrAddress;

    private String thingReasonID;

    private String whereAreFrom;

    private String whereToGo;

    private String contactPhoneNumber;

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

    public String getGenderID() {
        return genderID;
    }

    public void setGenderID(String genderID) {
        this.genderID = genderID == null ? null : genderID.trim();
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getNationID() {
        return nationID;
    }

    public void setNationID(String nationID) {
        this.nationID = nationID == null ? null : nationID.trim();
    }

    public String getLicenceIssuingAuthorty() {
        return licenceIssuingAuthorty;
    }

    public void setLicenceIssuingAuthorty(String licenceIssuingAuthorty) {
        this.licenceIssuingAuthorty = licenceIssuingAuthorty == null ? null : licenceIssuingAuthorty.trim();
    }

    public Date getPapersValidity() {
        return papersValidity;
    }

    public void setPapersValidity(Date papersValidity) {
        this.papersValidity = papersValidity;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession == null ? null : profession.trim();
    }

    public String getEducationDegreeID() {
        return educationDegreeID;
    }

    public void setEducationDegreeID(String educationDegreeID) {
        this.educationDegreeID = educationDegreeID == null ? null : educationDegreeID.trim();
    }

    public String getPassengerLevelID() {
        return passengerLevelID;
    }

    public void setPassengerLevelID(String passengerLevelID) {
        this.passengerLevelID = passengerLevelID == null ? null : passengerLevelID.trim();
    }

    public String getPapersID() {
        return papersID;
    }

    public void setPapersID(String papersID) {
        this.papersID = papersID == null ? null : papersID.trim();
    }

    public String getPapersNumber() {
        return papersNumber;
    }

    public void setPapersNumber(String papersNumber) {
        this.papersNumber = papersNumber == null ? null : papersNumber.trim();
    }

    public String getUnitsOrAddress() {
        return unitsOrAddress;
    }

    public void setUnitsOrAddress(String unitsOrAddress) {
        this.unitsOrAddress = unitsOrAddress == null ? null : unitsOrAddress.trim();
    }

    public String getThingReasonID() {
        return thingReasonID;
    }

    public void setThingReasonID(String thingReasonID) {
        this.thingReasonID = thingReasonID == null ? null : thingReasonID.trim();
    }

    public String getWhereAreFrom() {
        return whereAreFrom;
    }

    public void setWhereAreFrom(String whereAreFrom) {
        this.whereAreFrom = whereAreFrom == null ? null : whereAreFrom.trim();
    }

    public String getWhereToGo() {
        return whereToGo;
    }

    public void setWhereToGo(String whereToGo) {
        this.whereToGo = whereToGo == null ? null : whereToGo.trim();
    }

    public String getContactPhoneNumber() {
        return contactPhoneNumber;
    }

    public void setContactPhoneNumber(String contactPhoneNumber) {
        this.contactPhoneNumber = contactPhoneNumber == null ? null : contactPhoneNumber.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}