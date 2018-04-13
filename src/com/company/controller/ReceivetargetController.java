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
    public String showReceivetars(String currentPage, String txtname,Model model) {
        int currentPageInt;

        if(currentPage==null||"".equals(currentPage)){
            //进入首页
            currentPageInt = 1;
        }else {
            //分页页码
            currentPageInt = Integer.parseInt(currentPage);
        }

        if(txtname!=null&&!"".equals(txtname)){
            //搜索字段
            txtname = "%"+txtname+"%";
        }

        Page<Receivetarget> receivetargetPage =
                receivetargetService.queryPartReceivetargets(currentPageInt,txtname);

        //添加到视图中
        model.addAttribute("list",receivetargetPage);
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

        //转到tolist请求
        return "redirect:tolist.do";
    }

    //检查团队名是否存在
    @RequestMapping("YZ")
    public void checkTeamCode(String teamCode, HttpServletResponse response) throws IOException {
        //ajax直接使用response返回
        List<Receivetarget> receivetargets = receivetargetService.queryReceivetargetByTeamCode(teamCode);
        if (receivetargets.size() >= 1) {
            response.getWriter().write("1");
        }
        response.getWriter().write("0");
    }


    @RequestMapping("toupdate")
    public String toUpdate(String tid,Model model){

        //填充对象类别
        int aid = attributeService.queryAidByAttributeName("对象类别");
        List<Attributevalue> attributevalues = attributevalueService.queryAttributevalueByAid(aid);
        model.addAttribute("listOne", attributevalues);

        //根据tid查询数据回显
        Receivetarget receivetarget = receivetargetService.queryReceivetargetByTid(Integer.parseInt(tid));
        model.addAttribute("list",receivetarget);
        return "receivetarget/update";
    }


    //修改接待对象信息
    @RequestMapping("update")
    public String update(Receivetarget receivetarget,HttpServletRequest request){
        receivetargetService.updateReceivetarget(receivetarget);

        String contextPath = request.getServletContext().getContextPath();

        //转到tolist请求
        return "redirect:tolist.do";
    }

    //批量删除Receivetarget
    @RequestMapping("delete")
    public String deleteReceivetars (String[] tid) {
        receivetargetService.deleteBatchByTid(tid);

        //转到tolist请求
        return "redirect:tolist.do";
    }

    //批量删除Receivetarget
    @RequestMapping("test")
    public String test (String[] tid) {
        List<Receivetarget> receivetargets = receivetargetService.queryAllReceivetarget();
        List<Receivetarget> receivetargets1 = receivetargetService.queryReceivetargetByTeamName("%F%");

        System.out.println("全部查询"+receivetargets);
        System.out.println("模糊查询"+receivetargets);

        //转到tolist请求
        return "redirect:tolist.do";
    }
}
