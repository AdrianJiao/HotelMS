package com.company.vo;

import com.company.bean.Deposit;
import com.company.bean.PassengerCheckin;
import com.company.bean.ReceivetargetCheckin;

import java.util.Date;
import java.util.List;

public class DepositVO {
   private Date depositRegisterTime;

   private double deposit;

   private String depositPayWayName;

   private int receiveTargetID;

   private String receiveTeamName;

   private String isBillID;

   private String roomNumber;

   private int id;

   //旅客用的构造方法
    public DepositVO(Deposit deposit,PassengerCheckin passengerCheckin) {
        this.depositRegisterTime = deposit.getDepositRegisterTime();
        this.deposit = deposit.getDeposit();
        this.depositPayWayName = deposit.getDepositPayWayName();

        //通过前端jsp取！=2的值
        this.receiveTargetID = 3;
        this.receiveTeamName = passengerCheckin.getPassengerTypeName();

        this.isBillID = passengerCheckin.getIsBillID();
        this.roomNumber = passengerCheckin.getRoomNumber();
        /*this.id = passengerCheckin.getPid();*/
    }

    //团队用的VO对象构造方法
    public DepositVO(Deposit deposit,ReceivetargetCheckin receivetargetCheckin) {
    }

    public Date getDepositRegisterTime() {
        return depositRegisterTime;
    }

    public void setDepositRegisterTime(Date depositRegisterTime) {
        this.depositRegisterTime = depositRegisterTime;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public String getDepositPayWayName() {
        return depositPayWayName;
    }

    public void setDepositPayWayName(String depositPayWayName) {
        this.depositPayWayName = depositPayWayName;
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

    public String getIsBillID() {
        return isBillID;
    }

    public void setIsBillID(String isBillID) {
        this.isBillID = isBillID;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "DepositVO{" +
                "depositRegisterTime=" + depositRegisterTime +
                ", deposit=" + deposit +
                ", depositPayWayName='" + depositPayWayName + '\'' +
                ", receiveTargetID=" + receiveTargetID +
                ", receiveTeamName='" + receiveTeamName + '\'' +
                ", isBillID=" + isBillID +
                ", roomNumber='" + roomNumber + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
