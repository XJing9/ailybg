package com.aaa.dao;

import com.aaa.entity.Project_experience;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface Project_experienceDao extends tk.mybatis.mapper.common.Mapper<Project_experience> {
    @Select("select * from project_experience p1 left join Work_experience w1 on p1.wor_id=w1.wor_id where p1.wor_id=#{wor_id}")
    List<Project_experience>querypro(Integer wor_id);
}
