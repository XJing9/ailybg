package com.aaa.dao;

import com.aaa.entity.Landmark;
import com.aaa.entity.Pay_function;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface Pay_functionDao extends tk.mybatis.mapper.common.Mapper<Pay_function>{
    @Select("select * from pay_function")
    List<Pay_function> selectAll();

    @Insert("insert into pay_function(pay_name,pay_price) values(#{pay_name},#{pay_price})")
    Integer inserts(Pay_function pay_function);

    @Update("update pay_function set pay_name=#{pay_name},pay_price=#{pay_price} where pay_id=#{pay_id}")
    Integer Update(Pay_function pay_function);

    @Delete("delete from pay_function where pay_id=#{pay_id}")
    Integer deletes(Integer pay_id);


}
