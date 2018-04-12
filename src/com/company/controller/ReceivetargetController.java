package com.company.controller;

import com.company.bean.Attributevalue;
import com.company.bean.Receivetarget;
import com.company.service.AttributeService;
import com.company.service.AttributevalueService;
import com.company.service.ReceivetargetService;
import com.company.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

@Controller
@RequestMapping("ReceiveTarget")
public class ReceivetargetController {
    @Autowired
    ReceivetargetService receivetargetService;

    @Autowired
    AttributevalueService attributevalueService;

    @Autowired
    AttributeService attributeService;

    //跳转到显示接待对象界面
    @RequestMapping("tolist")
    public String showReceivetars(Model model) {

       /* //首页展示
        Page<Receivetarget> receivetargetPage = receivetargetService.queryPartReceivetargets(1);
      */


        return "receivetarget/list";
    }

    //跳转到添加界面
    @RequestMapping("toadd")
    public String toAddReceivetar(Model model) {
        //填充对象类别
        int aid = attributeService.queryAidByAttributeName("对象类别");
        List<Attributevalue> attributevalues = attributevalueService.queryAttributevalueByAid(aid);
        model.addAttribute("listOne", attributevalues);
        return "receivetarget/add";
    }

    //添加操作
    @RequestMapping("add")
    public String addReceivetar(Receivetarget receivetarget) {
        receivetargetService.addReceivetarget(receivetarget);
        Date registerTime = receivetarget.getRegisterTime();
        System.out.println(registerTime);
        return "receivetarget/list";
    }

    //检查团队名是否存在
    @RequestMapping("YZ")
    public void checkTeamCode(String teamCode,HttpServletResponse response) throws IOException {
        //ajax直接使用response返回
        List<Receivetarget> receivetargets = receivetargetService.queryReceivetargetByTeamCode(teamCode);
        if (receivetargets.size()>=1) {
            response.getWriter().write("1");
        }
        response.getWriter().write("0");
    }
}
