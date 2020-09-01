package com.aaa.dao;

import com.aaa.entity.Order;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface OrderDao extends tk.mybatis.mapper.common.Mapper<Order> {
    @Select("select * from orders o join pay_function p on o.ord_id=p.pay_id join customer c on o.cus_id=c.cus_id")
    List<Order> query();

    @Insert("insert into orders(cus_id,pay_id,ord_time,ord_method,ord_totalprice,ord_payment) values (#{cus_id},#{pay_id},#{ord_time},#{ord_method},#{ord_totalprice},#{ord_payment})")
    Integer add(Order order);
}
