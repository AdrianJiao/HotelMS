package com.company.mapper;

import com.company.bean.Passenger;
import com.company.utils.Page;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface PassengerMapper {

    int deleteByPrimaryKey(Integer id);

    int insertAll(Passenger passenger);

    Passenger selectById(Integer id);

    int updateById(Passenger passenger);

    int countPassengerNumByName(String txtname);

    List<Passenger> queryPartPassengers(Map<String, Object> parameters);

    Passenger queryPassengerByPid(int pid);

    int deleteBatchByPid(String[] pid);

    List<Passenger> queryAllPassenger();

    List<Passenger> queryPassengerByName(String txtname);

    //插入后获取主键
    int insertAndGetId(Passenger passenger);

    //根据id获取用户不填充相应字段
    Passenger selectPassengerByIdWithoutFill(int pid);

    /******************************************************************/
    /**
     * 根据pid查询电话号码
     * @param pid
     * @return
     */
    String queryContactPhoneNumber(int pid);
}