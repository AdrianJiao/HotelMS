package com.company.bean;

import java.util.Date;

public class PassengerReserve {
    private String passengerReserveId;

    private Integer pid;

    private String roomNumber;

    private Integer predetermineDay;

    private Double deposit;

    private String payWayID;

    private Date arriveTime;

    private String reserveState;

    //旅客对象
    private Passenger passenger;

    //房间对象
    private Room room;

    //ID转Name所需要的字段
    private String payWayName;

    private String predetermineStateName;

    public String getPayWayName() {
        return payWayName;
    }

    public void setPayWayName(String payWayName) {
        this.payWayName = payWayName;
    }

    public String getPredetermineStateName() {
        return predetermineStateName;
    }

    public void setPredetermineStateName(String predetermineStateName) {
        this.predetermineStateName = predetermineStateName;
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

    public String getPassengerReserveId() {
        return passengerReserveId;
    }

    public void setPassengerReserveId(String passengerReserveId) {
        this.passengerReserveId = passengerReserveId == null ? null : passengerReserveId.trim();
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

    public Integer getPredetermineDay() {
        return predetermineDay;
    }

    public void setPredetermineDay(Integer predetermineDay) {
        this.predetermineDay = predetermineDay;
    }

    public Double getDeposit() {
        return deposit;
    }

    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }

    public String getPayWayID() {
        return payWayID;
    }

    public void setPayWayID(String payWayID) {
        this.payWayID = payWayID == null ? null : payWayID.trim();
    }

    public Date getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(Date arriveTime) {
        this.arriveTime = arriveTime;
    }

    public String getReserveState() {
        return reserveState;
    }

    public void setReserveState(String reserveState) {
        this.reserveState = reserveState == null ? null : reserveState.trim();
    }

    @Override
    public String toString() {
        return "PassengerReserve{" +
                "passengerReserveId='" + passengerReserveId + '\'' +
                ", pid=" + pid +
                ", roomNumber='" + roomNumber + '\'' +
                ", predetermineDay=" + predetermineDay +
                ", deposit=" + deposit +
                ", payWayID='" + payWayID + '\'' +
                ", arriveTime=" + arriveTime +
                ", reserveState='" + reserveState + '\'' +
                ", passenger=" + passenger +
                ", room=" + room +
                ", payWayName='" + payWayName + '\'' +
                ", predetermineStateName='" + predetermineStateName + '\'' +
                '}';
    }
}