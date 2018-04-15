package com.company.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static java.lang.Math.random;

@Controller
@RequestMapping("/DateView")
public class DateViewController {


    @RequestMapping(value = "/tolist",method = {RequestMethod.POST, RequestMethod.GET})
    public String tolist(Model model){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
        Date date = new Date();
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        instance.add(Calendar.MONTH,1);
        Date time = instance.getTime();
        String format1 = sdf.format(time);
        String format2 = sdf.format(date);

        String[] years = new String[12];
        String[] tuanduis = new String[12];
        String[] sankes = new String[12];

        years[0] = format1;
        years[1] = format2;



        for (int i = 1; i < 11; i++) {
            instance.setTime(date);
            instance.add(Calendar.MONTH,-i);
            Date date1 = instance.getTime();
            String format = sdf.format(date1);
            years[i+1] = format;
        }

        // 缺少 散客 和 团队的数据接口

        for (int i = 0; i < 12; i++) {
            sankes[i] = String.valueOf(random()*2000+2000);

        }
        for (int i = 0; i < 12; i++) {
            tuanduis[i] = String.valueOf(random()*2000+2000);

        }


        model.addAttribute("year",years);
        model.addAttribute("tuandui",tuanduis);
        model.addAttribute("sanke",sankes);

        return "dateview/shili";
    }

}