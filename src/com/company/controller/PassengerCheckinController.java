package com.company.controller;

import com.company.bean.Attributevalue;
import com.company.bean.Passenger;
import com.company.bean.PassengerCheckin;
import com.company.bean.Receivetarget;
import com.company.service.AttributeService;
import com.company.service.AttributevalueService;
import com.company.service.PassengerCheckinService;
import com.company.service.PassengerService;
import com.company.utils.Page;
import com.company.vo.PassengerCheckinVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@Service
@RequestMapping("StayRegister")
public class PassengerCheckinController {

    @Autowired
    PassengerCheckinService passengerCheckinService;

    @Autowired
    AttributeService attributeService;

    @Autowired
    AttributevalueService attributevalueService;

    @Autowired
    PassengerService passengerService;

    @RequestMapping("tolist")
    public String showPassengerCheckin(String txtname, String isBillID,String currentPage, Model model){


        System.out.println("显示参数参数参数参："+isBillID);

        //填充数据
        int currentPageInt;
        int isBillIDInt ;

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

        if(isBillID!=null&&!"".equals(isBillID)){
            //搜索字段
            isBillIDInt = Integer.parseInt(isBillID);
        }else {
            //62即未结账
            isBillIDInt = 62 ;
        }

        Page<PassengerCheckinVO> passengerCheckinVOPage = passengerCheckinService
                .queryPartPassengerCheckins(txtname, isBillIDInt, currentPageInt);

        System.out.println(passengerCheckinVOPage);

        //添加到视图中
        model.addAttribute("list",passengerCheckinVOPage);

        //填充下拉框
        int aid = attributeService.queryAidByAttributeName("结账状态");
        List<Attributevalue> attributevalues = attributevalueService.queryAttributevalueByAid(aid);
        model.addAttribute("listOne", attributevalues);

        //一定要注意这个问题
        model.addAttribute("isBillID", isBillIDInt);

        System.out.println("下拉框"+attributevalues);
        return "stayregister/list";
    }

    /*登记用户填充数据*/
    @RequestMapping("toregister")
    public  String toRegister(@RequestParam("id") String passengerCheckInId,String roomNumber,Model model){
        //填充下拉框
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

        //填充房间号和id
        model.addAttribute("roomNumber", roomNumber);

        //无用信息，jsp不错而已
        model.addAttribute("id", passengerCheckInId);

        //填充LvKeLeiXingId字段为注册提供信息
        model.addAttribute("LvKeLeiXingId", passengerCheckInId);
        return "stayregister/register";
    }

    //填充选择旅客
    @RequestMapping("selectPassenger")
    @ResponseBody
    public List<Passenger>  selectPassenger(HttpServletResponse response,
                                            String txtname) throws IOException {
        //是否有条件查询
        if(txtname==null||"".equals(txtname)){
            return passengerService.queryAllPassenger();
        }else {
            //模糊查询
            return passengerService.queryPassengerByName("%"+txtname+"%");
        }
    }

    //选择填充数据后回显
    @RequestMapping("confirmPassenger")
    @ResponseBody
    public Passenger confirmPassenger(String pid){
       return passengerService.queryPassengerByPid(Integer.parseInt(pid));
    }

    //登记用户
    @RequestMapping("register")
    public  String register(@RequestParam("LvKeLeiXingId") String passengerCheckInId,
                            String lvKeID){
        //lvKeID就是pid

        //新建的旅客则需新建一条旅客信息记录，然后获取新建的pid
        if(lvKeID==null||"".equals(lvKeID)){

        }else {
            //如果是选择选出来的数据，判断是否修改过选出来的数据

        }
        return "stayregister/register";
    }

}
