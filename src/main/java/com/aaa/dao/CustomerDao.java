package com.aaa.dao;

import com.aaa.entity.Customer;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface CustomerDao extends tk.mybatis.mapper.common.Mapper<Customer> {
    List<Map<String, Object>> customer_selectAll(Customer customer);
    @Delete("delete from customer where cus_id=#{cus_id}")
    Integer customer_delete(Integer cus_id);
    Integer customer_update(Customer customer);
    @Select("select count(cus_id) from customer")
    Integer totalCount();
}
