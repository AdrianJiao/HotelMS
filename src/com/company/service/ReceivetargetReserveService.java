package com.company.service;

import com.company.utils.Page;
import com.company.vo.ReceivetargetReserveVO;

public interface ReceivetargetReserveService {

    //分页和模糊查询
    Page<ReceivetargetReserveVO> queryPartReceivetargetReserves(String txtname, int reserveState, int currentPage);

    //计算分页和模糊查询的总记录数
    int countPartReceivetargetReserveByNameAndReserveState(String txtname, int reserveState);
}
