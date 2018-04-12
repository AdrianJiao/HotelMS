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
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Controller
public class RoomController {

    @Autowired
    RoomService roomService;

    @Autowired
    AttributevalueService attributevalueService;
    @Autowired
    AttributeService attributeService;

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


        roomService.insert(room);

        return "/roomset/roomset";

    }

    @RequestMapping("/RoomSet/tolist")
    public String findAll(){

        return "roomset/roomset";
}

/*
    @RequestMapping("/RoomSet/delete")
    public String deleteByPrimaryKey(String roomNumber){
        roomService.deleteByPrimaryKey(roomNumber);
        return "roomset/roomset";
    }*/




}
