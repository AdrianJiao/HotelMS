package com.company.vo;

import com.company.bean.ReceivetargetCheckin;

import java.util.Date;

public class ReceivetargetCheckinVO {

    private int remind;

    private String roomNumber;

    private String roomGuestRoomLevelName;

    private int roomAmount;

    private int receiveTargetID;

    private String receiveTeamName;

    String passengerName;

    String passengerTypeName;

    int changingRoomNumber;

    double changRoomMoney;

    Date changRoomTime;

    Date registerTime;

    double sumConst;

    String isBillID;

    String stayregisterdetailsId;

    public ReceivetargetCheckinVO(ReceivetargetCheckin receivetargetCheckin) {
        this.remind = 0;
        this.roomNumber = receivetargetCheckin.getRoomNumber();
        this.roomGuestRoomLevelName = receivetargetCheckin.getRoom().getGuestRoomLevelName();
        this.roomAmount = receivetargetCheckin.getRoom().getRoomAmount();

        //取不等于2
        this.receiveTargetID = 3;
        this.receiveTeamName = receivetargetCheckin.getReceivetarget().getTeamName();

        this.passengerName = receivetargetCheckin.getPassenger().getName();
        this.passengerTypeName = receivetargetCheckin.getPassenger().getPassengerLevelName();

        this.changingRoomNumber = receivetargetCheckin.getChangingRoomNumber();
        this.changRoomMoney = receivetargetCheckin.getChangRoomMoney();
        this.changRoomTime = receivetargetCheckin.getChangRoomTime();
        this.registerTime = receivetargetCheckin.getRegisterTime();
        this.sumConst = receivetargetCheckin.getSumConst();
        this.isBillID = receivetargetCheckin.getIsBillID();
        this.stayregisterdetailsId = receivetargetCheckin.getReceivetargetCheckInId();
    }

    public int getRemind() {
        return remind;
    }

    public void setRemind(int remind) {
        this.remind = remind;
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

    public int getRoomAmount() {
        return roomAmount;
    }

    public void setRoomAmount(int roomAmount) {
        this.roomAmount = roomAmount;
    }

    public int getReceiveTargetID() {
        return receiveTargetID;
    }

    public void setReceiveTargetID(int receiveTargetID) {
        this.receiveTargetID = receiveTargetID;
    }

    public String getReceiveTeamName() {
        return receiveTeamName;
    }

    public void setReceiveTeamName(String receiveTeamName) {
        this.receiveTeamName = receiveTeamName;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getPassengerTypeName() {
        return passengerTypeName;
    }

    public void setPassengerTypeName(String passengerTypeName) {
        this.passengerTypeName = passengerTypeName;
    }

    public int getChangingRoomNumber() {
        return changingRoomNumber;
    }

    public void setChangingRoomNumber(int changingRoomNumber) {
        this.changingRoomNumber = changingRoomNumber;
    }

    public double getChangRoomMoney() {
        return changRoomMoney;
    }

    public void setChangRoomMoney(double changRoomMoney) {
        this.changRoomMoney = changRoomMoney;
    }

    public Date getChangRoomTime() {
        return changRoomTime;
    }

    public void setChangRoomTime(Date changRoomTime) {
        this.changRoomTime = changRoomTime;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public double getSumConst() {
        return sumConst;
    }

    public void setSumConst(double sumConst) {
        this.sumConst = sumConst;
    }

    public String getIsBillID() {
        return isBillID;
    }

    public void setIsBillID(String isBillID) {
        this.isBillID = isBillID;
    }

    public String getStayregisterdetailsId() {
        return stayregisterdetailsId;
    }

    public void setStayregisterdetailsId(String stayregisterdetailsId) {
        this.stayregisterdetailsId = stayregisterdetailsId;
    }

    @Override
    public String toString() {
        return "ReceivetargetCheckinVO{" +
                "remind=" + remind +
                ", roomNumber='" + roomNumber + '\'' +
                ", roomGuestRoomLevelName='" + roomGuestRoomLevelName + '\'' +
                ", roomAmount=" + roomAmount +
                ", receiveTargetID=" + receiveTargetID +
                ", receiveTeamName='" + receiveTeamName + '\'' +
                ", passengerName='" + passengerName + '\'' +
                ", passengerTypeName='" + passengerTypeName + '\'' +
                ", changingRoomNumber=" + changingRoomNumber +
                ", changRoomMoney=" + changRoomMoney +
                ", changRoomTime=" + changRoomTime +
                ", registerTime=" + registerTime +
                ", sumConst=" + sumConst +
                ", isBillID='" + isBillID + '\'' +
                ", stayregisterdetailsId='" + stayregisterdetailsId + '\'' +
                '}';
    }
}
