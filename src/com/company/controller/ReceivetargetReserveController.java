package com.company.controller;

import com.company.bean.Attributevalue;
import com.company.bean.PassengerReserve;
import com.company.bean.Receivetarget;
import com.company.service.*;
import com.company.utils.Page;
import com.company.vo.PassengerReserveVO;
import com.company.vo.ReceivetargetReserveVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("Predetermine")
public class ReceivetargetReserveController {

    @Autowired
    AttributeService attributeService;

    @Autowired
    AttributevalueService attributevalueService;

    @Autowired
    ReceivetargetReserveService receivetargetReserveService;

    @Autowired
    ReceivetargetService receivetargetService;

    @RequestMapping("tolist_ReceivetargetReserve")
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

        Page<ReceivetargetReserveVO> receivetargetReserveVOPage = receivetargetReserveService.
                queryPartReceivetargetReserves(txtname, stateInt, currentPageInt);

        //填充下拉框
        int aid = attributeService.queryAidByAttributeName("预定状态");
        List<Attributevalue> attributevalues = attributevalueService.queryAttributevalueByAid(aid);
        model.addAttribute("listOne",attributevalues);

        System.out.println(receivetargetReserveVOPage);

        //添加到视图中
        model.addAttribute("list",receivetargetReserveVOPage);

        //一定要注意这个问题
        model.addAttribute("state", stateInt);

        //一定要设置这个问题
        model.addAttribute("LvKeLeiXingId",56);

        return "predetermine/list";
    }

    //接待对象填充
    @RequestMapping(path="/selectTarget",method = RequestMethod.POST)
    @ResponseBody
    public List<Receivetarget> selectReceivetargetByTeamName(String txtname) {
        if (txtname==null||"".equals(txtname)) {
            return receivetargetService.queryAllReceivetarget();
        } else {

            return receivetargetService.queryReceivetargetByTeamName("%"+txtname+"%");
        }
    }

   /* //新增团队用户
    @RequestMapping("/add_ReceivetargetReserve")
    public String addReceive(String id,String type,String roomIdShuZu){



    }
*/




    //团队预定批量删除
    @RequestMapping("delete_PassengerReserve")
    public String deleteReserve (String[] id) {
        receivetargetReserveService.deleteBatchByPrimaryKey(id);
       return "redirect:tolist.do?LvKeLeiXingId=56";
    }
}
