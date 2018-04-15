package com.company.service.impl;

import com.company.bean.Passenger;
import com.company.mapper.PassengerMapper;
import com.company.service.PassengerService;
import com.company.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;


@Service
public class PassengerServiceImpl  implements PassengerService{

    @Autowired
    PassengerMapper passengerMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return passengerMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertAll(Passenger passenger) {
        return passengerMapper.insertAll(passenger);
    }

    @Override
    public Passenger selectById(Integer id) {
        return passengerMapper.selectById(id);
    }

    @Override
    public int updateById(Passenger passenger) {
        return passengerMapper.updateById(passenger);
    }

    @Override
    public int countPassengerNumByName(String txtname) {
        return passengerMapper.countPassengerNumByName(txtname);
    }

    @Override
    public Page<Passenger> queryPartPassengers(int currentPage,String txtname) {
        //统计符合要求的总条数,难搞
        int totalRecordsNum = passengerMapper.countPassengerNumByName(txtname);

        HashMap<String, Object> parameters = new HashMap<>();
        parameters.put("limit",Page.PASSENGER_PER_PAGE_RECORD_NUM);
        parameters.put("offset",(currentPage - 1) * Page.PASSENGER_PER_PAGE_RECORD_NUM);
        parameters.put("txtname",txtname);

        List<Passenger> passengers = passengerMapper.queryPartPassengers(parameters);

        return new Page<>(Page.PASSENGER_PER_PAGE_RECORD_NUM,totalRecordsNum,passengers,currentPage);
    }

    @Override
    public Passenger queryPassengerByPid(int pid) {
        return passengerMapper.queryPassengerByPid(pid);
    }

    @Override
    public int deleteBatchByPid(String[] pid) {
        return passengerMapper.deleteBatchByPid(pid);
    }

    @Override
    public List<Passenger> queryAllPassenger() {
        return passengerMapper.queryAllPassenger();
    }

    @Override
    public List<Passenger> queryPassengerByName(String txtname) {
        return passengerMapper.queryPassengerByName(txtname);
    }

    @Override
    public int insertAndGetId(Passenger passenger) {
        return passengerMapper.insertAndGetId(passenger);
    }

    @Override
    public Passenger selectPassengerByIdWithoutFill(int pid) {
        return passengerMapper.selectPassengerByIdWithoutFill(pid);
    }

    /******************************************************************************/
    /**
     * 4/14 新写
     * 查询联系电话
     * @param pid
     * @return
     */
    @Override
    public String queryContactPhoneNumber(int pid) {
        return passengerMapper.queryContactPhoneNumber(pid);
    }
}
