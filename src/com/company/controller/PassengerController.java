package com.company.controller;

import com.company.bean.Attribute;
import com.company.bean.Attributevalue;
import com.company.bean.Passenger;
import com.company.service.AttributeService;
import com.company.service.AttributevalueService;
import com.company.service.PassengerService;
import com.company.utils.Page;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;
import javax.servlet.http.HttpServletRequest;
import java.sql.PseudoColumnUsage;
import java.util.List;

@Controller
@RequestMapping("/Passenger")
public class PassengerController {

    @Autowired
    private AttributeService attributeService;

    @Autowired
    AttributevalueService attributevalueService;

    @Autowired
    private PassengerService passengerService;

    @RequestMapping("/tolist")
    public ModelAndView tolist(HttpServletRequest request,Integer currentPage,String txtname){
        ModelAndView mv = null;
        mv = new ModelAndView("/passenger/list");
//        Page<Passenger> ob = new Page<Passenger>();
        if(currentPage == null){
            currentPage = 1;
        }else if(currentPage == 0){
            currentPage = 1;
        }

        if(txtname == null){
            txtname="";
        }
//       ob.setCurrentPage(currentPage);
//
//       mv.addObject("list",ob);
       mv.addObject("txtname",txtname);
       return mv;

    }




    @RequestMapping("/toadd")
    public ModelAndView toadd(){
        ModelAndView mv = null;

        int aid = attributeService.queryAidByAttributeName("性别");
        List<Attributevalue> listGender = attributevalueService.queryAttributevalueByAid(aid);

        int bid = attributeService.queryAidByAttributeName("民族");
        List<Attributevalue> listNation = attributevalueService.queryAttributevalueByAid(bid);

        int cid = attributeService.queryAidByAttributeName("旅客级别");
        List<Attributevalue> listPassengerLevel = attributevalueService.queryAttributevalueByAid(cid);

        int did = attributeService.queryAidByAttributeName("文化程度");
        List<Attributevalue> listEducationDegree = attributevalueService.queryAttributevalueByAid(did);

        int eid = attributeService.queryAidByAttributeName("证件类型");
        List<Attributevalue> listPapers = attributevalueService.queryAttributevalueByAid(eid);

        int fid = attributeService.queryAidByAttributeName("事由");
        List<Attributevalue> listThingReason = attributevalueService.queryAttributevalueByAid(fid);

        mv = new ModelAndView("/passenger/add");
        mv.addObject("listGender",listGender);
        mv.addObject("listNation",listNation);
        mv.addObject("listPassengerLevel",listPassengerLevel);
        mv.addObject("listEducationDegree",listEducationDegree);
        mv.addObject("listPapers",listPapers);
        mv.addObject("listThingReason",listThingReason);

        return mv;

    }


    @RequestMapping("/toupdate")
    public ModelAndView toupdate(int id){
        ModelAndView mv = null;

        int aid = attributeService.queryAidByAttributeName("性别");
        List<Attributevalue> listGender = attributevalueService.queryAttributevalueByAid(aid);

        int bid = attributeService.queryAidByAttributeName("民族");
        List<Attributevalue> listNation = attributevalueService.queryAttributevalueByAid(bid);

        int cid = attributeService.queryAidByAttributeName("旅客级别");
        List<Attributevalue> listPassengerLevel = attributevalueService.queryAttributevalueByAid(cid);

        int did = attributeService.queryAidByAttributeName("文化程度");
        List<Attributevalue> listEducationDegree = attributevalueService.queryAttributevalueByAid(did);

        int eid = attributeService.queryAidByAttributeName("证件类型");
        List<Attributevalue> listPapers = attributevalueService.queryAttributevalueByAid(eid);

        int fid = attributeService.queryAidByAttributeName("事由");
        List<Attributevalue> listThingReason = attributevalueService.queryAttributevalueByAid(fid);

        Passenger list = passengerService.selectById(id);
        mv = new ModelAndView("/passenger/add");
        mv.addObject("listGender",listGender);
        mv.addObject("listNation",listNation);
        mv.addObject("listPassengerLevel",listPassengerLevel);
        mv.addObject("listEducationDegree",listEducationDegree);
        mv.addObject("listPapers",listPapers);
        mv.addObject("listThingReason",listThingReason);

        return mv;

    }


    @RequestMapping("/add")
    public ModelAndView add(Passenger passenger){
        ModelAndView mv = null;
        passengerService.insert(passenger);
        mv = new ModelAndView("redirect:/Passenger/tolist.do");
        return mv;
    }

    @RequestMapping("/update")
    public ModelAndView update(Passenger passenger){
        ModelAndView mv = null;
        passengerService.updateById(passenger);
        mv = new ModelAndView("redirect:/Passenger/tolist.do");

        return mv;
    }

    @RequestMapping("/delete")
    public ModelAndView delete(String id){
        ModelAndView mv = null;
        return mv;
    }


}
