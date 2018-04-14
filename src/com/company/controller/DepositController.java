package com.company.controller;

import com.company.bean.Deposit;
import com.company.bean.PassengerCheckin;
import com.company.service.DepositService;
import com.company.service.PassengerCheckinService;
import com.company.vo.DepositVO;
import javafx.scene.input.InputMethodTextRun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.LinkedList;
import java.util.List;

@Controller
@RequestMapping("StayRegister")
public class DepositController {

    @Autowired
    DepositService depositService;

    @Autowired
    PassengerCheckinService passengerCheckinService;

    //填充押金界面参数
    @RequestMapping("todeposit")
    public String toDeposit(@RequestParam("id") String checkInId,
                            String LvKeLeiXingId,
                            String lvKeName,
                            Model model){

        //查询所有押金表中checkInId对应的押金记录
                List<Deposit> deposits =
                depositService.queryDepositsByCheckID(checkInId);

        //前端需要的VO
        List<DepositVO> depositVOS = new LinkedList<>();

        //判断查询散客还是团队
        int LvKeLeiXingIdInt = Integer.parseInt(LvKeLeiXingId);

        if(LvKeLeiXingIdInt==55){
            //散客查询
            PassengerCheckin passengerCheckin = passengerCheckinService
                    .queryPassengerCheckinByPassengerCheckInId(checkInId);

            //填充VO
            for (Deposit deposit : deposits) {
                depositVOS.add(new DepositVO(deposit,passengerCheckin));
            }
        }else {
            //团体查询
        }

        //??????????????????????????bug为支付方式未显示
        model.addAttribute("list",depositVOS);
        return "/stayregister/deposit";
    }
}
