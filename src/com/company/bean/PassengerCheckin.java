package com.company.bean;

import java.util.Date;

public class PassengerCheckin {
    private String passengerCheckInId;

    private Integer pid;

    private String roomNumber;

    private Date registerTime;

    private String rentOutTypeID;

    private String passengerTypeID;

    private Double stayNumber;

    private String billUnitID;

    private String depositPayWayID;

    private Integer changingRoomNumber;

    private Double changRoomMoney;

    private Date changRoomTime;

    private Double sumConst;

    private String isBillID;

    private Date payTime;

    //旅客对象
    private Passenger passenger;

    //房间对象
    private Room room;

    //ID转Name的相应字段（5个）
    private String rentOutTypeName;

    private String passengerTypeName;

    private String billUnitName;

    private String depositPayWayName;

    private String isBillName;

    public String getRentOutTypeName() {
        return rentOutTypeName;
    }

    public void setRentOutTypeName(String rentOutTypeName) {
        this.rentOutTypeName = rentOutTypeName;
    }

    public String getPassengerTypeName() {
        return passengerTypeName;
    }

    public void setPassengerTypeName(String passengerTypeName) {
        this.passengerTypeName = passengerTypeName;
    }

    public String getBillUnitName() {
        return billUnitName;
    }

    public void setBillUnitName(String billUnitName) {
        this.billUnitName = billUnitName;
    }

    public String getDepositPayWayName() {
        return depositPayWayName;
    }

    public void setDepositPayWayName(String depositPayWayName) {
        this.depositPayWayName = depositPayWayName;
    }

    public String getIsBillName() {
        return isBillName;
    }

    public void setIsBillName(String isBillName) {
        this.isBillName = isBillName;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public String getPassengerCheckInId() {
        return passengerCheckInId;
    }

    public void setPassengerCheckInId(String passengerCheckInId) {
        this.passengerCheckInId = passengerCheckInId == null ? null : passengerCheckInId.trim();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber == null ? null : roomNumber.trim();
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public String getRentOutTypeID() {
        return rentOutTypeID;
    }

    public void setRentOutTypeID(String rentOutTypeID) {
        this.rentOutTypeID = rentOutTypeID == null ? null : rentOutTypeID.trim();
    }

    public String getPassengerTypeID() {
        return passengerTypeID;
    }

    public void setPassengerTypeID(String passengerTypeID) {
        this.passengerTypeID = passengerTypeID == null ? null : passengerTypeID.trim();
    }

    public Double getStayNumber() {
        return stayNumber;
    }

    public void setStayNumber(Double stayNumber) {
        this.stayNumber = stayNumber;
    }

    public String getBillUnitID() {
        return billUnitID;
    }

    public void setBillUnitID(String billUnitID) {
        this.billUnitID = billUnitID == null ? null : billUnitID.trim();
    }

    public String getDepositPayWayID() {
        return depositPayWayID;
    }

    public void setDepositPayWayID(String depositPayWayID) {
        this.depositPayWayID = depositPayWayID == null ? null : depositPayWayID.trim();
    }

    public Integer getChangingRoomNumber() {
        return changingRoomNumber;
    }

    public void setChangingRoomNumber(Integer changingRoomNumber) {
        this.changingRoomNumber = changingRoomNumber;
    }

    public Double getChangRoomMoney() {
        return changRoomMoney;
    }

    public void setChangRoomMoney(Double changRoomMoney) {
        this.changRoomMoney = changRoomMoney;
    }

    public Date getChangRoomTime() {
        return changRoomTime;
    }

    public void setChangRoomTime(Date changRoomTime) {
        this.changRoomTime = changRoomTime;
    }

    public Double getSumConst() {
        return sumConst;
    }

    public void setSumConst(Double sumConst) {
        this.sumConst = sumConst;
    }

    public String getIsBillID() {
        return isBillID;
    }

    public void setIsBillID(String isBillID) {
        this.isBillID = isBillID == null ? null : isBillID.trim();
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    @Override
    public String toString() {
        return "PassengerCheckin{" +
                "passengerCheckInId='" + passengerCheckInId + '\'' +
                ", pid=" + pid +
                ", roomNumber='" + roomNumber + '\'' +
                ", registerTime=" + registerTime +
                ", rentOutTypeID='" + rentOutTypeID + '\'' +
                ", passengerTypeID='" + passengerTypeID + '\'' +
                ", stayNumber=" + stayNumber +
                ", billUnitID='" + billUnitID + '\'' +
                ", depositPayWayID='" + depositPayWayID + '\'' +
                ", changingRoomNumber=" + changingRoomNumber +
                ", changRoomMoney=" + changRoomMoney +
                ", changRoomTime=" + changRoomTime +
                ", sumConst=" + sumConst +
                ", isBillID='" + isBillID + '\'' +
                ", payTime=" + payTime +
                ", passenger=" + passenger +
                ", room=" + room +
                ", rentOutTypeName='" + rentOutTypeName + '\'' +
                ", passengerTypeName='" + passengerTypeName + '\'' +
                ", billUnitName='" + billUnitName + '\'' +
                ", depositPayWayName='" + depositPayWayName + '\'' +
                ", isBillName='" + isBillName + '\'' +
                '}';
    }
}