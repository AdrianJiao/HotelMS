package com.company.bean;

import java.util.List;

public class Rooms {

    List<Room>  result;


    public List<Room> getResult() {
        return result;
    }

    public void setResult(List<Room> result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Rooms{" +
                "item=" + result +
                '}';
    }
}
