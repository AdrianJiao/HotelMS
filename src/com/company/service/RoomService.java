package com.company.service;

import com.company.bean.Room;
import com.company.utils.Page;

import java.util.List;

public interface RoomService {

    /**
     * 添加房信息
     * @param record
     * @return
     */
    boolean insert(Room record);

    /**
     * 通过房间号  删除房间信息
     * @param roomNumber
     * @return
     */
    boolean deleteByPrimaryKey(String roomNumber);


    /**
     * 通过房间号查询房间信息
     * @param roomNumber
     * @return
     */
    Room queryRoomByRoomNumber(String roomNumber);


    public Room selectByNumber(String roomNumber);


    public int updateByNumber(Room room);


    /**
     * 分页查询
     * @param currentPage
     * @param txtname
     * @return
     */
    Page<Room> queryPartRoom(int currentPage, String txtname);

    /**
     * 更新房间信息
     * @param room
     * @return
     */
    int updateRoom(Room room);

    /**
     * 批量删除房间信息
     * @param roomNumber
     * @return
     */
    int deleteBatchByRoom(String[] roomNumber);

    //查询房间状态为空房的所有房间(填充相应字段)
    List<Room> queryAllEmptyRoom();

    //查询所有房间信息(填充相应字段)
    List<Room> queryAllRoom();

    //根据房间号查询所有房间(填充相应字段)
    List<Room> queryAllRoomByRoomNumber(String roomName);

    //通过房间等级来查询房间信息
    List<Room> queryRoomByGuestRoomLevel(Integer guestRoomLevelID);

}
