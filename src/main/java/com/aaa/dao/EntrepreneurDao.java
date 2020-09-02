package com.aaa.dao;

import com.aaa.entity.Entreprenenur;
import com.aaa.entity.Issue_position;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface EntrepreneurDao extends tk.mybatis.mapper.common.Mapper<Entreprenenur> {
    @Select("select * from entreprenenur en join area ar on en.are_id=ar.are_id left join industry i on en.ind_id=i.ind_id where en.ent_name like CONCAT('%',#{ent_name},'%')")
    List<Entreprenenur>mhqueryent(@Param("ent_name") String ent_name);

    @Select("select * from entreprenenur en join area ar on en.are_id=ar.are_id left join industry i on en.ind_id=i.ind_id order by ent_id")
    List<Entreprenenur>queryent();

    @Delete("delete from entreprenenur where ent_id=#{ent_id}")
    Integer deleteent(Integer ent_id);

    @Update("update entreprenenur set ent_name=#{ent_name},ent_abbreviation=#{ent_abbreviation}," +
            "ent_nature=#{ent_nature},ent_scale=#{ent_scale},are_id=#{are_id},ind_id=#{ind_id}," +
            "ent_photo=#{ent_photo},ent_capital=#{ent_capital},ent_url=#{ent_url},ent_intro=#{ent_intro}," +
            "ent_introduce=#{ent_introduce},ent_logintime=#{ent_logintime},ent_license=#{ent_license}" +
            "where ent_id=#{ent_id}")
    Integer updent(Entreprenenur entreprenenur);

    /*@Select("select * from entreprenenur e1 left join Issue_position i1 on e1.ent_id=i1.ent_id where e1.ent_id=#{ent_id}")
    List<Entreprenenur>listissent(Integer ent_id);*/

    @Select("select * from Issue_position i1 left join entreprenenur e1 on i1.ent_id=e1.ent_id where i1.ent_id=#{ent_id}")
    List<Issue_position>listissent2(Integer ent_id);

    @Select("select * from entreprenenur")
    List<Entreprenenur>listquery();

    //修改企业状态
    @Update("update entreprenenur set ent_authentication=#{ent_authentication} where ent_id=#{ent_id}")
    Integer updzyzt(Entreprenenur entreprenenur);

    //修改状态
    @Update("update entreprenenur set ent_state=#{ent_state} where ent_id=#{ent_id}")
    Integer updzt(Entreprenenur entreprenenur);
}
