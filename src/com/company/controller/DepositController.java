package com.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("StayRegister")
public class DepositController {

    @RequestMapping("todeposit")
    public String toDeposit(@RequestParam("id") String checkInId){

        return "/stayregister/deposit";
    }

}
