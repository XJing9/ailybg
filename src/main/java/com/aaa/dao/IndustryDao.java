package com.aaa.dao;

import com.aaa.entity.Industry;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
@Mapper
public interface IndustryDao {

    @Select("select * from industry")
    List<Industry> querys();

    @Update("update industry set ind_name=#{ind_name},ind_state=#{ind_state} where ind_id=#{ind_id}")
    Integer update(Industry industry);

    @Delete("delete from industry where ind_id=#{ind_id}")
    Integer delete(Integer ind_id);
}
