package com.company.controller;


import com.company.bean.Commoditytype;
import com.company.service.CommoditytypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class CommoditytypeController {

    /**
     * 自动注入
     */
    @Resource
    private CommoditytypeService commoditytypeService;

    /**
     * 增加商品种类
     * src='${ctx}/Commodity/newadd.do?commodityTypeName='+commodityTypeName;
     * @param commoditytype
     * @param mv
     * @return
     */
    @RequestMapping("/Commodity/newadd.do")
    public ModelAndView addCommoditytype(@ModelAttribute Commoditytype commoditytype,ModelAndView mv){
        commoditytypeService.addCommodityType(commoditytype);
        mv.setViewName("redirect:/commodity/list");
        return mv;
    }

    /**
     * 删除商品种类
     * src='${ctx}/Commodity/newdelete.do?id='+chk_value;
     * @param mv
     * @param commodityTypeID
     * @return
     */
    @RequestMapping("/Commodity/newdelete.do")
    public ModelAndView removeCommoditytype(ModelAndView mv,String commodityTypeID){
        commoditytypeService.deleteCommodityType(commodityTypeID);
        mv.setViewName("redirect:/commodity/list");
        return mv;
    }





    /**
     * 跳转到list界面,
     * RequestMapping来自于main。jsp-》function commoditySet，中的
     * src='${ctx}/Commodity/tolist.do';
     * @return
     */
    @RequestMapping("/Commodity/tolist.do")
    public String toList() {
        return "commodity/list";//这个返回为jsp／commodity/lisp.jsp
    }

}
