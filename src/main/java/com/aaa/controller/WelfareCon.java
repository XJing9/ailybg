package com.aaa.controller;

import com.aaa.dao.WelfareDao;
import com.aaa.entity.Welfare;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("Welfare")
public class WelfareCon {
    @Resource
    WelfareDao welfareDao;

    @RequestMapping("query")
    @ResponseBody
    public List<Welfare>queryWelfare(){
        return welfareDao.selectAll();
    }
}
