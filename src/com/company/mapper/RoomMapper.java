package com.company.mapper;

import com.company.bean.Room;

public interface RoomMapper {
    int deleteByPrimaryKey(String roomnumber);

    int insert(Room record);

    int insertSelective(Room record);

    Room selectByPrimaryKey(String roomnumber);

    int updateByPrimaryKeySelective(Room record);

    int updateByPrimaryKey(Room record);
}