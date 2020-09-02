package com.aaa.dao;

import com.aaa.entity.Issue_position;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface Issue_positionDao extends tk.mybatis.mapper.common.Mapper<Issue_position> {
    @Select("select * from Issue_position i1 left join entreprenenur e1 on i1.ent_id=e1.ent_id")
    List<Issue_position> queryiss();

    @Select("select * from Issue_position i1 left join entreprenenur e1 on i1.ent_id=e1.ent_id where i1.iss_name like CONCAT('%',#{iss_name},'%')")
    List<Issue_position>queryissmh(@Param("iss_name") String iss_name);

    @Update("update Issue_position set iss_name=#{iss_name},ent_id=#{ent_id},iss_worknature=#{iss_worknature}," +
            "iss_count=#{iss_count},iss_department=#{iss_department},iss_education=#{iss_education}," +
            "iss_experience=#{iss_experience},iss_age=#{iss_age},iss_address=#{iss_address},iss_describe=#{iss_describe}," +
            "iss_state=#{iss_state} where iss_id=#{iss_id}")
    Integer updateiss(Issue_position issue_position);

    @Delete("delete from Issue_position where iss_id=#{iss_id}")
    Integer deleteiss(Integer iss_id);
}
