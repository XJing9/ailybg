package com.aaa.controller;

import com.aaa.dao.IndustryDao;
import com.aaa.dao.IndustrysDao;
import com.aaa.entity.Industry;
import com.aaa.entity.Industrys;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("Indus")
public class IndustryCon {

    @Resource
    IndustryDao industryDao;
    @Resource
    IndustrysDao industrysDao;

    @RequestMapping("query")
    public List<Industry> query(){
        return industryDao.querys();
    }

    @RequestMapping("delete")
    public Integer delete(Integer ind_id){
        return industryDao.delete( ind_id);

    }

    @RequestMapping("update")
    public String update(Industry industry){
        industryDao.update(industry);
        return "OK";
    }
}
