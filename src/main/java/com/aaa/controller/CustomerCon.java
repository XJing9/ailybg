package com.aaa.controller;

import com.aaa.dao.CustomerDao;
import com.aaa.entity.Customer;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("CustomerCon")
public class CustomerCon {
    @Resource
    CustomerDao customerDao;
    @RequestMapping("customer_selectAll")
    public List<Map<String,Object>> customer_selectAll(Customer customer){
        return customerDao.customer_selectAll(customer);
    }
    @RequestMapping("customer_delete")
    public Integer customer_delete(Integer cus_id){
        return customerDao.customer_delete(cus_id);
    }
    @RequestMapping("customer_update")
    public Integer customer_update(Customer customer){
        System.out.println(customer.getCus_id());
        System.out.println(customer.getCus_state());
        return customerDao.customer_update(customer);
    }

}
