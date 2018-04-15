package com.company.vo;

import com.company.bean.ReceivetargetReserve;

import java.util.Date;

public class ReceivetargetReserveVO {
    private int remind;

    private int passengerID;

    private String id;

    private String roomNumber;

    private String roomGuestRoomLevelName;

    private String receiveTeamName;

    private String receivePrincipal;

    private Date arriveTime;

    private double deposit;

    private int predetermineDay;

    private String receiveContactPhoneNUmber;

    private String predetermineStateName;

    //团队预定要的参数
    public ReceivetargetReserveVO(ReceivetargetReserve receivetargetReserve) {
        this.remind = 1 ;
        this.passengerID = 0;
        this.id = receivetargetReserve.getReceivetargetReserveId();
        this.roomNumber = receivetargetReserve.getRoomNumber();
        this.roomGuestRoomLevelName = receivetargetReserve.getRoom().getGuestRoomLevelName();
        this.receiveTeamName = receivetargetReserve.getReceivetarget().getTeamName();
        this.receivePrincipal = receivetargetReserve.getReceivetarget().getPrincipal();
        this.arriveTime = receivetargetReserve.getArriveTime();
        this.deposit = receivetargetReserve.getDeposit();
        this.predetermineDay = receivetargetReserve.getPredetermineDay();
        this.receiveContactPhoneNUmber = receivetargetReserve.getReceivetarget().getContactPhoneNUmber();
        this.predetermineStateName = receivetargetReserve.getPredetermineStateName();
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

    public String getReceiveTeamName() {
        return receiveTeamName;
    }

    public void setReceiveTeamName(String receiveTeamName) {
        this.receiveTeamName = receiveTeamName;
    }

    public String getReceivePrincipal() {
        return receivePrincipal;
    }

    public void setReceivePrincipal(String receivePrincipal) {
        this.receivePrincipal = receivePrincipal;
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

    public String getReceiveContactPhoneNUmber() {
        return receiveContactPhoneNUmber;
    }

    public void setReceiveContactPhoneNUmber(String receiveContactPhoneNUmber) {
        this.receiveContactPhoneNUmber = receiveContactPhoneNUmber;
    }

    public String getPredetermineStateName() {
        return predetermineStateName;
    }

    public void setPredetermineStateName(String predetermineStateName) {
        this.predetermineStateName = predetermineStateName;
    }

    @Override
    public String toString() {
        return "ReceivetargetReserveVO{" +
                "remind=" + remind +
                ", passengerID=" + passengerID +
                ", id='" + id + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                ", roomGuestRoomLevelName='" + roomGuestRoomLevelName + '\'' +
                ", receiveTeamName='" + receiveTeamName + '\'' +
                ", receivePrincipal='" + receivePrincipal + '\'' +
                ", arriveTime=" + arriveTime +
                ", deposit=" + deposit +
                ", predetermineDay=" + predetermineDay +
                ", receiveContactPhoneNUmber='" + receiveContactPhoneNUmber + '\'' +
                ", predetermineStateName='" + predetermineStateName + '\'' +
                '}';
    }
}
