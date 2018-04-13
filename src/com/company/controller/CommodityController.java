package com.company.controller;

import com.company.bean.Commodity;
import com.company.bean.Commoditytype;
import com.company.service.CommodityService;
import com.company.service.CommoditytypeService;
import com.company.utils.MyException;
import com.company.vo.CommodityPage;
import com.company.vo.Page;
import com.company.vo.CommodityQueryvo;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

@Controller
public class CommodityController {
    @Autowired
    CommodityService commodityService;
    @Autowired
    CommoditytypeService commoditytypeService;

    /**
     * 此方法查询所有商品设置页面所需要的数据
     *
     * @param commodityTypeID 商品类别名称
     * @param txtname         商品的名称
     * @param model           jsp页面回显模型
     * @return
     */
    @RequestMapping("/Commodity/tolist.do")
    public String findCommodityList(String currentPage, String txtname, String commodityTypeID, Model model) {

        //商品分类数据页面显示
        List<Commoditytype> commoditytypes = commoditytypeService.findCommoditytypeList();

        if (commoditytypes != null) {

            model.addAttribute("commoditytypes", commoditytypes);
        }

        CommodityQueryvo vo = new CommodityQueryvo();

        if (commodityTypeID == null) {
            commodityTypeID = "1";
        }
        if (currentPage != null) {
            vo.setPage(Integer.parseInt(currentPage));
        }
        vo.setCommodityTypeID(commodityTypeID);
        vo.setTxtname(txtname);
        Page<CommodityPage> page = commodityService.findCommodityList(vo);

        if (page != null) {

            model.addAttribute("page", page);

            model.addAttribute("txtname", vo.getTxtname());

            model.addAttribute("commodityType", vo.getCommodityTypeID());
        }
        return "commodity/list";
    }

    /**
     * 此方法新增商品页面回显
     *
     * @return 跳转到新增商品页面
     */
    @RequestMapping("/Commodity/toadd.do")
    public String addCommodityIU(Model model) {

        //商品分类数据页面显示
        List<Commoditytype> commoditytypes = commoditytypeService.findCommoditytypeList();

        if (commoditytypes != null) {

            model.addAttribute("commoditytypes", commoditytypes);
        }

        ArrayList<String> list = new ArrayList<>();
        list.add("瓶");
        list.add("台");
        list.add("条");
        list.add("支");
        list.add("个");
        list.add("只");
        list.add("包");
        list.add("份");
        list.add("碟");
        model.addAttribute("list", list);

        return "commodity/add";
    }

    /**
     * 此方法往数据库添加商品
     *
     * @param commodity 新添加的商品参数
     * @return 跳转到商品设置主页面
     * @throws MyException 添加出现异常
     */
    @RequestMapping("/Commodity/add.do")
    public String addCommodity(@ModelAttribute Commodity commodity) throws MyException {

        boolean isAddSuccess = commodityService.addCommodity(commodity);

        if (!isAddSuccess) {
            throw new MyException("商品添加失败");
        }

        return "redirect:/Commodity/tolist.do";
    }

    /**
     * 此方法 检验商品添加的姓名是否已经存在
     *
     * @param commodityName
     * @return
     */
    @RequestMapping("/Commodity/checkAddCommodityName.do")
    public void checkAddCommodityName(String commodityName,
                                     HttpServletResponse response) throws IOException {
        response.getWriter().write(commodityService.checkAddCommodityName(commodityName));
    }

    /**
     * 此方法 回显修改商品页面的数据
     *
     * @return 跳转到修改商品页面
     */
    @RequestMapping("/Commodity/toupdate.do")
    public String updateCommodityIU(String id, Model model) {
        //商品分类数据页面显示
        List<Commoditytype> commoditytypes = commoditytypeService.findCommoditytypeList();

        if (commoditytypes != null) {

            model.addAttribute("commoditytypes", commoditytypes);
        }

        ArrayList<String> list = new ArrayList<>();
        list.add("瓶");
        list.add("台");
        list.add("条");
        list.add("支");
        list.add("个");
        list.add("只");
        list.add("包");
        list.add("份");
        list.add("碟");
        model.addAttribute("list", list);

        Commodity commodity = commodityService.findCommodityByName(id);

        if (commodity != null) {
            model.addAttribute("commodity", commodity);
        }
        return "commodity/update";
    }

    /**
     * 此方法 修改数据库商品
     *
     * @param id    商品名称
     * @param model
     * @return
     */
    @RequestMapping("/Commodity/update.do")
    public String updateCommodity(Commodity commodity, String id, Model model) throws MyException {

        if (commodity != null && id != null) {
            try {
                commodityService.updateCommodity(id, commodity);
            }catch (Exception ex){
                throw new MyException("商品修改失败");
            }
        }

        return "redirect:/Commodity/tolist.do";
    }
    @RequestMapping("/Commodity/delete.do")
    public String deleteCommodityById(String id) throws MyException {

       boolean isDeleteSuccess =  commodityService.deleteCommodityById(id);
       if (!isDeleteSuccess){
           throw new MyException("商品删除异常");
       }

       return "redirect:/Commodity/tolist.do";
    }

    /**
     * 此方法 添加新的商品分类
     * @param txtname 新添加的商品分类名称
     * @param model
     * @return
     */
    @RequestMapping("/Commodity/newadd.do")
    //${ctx}/Commodity/newadd.do?txtname
    public String newAdd(String txtname,Model model) throws MyException {

        Commoditytype co = new Commoditytype();
        co.setCommodityTypeID(UUID.randomUUID().toString());
        co.setCommodityTypeName(txtname);
        try {
            commoditytypeService.newAdd(co);
        }catch (Exception ex){
            throw new MyException("商品分类添加异常");
        }
        return "redirect:/Commodity/tolist.do";
    }

    //${ctx}/Commodity/newdelete.do?id='
    @RequestMapping("/Commodity/newdelete.do")
    public String newdeleteById(String id) throws MyException {

        try{
            commoditytypeService.newdeleteById(id);
        }catch (Exception ex){
            throw new MyException("商品分类删除异常");
        }


        return "redirect:/Commodity/tolist.do";
    }
}
