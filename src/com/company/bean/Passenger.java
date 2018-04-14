package com.company.bean;

import java.util.Date;
import java.util.Objects;

public class Passenger {

    //id
    private Integer pid;

    //姓名
    private String name;

    //性别id
    private String genderID;

    //生日
    private Date birthDate;

    //民族id
    private String nationID;

    //发证机关
    private String licenceIssuingAuthorty;

    //证件有效期
    private Date papersValidity;

    //职业
    private String profession;

    //文化程度id
    private String educationDegreeID;

    //旅客级别ID
    private String passengerLevelID;

    //证件ID
    private String papersID;

    //证件号码
    private String papersNumber;

    //地址
    private String unitsOrAddress;

    //事情缘由ID
    private String thingReasonID;

    //来自哪里
    private String whereAreFrom;

    //要去哪里
    private String whereToGo;

    //联系电话
    private String contactPhoneNumber;

    //备注
    private String remarks;


    private String genderName;

    private String nationName;

    private String passengerLevelName;

    private String papersName;

    private String thingReasonName;

    private String educationDegreeName;

    public String getGenderName() {
        return genderName;
    }

    public void setGenderName(String genderName) {
        this.genderName = genderName;
    }

    public String getNationName() {
        return nationName;
    }

    public void setNationName(String nationName) {
        this.nationName = nationName;
    }

    public String getPassengerLevelName() {
        return passengerLevelName;
    }

    public void setPassengerLevelName(String passengerLevelName) {
        this.passengerLevelName = passengerLevelName;
    }

    public String getPapersName() {
        return papersName;
    }

    public void setPapersName(String papersName) {
        this.papersName = papersName;
    }

    public String getThingReasonName() {
        return thingReasonName;
    }

    public void setThingReasonName(String thingReasonName) {
        this.thingReasonName = thingReasonName;
    }

    public String getEducationDegreeName() {
        return educationDegreeName;
    }

    public void setEducationDegreeName(String educationDegreeName) {
        this.educationDegreeName = educationDegreeName;
    }

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


    /*重写equals方法*/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passenger passenger = (Passenger) o;
        return Objects.equals(pid, passenger.pid) &&
                Objects.equals(name, passenger.name) &&
                Objects.equals(genderID, passenger.genderID) &&
                Objects.equals(birthDate, passenger.birthDate) &&
                Objects.equals(nationID, passenger.nationID) &&
                Objects.equals(licenceIssuingAuthorty, passenger.licenceIssuingAuthorty) &&
                Objects.equals(papersValidity, passenger.papersValidity) &&
                Objects.equals(profession, passenger.profession) &&
                Objects.equals(educationDegreeID, passenger.educationDegreeID) &&
                Objects.equals(passengerLevelID, passenger.passengerLevelID) &&
                Objects.equals(papersID, passenger.papersID) &&
                Objects.equals(papersNumber, passenger.papersNumber) &&
                Objects.equals(unitsOrAddress, passenger.unitsOrAddress) &&
                Objects.equals(thingReasonID, passenger.thingReasonID) &&
                Objects.equals(whereAreFrom, passenger.whereAreFrom) &&
                Objects.equals(whereToGo, passenger.whereToGo) &&
                Objects.equals(contactPhoneNumber, passenger.contactPhoneNumber) &&
                Objects.equals(remarks, passenger.remarks) &&
                Objects.equals(genderName, passenger.genderName) &&
                Objects.equals(nationName, passenger.nationName) &&
                Objects.equals(passengerLevelName, passenger.passengerLevelName) &&
                Objects.equals(papersName, passenger.papersName) &&
                Objects.equals(thingReasonName, passenger.thingReasonName) &&
                Objects.equals(educationDegreeName, passenger.educationDegreeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pid, name, genderID, birthDate, nationID, licenceIssuingAuthorty, papersValidity,
                profession, educationDegreeID, passengerLevelID, papersID, papersNumber, unitsOrAddress,
                thingReasonID, whereAreFrom, whereToGo, contactPhoneNumber, remarks, genderName,
                nationName, passengerLevelName, papersName, thingReasonName, educationDegreeName);
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "pid=" + pid +
                ", name='" + name + '\'' +
                ", genderID='" + genderID + '\'' +
                ", birthDate=" + birthDate +
                ", nationID='" + nationID + '\'' +
                ", licenceIssuingAuthorty='" + licenceIssuingAuthorty + '\'' +
                ", papersValidity=" + papersValidity +
                ", profession='" + profession + '\'' +
                ", educationDegreeID='" + educationDegreeID + '\'' +
                ", passengerLevelID='" + passengerLevelID + '\'' +
                ", papersID='" + papersID + '\'' +
                ", papersNumber='" + papersNumber + '\'' +
                ", unitsOrAddress='" + unitsOrAddress + '\'' +
                ", thingReasonID='" + thingReasonID + '\'' +
                ", whereAreFrom='" + whereAreFrom + '\'' +
                ", whereToGo='" + whereToGo + '\'' +
                ", contactPhoneNumber='" + contactPhoneNumber + '\'' +
                ", remarks='" + remarks + '\'' +
                ", genderName='" + genderName + '\'' +
                ", nationName='" + nationName + '\'' +
                ", passengerLevelName='" + passengerLevelName + '\'' +
                ", papersName='" + papersName + '\'' +
                ", thingReasonName='" + thingReasonName + '\'' +
                ", educationDegreeName='" + educationDegreeName + '\'' +
                '}';
    }
}