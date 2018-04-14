package com.company.mapper;

import com.company.bean.Room;

import java.util.List;
import java.util.Map;

public interface RoomMapper {
    int deleteByPrimaryKey(String roomNumber);

    /*增加房间*/
    int insert(Room record);

    int insertSelective(Room record);

    Room selectByPrimaryKey(String roomNumber);

    int updateByPrimaryKeySelective(Room record);

    int updateByPrimaryKey(Room record);

    //根据房间号查询房间信息
    Room queryRoomByRoomNumber(String roomNumber);

    //分页查询结果
    List<Room> queryPartRoom(Map<String,Object> parameters);

    //查询list为总记录数
    int countToatalRoomRecorders();

    //根据房间号查询记录数
    int countRoomRecordersByRoomNumber(String txtname);

    //批量删除房间信息
    int deleteBatchByRoom(String[] roomNumber);

    //查询房间状态为空房的所有房间(填充相应字段)
    List<Room> queryAllEmptyRoom();

    //查询所有房间信息(填充相应字段)
    List<Room> queryAllRoom();

    //根据房间号查询所有房间(填充相应字段)
    List<Room> queryAllRoomByRoomNumber(String roomName);

    //根据房间等级来查询房间
    List<Room> queryRoomByGuestRoomLevel(Integer guestRoomLevelID);
}