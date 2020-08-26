package com.aaa.dao;

import com.aaa.entity.Admins;
import com.aaa.util.PageHelpers;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface AdminsDao extends tk.mybatis.mapper.common.Mapper<Admins> {
    @Select("select a.adm_id,a.adm_name,a.adm_pwd,a.adm_phone,a.rol_id,r.rol_name from admins a join role r on a.rol_id=r.rol_id\n" +
            "where a.adm_name=#{adm_name} and a.adm_pwd=#{adm_pwd}")
    List<Map<String,Object>> admins_login(Admins admins);
    Integer admins_update(Admins admins);
    List<Map<String,Object>> admins_query(Admins admins);
    @Delete("delete from admins where adm_id=#{adm_id}")
    Integer admins_delete(Integer adm_id);
    Integer admins_insert(Admins admins);
    @Select("select count(adm_id) from admins")
    Integer toatalCount();
}
