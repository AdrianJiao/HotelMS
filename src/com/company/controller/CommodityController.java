package com.company.controller;

import com.company.bean.Commodity;
import com.company.service.CommodityService;
import com.company.vo.MyPage;
import com.company.vo.CommodityQueryvo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommodityController {
    @Autowired
    CommodityService commodityService;

    @RequestMapping("/Commodity/tolist.do")
    public String findCommodityList(CommodityQueryvo vo, Model model) {

        MyPage<Commodity> page = commodityService.findCommodityList(vo);

        return "";
    }

}
