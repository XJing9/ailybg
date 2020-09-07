package com.aaa.dao;

import com.aaa.entity.Photo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PhotoDao extends tk.mybatis.mapper.common.Mapper<Photo> {
//    @Insert("insert into photo values(#{pho_photo},#{pho_state})")
//    Integer addpop(Photo photo);
    @Select("select * from photo")
    List<Photo>querypho();

    @Delete("delete from photo where pho_id=#{pho_id}")
    Integer delpho(Integer pho_id);

    //批量删除
    @Delete("delete from photo where pho_id in (#{pho_id})")
    String pldel(String pho_id);
}
