package com.aaa.controller;

import com.aaa.dao.Pay_functionDao;
import com.aaa.entity.Pay_function;
import org.apache.ibatis.annotations.Insert;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("pay")
public class Pay_functionCon {
    @Resource
    Pay_functionDao pay_functionDao;

    @RequestMapping("query")
    public List<Pay_function> query(){
        return pay_functionDao.selectAll();
    }

    @RequestMapping("add")
    public Integer add(Pay_function pay_function){
        return pay_functionDao.inserts(pay_function);
    }

    @RequestMapping("update")
    public Integer update(Pay_function pay_function){
        return pay_functionDao.Update(pay_function);
    }

    @RequestMapping("delete")
    public Integer delete(Integer pay_id){
        return pay_functionDao.deletes(pay_id);
    }
}

