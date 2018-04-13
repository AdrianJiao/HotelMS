package com.company.controller;

import com.company.bean.Attributevalue;
import com.company.bean.Room;
import com.company.service.AttributeService;
import com.company.service.AttributevalueService;
import com.company.service.RoomService;
import com.company.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@Controller
public class RoomController {

    @Autowired
    RoomService roomService;

    @Autowired
    AttributevalueService attributevalueService;
    @Autowired
    AttributeService attributeService;

    /*
     * 查找全部客房
     * */

    @RequestMapping("/RoomSet/tolist")
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
        Page<Room> roomPage =
                roomService.queryPartRoom(currentPageInt,txtname);

        System.out.println(roomPage);

        //添加到视图中
        model.addAttribute("list",roomPage);
        return "/roomset/roomset";

    }

    @RequestMapping(path="/RoomSet/toadd",method = {RequestMethod.GET, RequestMethod.POST})
    public String toAddRoom(Model model, HttpServletRequest request){

        //填充房态
        int aid = attributeService.queryAidByAttributeName("房态");
        List<Attributevalue> attributevalues1 = attributevalueService.queryAttributevalueByAid(aid);
        model.addAttribute("listTwo",attributevalues1);

        //填充房间级别
        aid = attributeService.queryAidByAttributeName("客房等级");
        List<Attributevalue> attributevalues2 = attributevalueService.queryAttributevalueByAid(aid);
        model.addAttribute("listOne",attributevalues2);

        return "/roomset/add";

    }

    
    @RequestMapping("/RoomSet/add")
    public String addRoom(Room room, HttpServletRequest request, Model model){
        //手动添加房间状态
        //首先从页面获取状态值
       /* String far_id = request.getParameter("roomStateID");
        Attributevalue attributevalue = attributevalueService.queryAttributevalueByFar_id(Integer.parseInt(far_id));
        //得到状态值
        String roomstate = attributevalue.getAttributeDetailsName();
        room.setRoomStateID(roomstate);
        //手动填充客房等级
        String far_id1 = request.getParameter("guestRoomLevelID");
        Attributevalue attributevalue1 = attributevalueService.queryAttributevalueByFar_id(Integer.parseInt(far_id1));
        //得到状态值
        String guestRoomLevelID = attributevalue1.getAttributeDetailsName();
        room.setGuestRoomLevelID(guestRoomLevelID);
*/
        roomService.insert(room);
       // return "/roomset/roomset";
        return "redirect:tolist.do";

    }




    @RequestMapping("/RoomSet/toupdate")
    public String toUpdate(String roomNumber,Model model){
        //填充房态
        int aid = attributeService.queryAidByAttributeName("房态");
        List<Attributevalue> attributevalues1 = attributevalueService.queryAttributevalueByAid(aid);
        model.addAttribute("listTwo",attributevalues1);

        //填充房间级别
        aid = attributeService.queryAidByAttributeName("客房等级");
        List<Attributevalue> attributevalues2 = attributevalueService.queryAttributevalueByAid(aid);
        model.addAttribute("listOne",attributevalues2);

        //根据查询数据回显
        Room room = roomService.queryRoomByRoomNumber(roomNumber);
        System.out.println(room);
        model.addAttribute("listPo",room);
        return "/roomset/update";
    }


    //修改接待对象信息
    @RequestMapping("/RoomSet/update")
    public String update(Room room,HttpServletRequest request){
        int ret = roomService.updateRoom(room);

        System.out.println("结果"+ret);

        //转到tolist请求
        return "redirect:tolist.do";
    }

    //批量删除Receivetarget
    @RequestMapping("/RoomSet/delete")
    public String deleteReceivetars (String[] roomNumber) {
        roomService.deleteBatchByRoom(roomNumber);

        //转到tolist请求
        return "redirect:tolist.do";
    }

   /* //检查房间号是否存在
    @RequestMapping("/roomset/YZ")
    public String checkRoomNumber(String roomNumber,HttpServletResponse response) throws IOException {

        Room room = roomService.queryRoomByRoomNumber(roomNumber);

        System.out.println(room);
        return "redirect:toadd.do";

    }
*/



}
