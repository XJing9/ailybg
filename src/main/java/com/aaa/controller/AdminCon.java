package com.aaa.controller;

import com.aaa.dao.AdminDao;
import com.aaa.dao.PermissionDao;
import com.aaa.entity.Admins;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("AdminCon")
public class AdminCon {
    @Resource
    AdminDao adminDao;
    @Resource
    PermissionDao permissionDao;
    @RequestMapping("admin_login")
    public List<Admins> login(Admins admins){
        return adminDao.select(admins);
    }
}
