package com.aaa.dao;

import com.aaa.entity.Work_experience;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface Work_experienceDao extends tk.mybatis.mapper.common.Mapper<Work_experience> {
    @Select("select * from Work_experience w1 left join resume r1 on w1.res_id=r1.res_id where w1.res_id=#{res_id}")
    List<Work_experience>querywork(Integer res_id);
}
