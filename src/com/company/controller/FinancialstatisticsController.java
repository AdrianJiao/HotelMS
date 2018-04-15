package com.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("FinancialStatistics")
public class FinancialstatisticsController {

    @RequestMapping("tolist")
    public String showFinancialstatistics(){
        return "/financialstatistics/financialstatistics";
    }
}
