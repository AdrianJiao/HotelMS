package com.company.service;

import com.company.utils.Page;
import com.company.vo.PassengerReserveVO;
import java.util.List;


public interface PassengerReserveService {

    //分页和模糊查询
    Page<PassengerReserveVO> queryPartPassengerReserves(String txtname, int reserveState, int currentPage);

    //计算分页和模糊查询的总记录数
    int countPartPassengerReserveByNameAndReserveState(String txtname, int reserveState);
}
