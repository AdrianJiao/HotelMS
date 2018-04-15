package com.company.controller;

import com.company.bean.Attributevalue;
import com.company.bean.Passenger;
import com.company.bean.PassengerReserve;
import com.company.bean.Room;
import com.company.service.*;
import com.company.utils.Page;
import com.company.vo.PassengerCheckinVO;
import com.company.vo.PassengerReserveVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("Predetermine")
public class PassengerReserveController {

    @Autowired
    AttributeService attributeService;

    @Autowired
    AttributevalueService attributevalueService;

    @Autowired
    PassengerReserveService passengerReserveService;

    @Autowired
    PassengerService passengerService;



    @RequestMapping("tolist_PassengerReserve")
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

        Page<PassengerReserveVO> passengerReserveVOPage = passengerReserveService
                .queryPartPassengerReserves(txtname, stateInt, currentPageInt);

        //填充下拉框
        int aid = attributeService.queryAidByAttributeName("预定状态");
        List<Attributevalue> attributevalues = attributevalueService.queryAttributevalueByAid(aid);
        model.addAttribute("listOne",attributevalues);

        System.out.println(passengerReserveVOPage);

        //添加到视图中
        model.addAttribute("list",passengerReserveVOPage);

        //一定要注意这个问题
        model.addAttribute("state", stateInt);

        //一定要设置这个问题
        model.addAttribute("LvKeLeiXingId",55);
        return "predetermine/list";
    }

    @RequestMapping(path="/selectPassenger",method = RequestMethod.POST)
    @ResponseBody
    public List<Passenger>selectPassenger(String txtname) {
        //是否有条件查询
        if(txtname==null||"".equals(txtname)){
            return passengerService.queryAllPassenger();
        }else {
            //模糊查询
            return passengerService.queryPassengerByName("%"+txtname+"%");
        }
    }

    //只在passenger这加了一个
    @RequestMapping("/confirmPassenger")
    @ResponseBody
    public String confirmPassenger(@RequestParam int id){
        String  contactPhoneNumber= passengerService.queryContactPhoneNumber(id);
        System.out.println("contactPhoneNumber="+contactPhoneNumber);
        return contactPhoneNumber;
    }

    /*//新增旅客用户
    @RequestMapping("/add_PassengerReserve")
    public String addRoom(String id,String type,String roomIdShuZu){
        //设置主键
        String passengerReserveId = UUID.randomUUID().toString();
        passengerReserve.setPassengerReserveId(passengerReserveId);

        System.out.println("passengerReserveId="+passengerReserveId);
        passengerReserveService.insertSelective(passengerReserve);

    }*/


    @RequestMapping("/toupdate")
    public String   toupdatePredetermin(Model model){
        int aid = attributeService.queryAidByAttributeName("支付方式");
        List<Attributevalue> attributevalues = attributevalueService.queryAttributevalueByAid(aid);
        model.addAttribute("listOne",attributevalues);
        return "";
    }

    //旅客对象预定批量删除
    @RequestMapping("delete_ReceivetargetReserve")
    public String deleteReserve (String[] id) {
        passengerReserveService.deleteBatchByPrimaryKey(id);
        return "redirect:tolist.do?LvKeLeiXingId=55";
    }
}
