package com.aaa.dao;

import com.aaa.entity.Customer;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CustomerDao extends tk.mybatis.mapper.common.Mapper<Customer> {
    List<Customer> customer_selectAll(Customer customer);
    @Delete("delete from customer where cus_id=#{cus_id}")
    Integer customer_delete(Integer cus_id);
    Integer customer_update(Customer customer);
}
