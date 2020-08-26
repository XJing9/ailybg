package com.aaa.controller;

import com.aaa.dao.IndustrysDao;
import com.aaa.entity.Industrys;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("IndustrysCon")
public class IndustrysCon {
    @Resource
    IndustrysDao industrysDao;
    @RequestMapping("queryAll")
    public List<Industrys> queryAll(){
        return industrysDao.selectAll();
    }
}
