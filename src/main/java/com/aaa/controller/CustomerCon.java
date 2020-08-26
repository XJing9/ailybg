package com.aaa.controller;

import com.aaa.dao.CustomerDao;
import com.aaa.entity.Customer;
import com.aaa.util.PageHelpers;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
    public PageHelpers customer_selectAll(PageHelpers ph,Customer customer){
        PageHelper.startPage(ph.getPageNum(),ph.getPageSize());
        List<Map<String, Object>> customerList=customerDao.customer_selectAll(customer);
        System.out.println(customerList);
        ph.setRows(customerList);
        PageInfo<Map<String, Object>> pageInfo = new PageInfo<Map<String, Object>>(customerList);
        int pages=pageInfo.getPages();
        ph.setLastPage(pages);
        ph.setTotalCount(customerDao.totalCount());
        System.out.println(ph.getRows().toString());
        return ph;
    }
    @RequestMapping("customer_delete")
    public Integer customer_delete(Integer cus_id){
        return customerDao.customer_delete(cus_id);
    }
    @RequestMapping("customer_update")
    public Integer customer_update(Customer customer){
        System.out.println(customer.toString());
        return customerDao.customer_update(customer);
    }
}
