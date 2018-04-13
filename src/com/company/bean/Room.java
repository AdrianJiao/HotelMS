package com.company.bean;

public class Room {
    private String roomNumber;

    private String roomStateID;

    private Integer roomAmount;

    private String guestRoomLevelID;

    private Double standardPriceDay;

    private Double standardPrice;

    private Double maxDuration;

    private Double firstPrice;

    private Double firstDuration;

    /*添加字段*/
    private String guestRoomLevelName;

    /*添加字段*/
    private String roomName;


    public String getGuestRoomLevelName() {
        return guestRoomLevelName;
    }

    public void setGuestRoomLevelName(String guestRoomLevelName) {
        this.guestRoomLevelName = guestRoomLevelName;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber == null ? null : roomNumber.trim();
    }

    public String getRoomStateID() {
        return roomStateID;
    }

    public void setRoomStateID(String roomStateID) {
        this.roomStateID = roomStateID == null ? null : roomStateID.trim();
    }

    public Integer getRoomAmount() {
        return roomAmount;
    }

    public void setRoomAmount(Integer roomAmount) {
        this.roomAmount = roomAmount;
    }

    public String getGuestRoomLevelID() {
        return guestRoomLevelID;
    }

    public void setGuestRoomLevelID(String guestRoomLevelID) {
        this.guestRoomLevelID = guestRoomLevelID == null ? null : guestRoomLevelID.trim();
    }

    public Double getStandardPriceDay() {
        return standardPriceDay;
    }

    public void setStandardPriceDay(Double standardPriceDay) {
        this.standardPriceDay = standardPriceDay;
    }

    public Double getStandardPrice() {
        return standardPrice;
    }

    public void setStandardPrice(Double standardPrice) {
        this.standardPrice = standardPrice;
    }

    public Double getMaxDuration() {
        return maxDuration;
    }

    public void setMaxDuration(Double maxDuration) {
        this.maxDuration = maxDuration;
    }

    public Double getFirstPrice() {
        return firstPrice;
    }

    public void setFirstPrice(Double firstPrice) {
        this.firstPrice = firstPrice;
    }

    public Double getFirstDuration() {
        return firstDuration;
    }

    public void setFirstDuration(Double firstDuration) {
        this.firstDuration = firstDuration;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber='" + roomNumber + '\'' +
                ", roomStateID='" + roomStateID + '\'' +
                ", roomAmount=" + roomAmount +
                ", guestRoomLevelID='" + guestRoomLevelID + '\'' +
                ", standardPriceDay=" + standardPriceDay +
                ", standardPrice=" + standardPrice +
                ", maxDuration=" + maxDuration +
                ", firstPrice=" + firstPrice +
                ", firstDuration=" + firstDuration +
                ", guestRoomLevelName='" + guestRoomLevelName + '\'' +
                ", roomName='" + roomName + '\'' +
                '}';
    }
}