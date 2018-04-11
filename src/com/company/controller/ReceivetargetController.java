package com.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ReceiveTarget")
public class ReceivetargetController {

    @RequestMapping("tolist")
    public String showReceivetars(){
        return "receivetarget/list";
    }

    @RequestMapping("toadd")
    public String addReceivetar(){
        return  "receivetarget/add";
    }

    //检查团队名是否存在
    @RequestMapping("YZ")
    public int checkTeamCode(String teamCode){
        return 0;
    }

}
