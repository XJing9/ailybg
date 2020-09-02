package com.aaa.dao;

import com.aaa.entity.Resume;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface ResumeDao extends tk.mybatis.mapper.common.Mapper<Resume> {
    @Select("select * from resume r1 left join Customer c1 on r1.cus_id=c1.cus_id where r1.res_education like CONCAT('%',#{res_education},'%')")
    List<Resume>queryres(@Param("res_education") String res_education);

    @Select("select * from resume r1 left join Customer c1 on r1.cus_id=c1.cus_id")
    List<Resume>query();

    @Update("update resume set res_state=#{res_state} where res_id=#{res_id}")
    Integer updatezt(Resume resume);
}
