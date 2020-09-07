package com.aaa.dao;

import com.aaa.entity.Speciality;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface SpecialityDao extends tk.mybatis.mapper.common.Mapper<Speciality> {
    @Update("update Speciality set spe_name=#{spe_name} where spe_id=#{spe_id}")
    Integer updatespe(Speciality speciality);
    @Delete("delete from Speciality where spe_id=#{spe_id}")
    Integer deletespe(Integer spe_id);
    @Select("select spe_id,spe_name from Speciality where spe_name like CONCAT('%',#{spe_name},'%')")
    List<Speciality>moqueryspe(@Param("spe_name") String spe_name);
    @Select("select spe_id,spe_name from Speciality")
    List<Speciality>queryqb();
}
