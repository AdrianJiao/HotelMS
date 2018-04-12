package com.company.service.impl;

import com.company.bean.Room;
import com.company.mapper.RoomMapper;
import com.company.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomServiceImpl implements RoomService {
    @Autowired
    RoomMapper roomMapper;

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
}
