package com.company.service;

import com.company.utils.Page;
import com.company.vo.ReceivetargetReserveVO;

public interface ReceivetargetReserveService {

    //分页和模糊查询
    Page<ReceivetargetReserveVO> queryPartReceivetargetReserves(String txtname, int reserveState, int currentPage);

    //计算分页和模糊查询的总记录数
    int countPartReceivetargetReserveByNameAndReserveState(String txtname, int reserveState);

    /**
     *批量删除
     * @author Yiqiang Tao
     * @date 2018/4/14 20:35
     */

    int deleteBatchByPrimaryKey(String[] receivetargetReserveId);
}
