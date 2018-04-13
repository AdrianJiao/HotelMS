package com.company.controller;

import com.company.bean.Attributevalue;
import com.company.bean.Passenger;
import com.company.service.AttributeService;
import com.company.service.AttributevalueService;
import com.company.service.PassengerService;
import com.company.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author skylar
 */
@Controller
@RequestMapping("/Passenger")
public class PassengerController {
    @Autowired
    private AttributeService attributeService;

    @Autowired
    private PassengerService passengerService;

    @Autowired
    AttributevalueService attributevalueService;


    //这里开始是版本二
    //跳转到显示界面
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

        Page<Passenger> passengerPage =
                passengerService.queryPartPassengers(currentPageInt,txtname);

        //添加到视图中
        model.addAttribute("list",passengerPage);
        return "passenger/list";
    }

    //跳转到添加界面
    @RequestMapping("toadd")
    public String toAddReceivetar(Model model) {
        //填充对象类别,待修改
        int aid = attributeService.queryAidByAttributeName("性别");
        List<Attributevalue> attributevalues = attributevalueService.queryAttributevalueByAid(aid);

        int aid1 = attributeService.queryAidByAttributeName("民族");
        List<Attributevalue> attributevalues1 = attributevalueService.queryAttributevalueByAid(aid1);

        int aid2 = attributeService.queryAidByAttributeName("证件类型");
        List<Attributevalue> attributevalues2 = attributevalueService.queryAttributevalueByAid(aid2);

        int aid3 = attributeService.queryAidByAttributeName("文化程度");
        List<Attributevalue> attributevalues3 = attributevalueService.queryAttributevalueByAid(aid3);

        int aid4 = attributeService.queryAidByAttributeName("旅客级别");
        List<Attributevalue> attributevalues4 = attributevalueService.queryAttributevalueByAid(aid4);

        int aid5 = attributeService.queryAidByAttributeName("事由");
        List<Attributevalue> attributevalues5 = attributevalueService.queryAttributevalueByAid(aid5);

        model.addAttribute("listGender", attributevalues);
        model.addAttribute("listNation", attributevalues1);
        model.addAttribute("listPapers", attributevalues2);
        model.addAttribute("listEducationDegree", attributevalues3);
        model.addAttribute("listPassengerLevel", attributevalues4);
        model.addAttribute("listThingReason", attributevalues5);
        return "passenger/add";
    }

    //添加操作
    @RequestMapping("add")
    public String addReceivetar(Passenger passenger) {
        passengerService.insertAll(passenger);

        //转到tolist请求
        return "redirect:tolist.do";
    }


    @RequestMapping("toupdate")
    public String toUpdate(String pid,Model model){
        //填充对象类别,待修改
        int aid = attributeService.queryAidByAttributeName("性别");
        List<Attributevalue> attributevalues = attributevalueService.queryAttributevalueByAid(aid);

        int aid1 = attributeService.queryAidByAttributeName("民族");
        List<Attributevalue> attributevalues1 = attributevalueService.queryAttributevalueByAid(aid1);

        int aid2 = attributeService.queryAidByAttributeName("证件类型");
        List<Attributevalue> attributevalues2 = attributevalueService.queryAttributevalueByAid(aid2);

        int aid3 = attributeService.queryAidByAttributeName("文化程度");
        List<Attributevalue> attributevalues3 = attributevalueService.queryAttributevalueByAid(aid3);

        int aid4 = attributeService.queryAidByAttributeName("旅客级别");
        List<Attributevalue> attributevalues4 = attributevalueService.queryAttributevalueByAid(aid4);

        int aid5 = attributeService.queryAidByAttributeName("事由");
        List<Attributevalue> attributevalues5 = attributevalueService.queryAttributevalueByAid(aid5);

        model.addAttribute("listGender", attributevalues);
        model.addAttribute("listNation", attributevalues1);
        model.addAttribute("listPapers", attributevalues2);
        model.addAttribute("listEducationDegree", attributevalues3);
        model.addAttribute("listPassengerLevel", attributevalues4);
        model.addAttribute("listThingReason", attributevalues5);

        //根据pid查询数据回显
        Passenger passenger = passengerService.queryPassengerByPid(Integer.parseInt(pid));

        System.out.println("乘客"+passenger);
        model.addAttribute("list",passenger);
        return "passenger/update";
    }


    //修改接待对象信息
    @RequestMapping("update")
    public String update(Passenger passenger,HttpServletRequest request){
        passengerService.updateById(passenger);

        //转到tolist请求
        return "redirect:tolist.do";
    }

    //批量删除
    @RequestMapping("delete")
    public String deleteReceivetars (String[] pid) {
        passengerService.deleteBatchByPid(pid);

        //转到tolist请求
        return "redirect:tolist.do";
    }
}
