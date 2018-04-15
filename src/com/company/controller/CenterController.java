package com.company.controller;


import com.company.bean.Attributevalue;
import com.company.bean.Room;
import com.company.service.AttributeService;
import com.company.service.AttributevalueService;
import com.company.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


//该控制器用于与jsp配合，解决旅客和团体的跳转连接一样的问题，tolist跳转连接一致
@Controller
public class CenterController {

    @Autowired
    RoomService roomService;

    @Autowired
    AttributeService attributeService;

    @Autowired
    AttributevalueService attributevalueService;


    //............登记模块...............

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

    //............预定模块......................................................................

    //分发显示团队登记和散客预定
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



    //分发显示团队登记和散客预定删除
    @RequestMapping("Predetermine/delete")
    public String chooseDeleteReserveController(String LvKeLeiXingId){

        //默认值56为团体
        int LvKeLeiXingIdInt = 56;
        if(LvKeLeiXingId != null&&!"".equals(LvKeLeiXingId)){
            LvKeLeiXingIdInt = Integer.parseInt(LvKeLeiXingId);
        }

        //LvKeLeiXingId值为55为散客登记
        if(LvKeLeiXingIdInt==55){

            //LvKeLeiXingId值为55为散客登记
            return "forward:delete_PassengerReserve.do";
        }else {

            //这里通过forward避免添加WEB-INF的影响
            return "forward:delete_ReceivetargetReserve.do";
        }
    }


    //新增中的预处理（预定模块中只要有一个就行）
    @RequestMapping("Predetermine/toadd")
    public String toAddPassengerPredetermine(String name, Model model,String id ,String type){

        int aid = attributeService.queryAidByAttributeName("支付方式");
        List<Attributevalue> attributevalues = attributevalueService.queryAttributevalueByAid(aid);
        model.addAttribute("listOne",attributevalues);
        model.addAttribute("name", name);

        //新增预处理提供的团队还是旅客以及对应ID
        model.addAttribute("id",id);

        //type为1表示团队，type为2表示旅客
        model.addAttribute("type",type);
        return "/predetermine/add";
    }

    //新增中的选择房间（预定模块中有一份就可以了）
    @RequestMapping("Predetermine/selectRoom")
    @ResponseBody
    public List<Room> selectRoom(String roomNumber){
        //是否有条件查询
        if(roomNumber==null||"".equals(roomNumber)){
            return  roomService.queryAllRoom();
        }else {
            //模糊查询
            return roomService.queryAllRoomByRoomNumber("%"+roomNumber+"%");
        }
    }

    //分配添加操作
    @RequestMapping("Predetermine/add")
    public String addReserve(String id,String type,String roomIdShuZu){
        int typeInt;
        //type为1表示团队，type为2表示旅客
        if(type==null||"".equals(type)){
            return "forward:add_PassengerReserve.do?id="+id+"&type="+type+"&roomIdShuZu="+roomIdShuZu;
        }else {
            typeInt = Integer.parseInt(type);
            if(typeInt==1){
                //团队
                return "forward:add_ReceivetargetReserve.do?id="+id+"&type="+type+"&roomIdShuZu="+roomIdShuZu;
            }else {
                //旅客
                return "forward:add_PassengerReserve.do?id="+id+"&type="+type+"&roomIdShuZu="+roomIdShuZu;
            }
        }
    }
}
