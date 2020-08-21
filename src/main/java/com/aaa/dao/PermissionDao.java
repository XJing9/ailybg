package com.aaa.dao;

import com.aaa.entity.Permission;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface PermissionDao extends Mapper<Permission> {
    @Select("select per.* from permission per join per_rol pr on per.per_id=pr.per_id where pr.rol_id=#{rol_id} and per_parent=0")
    List<Permission> menu_one(Integer rol_id);
}
