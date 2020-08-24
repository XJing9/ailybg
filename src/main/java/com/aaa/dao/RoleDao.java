package com.aaa.dao;

import com.aaa.entity.Per_rol;
import com.aaa.entity.Role;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface RoleDao extends tk.mybatis.mapper.common.Mapper<Role> {
    @Insert("insert into per_rol (rol_id,per_id)values(#{rol_id},#{per_id})")
    Integer setAuthority(@Param("rol_id") Integer rol_id,@Param("per_id") Integer per_id);
    @Select("select * from per_rol where rol_id=#{rol_id} and per_id=#{per_id}")
    List<Per_rol> queryPer_rol(@Param("rol_id") Integer rol_id,@Param("per_id") Integer per_id);
    @Delete("delete from per_rol where rol_id=#{rol_id}")
    Integer deletePer_rol(Integer rol_id);
    @Select("select pr.per_id,p.per_name\n" +
            "from per_rol pr\n" +
            "join permission p\n" +
            "on pr.per_id=p.per_id\n" +
            "where pr.rol_id=#{rol_id} and p.per_parent!=0")
    List<Map<String,Object>> queryRol_id(Integer rol_id);
}
