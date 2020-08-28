package com.aaa.dao;

import com.aaa.entity.Per_rol;
import com.aaa.entity.Permission;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

@org.apache.ibatis.annotations.Mapper
public interface PermissionDao extends Mapper<Permission> {
    @Select("select per.* from permission per join per_rol pr on per.per_id=pr.per_id where pr.rol_id=#{rol_id} and per_parent=0")
    List<Map<String,Object>> menu_one(Integer rol_id);

    @Select("select p.*,(SELECT count(rol_id) FROM per_rol pr where pr.rol_id=#{rol_id} and pr.per_id=p.per_id) ischecked\n" +
            "from permission p where p.per_parent=#{per_id}")
    List<Map<String,Object>> menu_two(@Param("rol_id") Integer rol_id, @Param("per_id") Integer per_id);
    Integer permission_insert(Permission permission);
    @Select("select * from permission where per_parent=0")
    List<Map<String,Object>> menu_query();
    @Select("select * from permission where per_parent=#{per_id}")
    List<Map<String,Object>> menu_twoQueryAll(Integer per_id);
    Integer permission_update(Permission permission);
    @Delete("delete from permission where per_id=#{per_id}")
    Integer permission_delete(Integer per_id);

}
