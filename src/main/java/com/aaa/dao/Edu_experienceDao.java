package com.aaa.dao;

import com.aaa.entity.Edu_experience;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface Edu_experienceDao extends tk.mybatis.mapper.common.Mapper<Edu_experience> {
    @Select("select * from Edu_experience e1 left join resume r1 on e1.res_id=r1.res_id where e1.res_id=#{res_id}")
    List<Edu_experience>queryedu(Integer res_id);
}
