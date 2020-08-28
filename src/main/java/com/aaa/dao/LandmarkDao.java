package com.aaa.dao;


import com.aaa.entity.Landmark;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface LandmarkDao  extends tk.mybatis.mapper.common.Mapper<Landmark>{
    @Select("select * from landmark where are_id=#{are_id}")
    List<Landmark> queryLan(Integer are_id);

}
