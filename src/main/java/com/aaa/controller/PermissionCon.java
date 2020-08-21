package com.aaa.controller;

import com.aaa.dao.PermissionDao;
import com.aaa.entity.Permission;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("PermissionCon")
public class PermissionCon {
    @Resource
    PermissionDao permissionDao;
    @RequestMapping("menu_one")
    public List<Permission> menu_one(Integer rol_id){
        System.out.println(permissionDao.menu_one(rol_id));
        return permissionDao.menu_one(rol_id);
    }
}
