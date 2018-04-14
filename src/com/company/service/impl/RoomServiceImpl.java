package com.company.service.impl;

import com.company.bean.Room;
import com.company.mapper.RoomMapper;
import com.company.service.RoomService;
import com.company.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {
    @Autowired
    RoomMapper roomMapper;

    //添加房间
    @Override
    public boolean insert(Room record) {
        int i = roomMapper.insert(record);
        return i==1?true:false;
    }

    @Override
    public boolean deleteByPrimaryKey(String roomNumber) {
        int i = roomMapper.deleteByPrimaryKey(roomNumber);
        return i==1?true:false;
    }


    @Override
    public Room queryRoomByRoomNumber(String roomNumber) {
        return roomMapper.queryRoomByRoomNumber(roomNumber);
    }

    @Override
    public Room selectByNumber(String roomNumber) {

        return roomMapper.selectByPrimaryKey(roomNumber);

    }

    @Override
    public int updateByNumber(Room room) {

        return roomMapper.updateByPrimaryKey(room);
    }

    @Override
    public Page<Room> queryPartRoom(int currentPage, String txtname) {

        //统计符合要求的总条数
        int totalRecordsNum = roomMapper.countRoomRecordersByRoomNumber(txtname);
         HashMap<String, Object> parameters = new HashMap<>();
            parameters.put("limit", Page.ROOM_PER_PAGE_RECORD_NUM);
            parameters.put("offset",(currentPage - 1) * Page.ROOM_PER_PAGE_RECORD_NUM);
            parameters.put("txtname",txtname);
            List<Room> rooms = roomMapper.queryPartRoom(parameters);

            return  new Page<>(Page.ROOM_PER_PAGE_RECORD_NUM,totalRecordsNum,rooms,currentPage);
    }

    @Override
    public int updateRoom(Room room) {
        return roomMapper.updateByPrimaryKey(room);
    }

    @Override
    public int deleteBatchByRoom(String[] roomNumber) {
        return roomMapper.deleteBatchByRoom(roomNumber);
    }

    @Override
    public List<Room> queryAllEmptyRoom() {
        return roomMapper.queryAllEmptyRoom();
    }

    @Override
    public List<Room> queryAllRoom() {
        return roomMapper.queryAllRoom();
    }

    @Override
    public List<Room> queryAllRoomByRoomNumber(String roomName) {
        return roomMapper.queryAllRoomByRoomNumber(roomName);
    }

    @Override
    public List<Room> queryRoomByGuestRoomLevel(Integer guestRoomLevelID) {
        return roomMapper.queryRoomByGuestRoomLevel(guestRoomLevelID);
    }
}
