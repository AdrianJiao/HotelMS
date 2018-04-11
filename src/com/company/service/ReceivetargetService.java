package com.company.service;

import com.company.bean.Receivetarget;

import java.util.List;

public interface ReceivetargetService {

    int addReceivetarget(Receivetarget receivetarget);

    List<Receivetarget > queryPartReceivetargets();

    int updateReceivetarget(Receivetarget receivetarget);
}
