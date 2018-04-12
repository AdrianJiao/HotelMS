package com.company.service;

import com.company.bean.Room;

public interface RoomService {
    /*添加房间信息*/
    boolean insert(Room record);

    boolean deleteByPrimaryKey(String roomNumber);


}
