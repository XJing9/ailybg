package com.aaa.controller;

import com.aaa.dao.RoleDao;
import com.aaa.entity.Per_rol;
import com.aaa.entity.Role;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("RoleCon")
public class RoleCon {
    @Resource
    RoleDao roleDao;
    @RequestMapping("role_query")
    public List<Role> rol_query(Role role){
        return roleDao.select(role);
    }
    @RequestMapping("role_update")
    public Integer rol_update(Role role){
        return roleDao.updateByPrimaryKey(role);
    }
    @RequestMapping("role_delete")
    public Integer rol_delete(Role role){
        return roleDao.deleteByPrimaryKey(role);
    }
    @RequestMapping("role_insert")
    public Integer rol_insert(Role role){
        return roleDao.insert(role);
    }
    @RequestMapping("setAuthority")
    public Integer setAuthority(Integer rol_id,Integer[] per_id){
        System.out.println("rol_id:"+rol_id);
        System.out.println("per_id:"+per_id);
        int count=0;
        if(rol_id!=null){
            roleDao.deletePer_rol(rol_id);
            for (Integer p:per_id){
                roleDao.setAuthority(rol_id,p);
                count++;
            }
        }
        return count;
    }
    @RequestMapping("queryRol_id")
    public List<Map<String,Object>> queryRol_id(Integer rol_id){
        return roleDao.queryRol_id(rol_id);
    }
}
