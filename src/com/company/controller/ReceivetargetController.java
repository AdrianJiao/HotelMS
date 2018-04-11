package com.company.controller;

import com.company.bean.Receivetarget;
import com.company.service.ReceivetargetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@Controller
@RequestMapping("ReceiveTarget")
public class ReceivetargetController {

    @Autowired
    ReceivetargetService receivetargetService;

    //跳转到显示接待对象界面
    @RequestMapping("tolist")
    public String showReceivetars(){
        return "receivetarget/list";
    }

    //跳转到添加界面
    @RequestMapping("toadd")
    public String toAddReceivetar(Model model){
        //填充对象类别
        return  "receivetarget/add";
    }

    //添加操作
    @RequestMapping("add")
    public String addReceivetar(Receivetarget receivetarget){
        receivetargetService.addReceivetarget(receivetarget);
        return  "receivetarget/list";
    }

    //检查团队名是否存在
    @RequestMapping("YZ")
    public int checkTeamCode(String teamCode){
        Receivetarget receivetarget =
                receivetargetService.queryReceivetargetByTeamCode(teamCode);
        if(receivetarget!=null){
            return 1;
        }
        return 0;
    }
}
