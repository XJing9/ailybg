package com.aaa.controller;

import com.aaa.dao.OrderDao;
import com.aaa.entity.Order;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("Order")
public class OrderCon {

    @Resource
    OrderDao orderDao;

    @RequestMapping("query")
    public List<Order> query(){
        return orderDao.query();
    }

    @RequestMapping("add")
    public Integer add(Order order){
        return orderDao.add(order);
    }
}
