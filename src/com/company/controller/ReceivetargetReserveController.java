package com.company.controller;

import com.company.bean.Attributevalue;
import com.company.service.AttributeService;
import com.company.service.AttributevalueService;
import com.company.service.PassengerReserveService;
import com.company.service.ReceivetargetReserveService;
import com.company.utils.Page;
import com.company.vo.PassengerReserveVO;
import com.company.vo.ReceivetargetReserveVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("Predetermine")
public class ReceivetargetReserveController {

    @Autowired
    AttributeService attributeService;

    @Autowired
    AttributevalueService attributevalueService;

    @Autowired
    ReceivetargetReserveService receivetargetReserveService;

    @RequestMapping("tolist_ReceivetargetReserve")
    public String showPassengers(String txtname, String state,String currentPage, Model model){
        //填充数据
        int currentPageInt;
        int stateInt ;

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

        if(state!=null&&!"".equals(state)){
            //搜索字段
            stateInt = Integer.parseInt(state);
        }else {
            //57即未安排
            stateInt = 57;
        }

        Page<ReceivetargetReserveVO> receivetargetReserveVOPage = receivetargetReserveService.
                queryPartReceivetargetReserves(txtname, stateInt, currentPageInt);

        //填充下拉框
        int aid = attributeService.queryAidByAttributeName("预定状态");
        List<Attributevalue> attributevalues = attributevalueService.queryAttributevalueByAid(aid);
        model.addAttribute("listOne",attributevalues);

        System.out.println(receivetargetReserveVOPage);

        //添加到视图中
        model.addAttribute("list",receivetargetReserveVOPage);

        //一定要注意这个问题
        model.addAttribute("state", stateInt);

        //一定要设置这个问题
        model.addAttribute("LvKeLeiXingId",56);

        return "predetermine/list";
    }
}
