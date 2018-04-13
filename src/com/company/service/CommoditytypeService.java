package com.company.service;

import com.company.bean.Commoditytype;

import java.util.List;

public interface CommoditytypeService {

   List<Commoditytype> findCommoditytypeList();

    void newAdd(Commoditytype co);

    void newdeleteById(String id);
}
