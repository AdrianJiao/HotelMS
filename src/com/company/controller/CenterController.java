package com.company.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


//该控制器用于与jsp配合，解决旅客和团体的跳转连接一样的问题，tolist跳转连接一致
@Controller
public class CenterController {

    //分发显示团队登记和散客登记
    @RequestMapping("StayRegister/tolist")
    public String chooseShowCheckInController(String LvKeLeiXingId){

        //默认值55为散客
        int LvKeLeiXingIdInt = 55;
        if(LvKeLeiXingId != null&&!"".equals(LvKeLeiXingId)){
            LvKeLeiXingIdInt = Integer.parseInt(LvKeLeiXingId);
        }

        //LvKeLeiXingId值为56为团队登记
        if(LvKeLeiXingIdInt==56){

            //这里通过forward避免添加WEB-INF的影响
            return "forward:tolist_ReceivetargetCheckin.do";
        }else {
            //LvKeLeiXingId值为55为散客登记
            return "forward:tolist_PassengerCheckin.do";
        }
    }

    //分发显示团队登记和散客登记
    @RequestMapping("Predetermine/tolist")
    public String chooseShowReserveController(String LvKeLeiXingId){

        //默认值56为团体
        int LvKeLeiXingIdInt = 56;
        if(LvKeLeiXingId != null&&!"".equals(LvKeLeiXingId)){
            LvKeLeiXingIdInt = Integer.parseInt(LvKeLeiXingId);
        }

        //LvKeLeiXingId值为55为散客登记
        if(LvKeLeiXingIdInt==55){

            //LvKeLeiXingId值为55为散客登记
            return "forward:tolist_PassengerReserve.do";
        }else {

            //这里通过forward避免添加WEB-INF的影响
            return "forward:tolist_ReceivetargetReserve.do";
        }
    }
}
