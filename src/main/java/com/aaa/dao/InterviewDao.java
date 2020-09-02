package com.aaa.dao;

import com.aaa.entity.Interview;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface InterviewDao extends tk.mybatis.mapper.common.Mapper<Interview> {
    @Select("select * from Interview i1 left join entreprenenur e1 on i1.ent_id=e1.ent_id")
    List<Interview>listint();

    @Select("select * from Interview i1 left join entreprenenur e1 on i1.ent_id=e1.ent_id where i1.int_name like CONCAT('%',#{int_name},'%')")
    List<Interview>mhlistint(@Param("int_name") String int_name);

    @Delete("delete from Interview where int_id=#{int_id}")
    Integer deleteint(Integer int_id);

    @Update("update Interview set int_name=#{int_name},int_email=#{int_email}," +
            "int_qq=#{int_qq},int_reladdress=#{int_reladdress},ent_id=#{ent_id},int_state=#{int_state} where int_id=#{int_id}")
    Integer updateint(Interview interview);
}