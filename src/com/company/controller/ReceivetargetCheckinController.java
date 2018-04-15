package com.company.controller;


import com.company.bean.*;
import com.company.service.*;
import com.company.utils.Page;
import com.company.vo.PassengerCheckinVO;
import com.company.vo.ReceivetargetCheckinVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
@RequestMapping("StayRegister")
public class ReceivetargetCheckinController {

    @Autowired
    AttributeService attributeService;

    @Autowired
    AttributevalueService attributevalueService;

    @Autowired
    ReceivetargetService receivetargetService;

    @Autowired
    RoomService roomService;

    @Autowired
    DepositService depositService;

    @Autowired
    ReceivetargetCheckinService receivetargetCheckinService;


    //填充数据页面
    @RequestMapping("tolist_ReceivetargetCheckin")
    public String showPassengerCheckin(String txtname, String isBillID,String currentPage, Model model){
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

        Page<ReceivetargetCheckinVO> ReceivetargetCheckinVOPage = receivetargetCheckinService
                .queryPartReceivetargetCheckins(txtname, isBillIDInt, currentPageInt);

        System.out.println("团队分页信息"+ReceivetargetCheckinVOPage);

        //添加到视图中
        model.addAttribute("list",ReceivetargetCheckinVOPage);

        //填充下拉框
        int aid = attributeService.queryAidByAttributeName("结账状态");
        List<Attributevalue> attributevalues = attributevalueService.queryAttributevalueByAid(aid);
        model.addAttribute("listOne", attributevalues);

        //一定要注意这个问题
        model.addAttribute("isBillID", isBillIDInt);
        return "stayregister/list";
    }

    //安排房间
    @RequestMapping("tooarrangeroom")
    public String toArrangeRoom(Integer LvKeLeiXingId, Integer tuanDuiID,Model model ){

        /*//填充出租方式
        int aid1 = attributeService.queryAidByAttributeName("出租方式");
        List<Attributevalue> attributevalues1 = attributevalueService.queryAttributevalueByAid(aid1);
        model.addAttribute("listRentOutType",attributevalues1);

        //填充旅客类别
        int aid2 = attributeService.queryAidByAttributeName("旅客类别");
        List<Attributevalue> attributevalues2 = attributevalueService.queryAttributevalueByAid(aid2);
        model.addAttribute("listPassengerType",attributevalues2);

        //填充结账单位
        int aid3 = attributeService.queryAidByAttributeName("结账单位");
        List<Attributevalue> attributevalues3 = attributevalueService.queryAttributevalueByAid(aid3);
        model.addAttribute("listBillUnit",attributevalues3);

        //填充支付方式
        int aid4 = attributeService.queryAidByAttributeName("支付方式");
        List<Attributevalue> attributevalues4 = attributevalueService.queryAttributevalueByAid(aid4);
        model.addAttribute("listPayWay",attributevalues4);
        List<Room> result = roomService.queryAllRoom();

        System.out.println(result);
        model.addAttribute("list",result);

        //旅客信息ID和团队ID
        model.addAttribute("LvKeLeiXingId", LvKeLeiXingId);
        model.addAttribute("tuanDuiID", tuanDuiID);
        return "/stayregister/arrangeroom";*/

        return null;
    }

    //客房等级选择页面
    @RequestMapping("tooguestRoomLevelSelectRoom")
    @ResponseBody
    public List<Room> guestRoomLevelSelectRoom(@RequestParam Integer guestRoomLevelID, HttpServletResponse response) throws IOException {
        if (guestRoomLevelID == 0) {
            List<Room> result = roomService.queryAllRoom();
            System.out.println("result1="+result);
            return result ;
        }
        List<Room> result= roomService.queryRoomByGuestRoomLevel(guestRoomLevelID);
        System.out.println("result2="+result);
        return result;
    }

    //分配房间
    @RequestMapping("toaarrangeroom")
    public String arrangeRoom(ReceivetargetCheckin receivetargetCheckin, String roomName){

        //手动设置房间号
        receivetargetCheckin.setRoomNumber(roomName);

        //设置主键
        String passengerCheckInId = UUID.randomUUID().toString();
        receivetargetCheckin.setReceivetargetCheckInId(passengerCheckInId);

        //设置为未结账,记住表不能更改
        receivetargetCheckin.setIsBillID(""+62);

        //押金表中要添加的数据
        double depositValue = receivetargetCheckin.getDeposit();
        String depositPayWayID = receivetargetCheckin.getDepositPayWayID();
        Date registerTime = receivetargetCheckin.getRegisterTime();

        //押金表添加操作
        Deposit deposit = new Deposit();
        deposit.setCheckInId(passengerCheckInId);
        deposit.setDeposit(depositValue);
        deposit.setDepositRegisterTime(registerTime);
        depositService.insertSelective(deposit);

        //添加入住用户
        receivetargetCheckinService.insertSelective(receivetargetCheckin);
        return "redirect:tolist.do";
    }

    /*登记用户填充数据*/
    @RequestMapping("tooregister")
    public  String toRegister(@RequestParam("id") String receivetargetCheckinId,String roomNumber,Model model){
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

        //存放记录ID
        model.addAttribute("stayRegisterId", receivetargetCheckinId);

        //散客操作
        model.addAttribute("LvKeLeiXingId", 56);
        return "stayregister/register";
    }

    //填充选择团队
    @RequestMapping("selectReceivetarget")
    @ResponseBody
    public List<Receivetarget>  selectReceivetarget(HttpServletResponse response, String txtname) throws IOException {
        //是否有条件查询
        if(txtname==null||"".equals(txtname)){
            List<Receivetarget> receivetargets = receivetargetService.queryAllReceivetarget();
            System.out.println("真的哈佛暗示："+receivetargets);
            return  receivetargets;
        } else {
            //模糊查询
            return receivetargetService.queryReceivetargetByTeamName("%"+txtname+"%");
        }
    }

    //选择填充数据后回显
    @RequestMapping("confirmReceivetarget")
    @ResponseBody
    public Receivetarget confirmReceivetarget(String pid){
        return receivetargetService.queryReceivetargetByTid(Integer.parseInt(pid));
    }
}
