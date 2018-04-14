package com.company.vo;

import com.company.bean.Passenger;
import com.company.bean.PassengerCheckin;

import java.util.Date;

public class PassengerCheckinVO {

    //前端显示需要的数据
    private int remind;

    private String roomNumber;

    private String roomGuestRoomLevelName;

    private int roomAmount;

    private int receiveTargetID;

    private String receiveTeamName;

    private String passengerName;

    private String passengerTypeName;

    private int changingRoomNumber;

    private double changRoomMoney;

    private Date changRoomTime;

    private Date registerTime;

    private Double sumConst;

    private String isBillID;

    private String stayregisterdetailsId;

    private String id;

    //只能通过这个构造方法产生vo对象
    public PassengerCheckinVO(PassengerCheckin passengerCheckin) {
        this.remind = 1;

        this.roomNumber = passengerCheckin.getRoomNumber();

        this.roomGuestRoomLevelName = passengerCheckin.getRoom().getGuestRoomLevelName();

        this.roomAmount = passengerCheckin.getRoom().getRoomAmount();

        //旅客类型（这种都是散客），根据前端写的3！=2
        this.receiveTargetID = 3;

        //根据前端都是散客
        this.receiveTeamName ="散客";

        //旅客姓名
        if(passengerCheckin.getPassenger()==null){
            this.passengerName = "";
        }else {
           this.passengerName = passengerCheckin.getPassenger().getName();
        }

        this.passengerTypeName = passengerCheckin.getPassengerTypeName();


        if(passengerCheckin.getChangingRoomNumber() == null){
            this.changingRoomNumber = 0 ;
        }else {
            this.changingRoomNumber = passengerCheckin.getChangingRoomNumber();
        }

        if(passengerCheckin.getChangRoomMoney()==null){
            this.changRoomMoney = 0;
        }else {
              this.changRoomMoney = passengerCheckin.getChangRoomMoney();
        }

        if(passengerCheckin.getChangRoomTime()==null){
            this.changRoomTime = new Date();
        }else {
             this.changRoomTime = passengerCheckin.getChangRoomTime();
        }

        this.registerTime = passengerCheckin.getRegisterTime();

        this.sumConst = passengerCheckin.getSumConst();

        this.isBillID = passengerCheckin.getIsBillID();

        this.stayregisterdetailsId = passengerCheckin.getPassengerCheckInId();

        this.id=passengerCheckin.getPassengerCheckInId();
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        return "PassengerCheckinVO{" +
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
                ", isBillID=" + isBillID +
                ", stayregisterdetailsId='" + stayregisterdetailsId + '\'' +
                '}';
    }
}
