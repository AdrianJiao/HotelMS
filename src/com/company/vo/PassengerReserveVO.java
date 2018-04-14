package com.company.vo;

import com.company.bean.PassengerReserve;

import java.util.Date;

public class PassengerReserveVO {
    private int remind;

    private int passengerID;

    private String id;

    private String roomNumber;

    private String roomGuestRoomLevelName;

    private String receiveTargeTypeName;

    private String passengerName;

    private Date arriveTime;

    private double deposit;

    private int predetermineDay;

    private String passengerContactPhoneNumber;

    private String predetermineStateName;

    //旅客预定需要的参数
    public PassengerReserveVO(PassengerReserve passengerReserve) {
        this.remind = 0;
        this.passengerID = 1;
        this.id = passengerReserve.getPassengerReserveId();
        this.roomNumber = passengerReserve.getRoomNumber();
        this.roomGuestRoomLevelName = passengerReserve.getRoom().getGuestRoomLevelName();
        this.receiveTargeTypeName = "散客";
        this.passengerName = passengerReserve.getPassenger().getName();
        this.arriveTime = passengerReserve.getArriveTime();
        this.deposit = passengerReserve.getDeposit();
        this.predetermineDay = passengerReserve.getPredetermineDay();
        this.passengerContactPhoneNumber = passengerReserve.getPassenger().getContactPhoneNumber();
        this.predetermineStateName = passengerReserve.getPredetermineStateName();
    }

    public int getRemind() {
        return remind;
    }

    public void setRemind(int remind) {
        this.remind = remind;
    }

    public int getPassengerID() {
        return passengerID;
    }

    public void setPassengerID(int passengerID) {
        this.passengerID = passengerID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomGuestRoomLevelName() {
        return roomGuestRoomLevelName;
    }

    public void setRoomGuestRoomLevelName(String roomGuestRoomLevelName) {
        this.roomGuestRoomLevelName = roomGuestRoomLevelName;
    }

    public String getReceiveTargeTypeName() {
        return receiveTargeTypeName;
    }

    public void setReceiveTargeTypeName(String receiveTargeTypeName) {
        this.receiveTargeTypeName = receiveTargeTypeName;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public Date getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(Date arriveTime) {
        this.arriveTime = arriveTime;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public int getPredetermineDay() {
        return predetermineDay;
    }

    public void setPredetermineDay(int predetermineDay) {
        this.predetermineDay = predetermineDay;
    }

    public String getPassengerContactPhoneNumber() {
        return passengerContactPhoneNumber;
    }

    public void setPassengerContactPhoneNumber(String passengerContactPhoneNumber) {
        this.passengerContactPhoneNumber = passengerContactPhoneNumber;
    }

    public String getPredetermineStateName() {
        return predetermineStateName;
    }

    public void setPredetermineStateName(String predetermineStateName) {
        this.predetermineStateName = predetermineStateName;
    }

    @Override
    public String toString() {
        return "PassengerReserveVO{" +
                "remind=" + remind +
                ", passengerID=" + passengerID +
                ", id='" + id + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                ", roomGuestRoomLevelName='" + roomGuestRoomLevelName + '\'' +
                ", receiveTargeTypeName='" + receiveTargeTypeName + '\'' +
                ", passengerName='" + passengerName + '\'' +
                ", arriveTime=" + arriveTime +
                ", deposit=" + deposit +
                ", predetermineDay=" + predetermineDay +
                ", passengerContactPhoneNumber='" + passengerContactPhoneNumber + '\'' +
                ", predetermineStateName='" + predetermineStateName + '\'' +
                '}';
    }
}
