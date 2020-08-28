package com.aaa.controller;
import com.aaa.dao.AdminsDao;
import com.aaa.dao.PermissionDao;
import com.aaa.entity.Admins;
import com.aaa.util.PageHelpers;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("AdminsCon")
public class AdminsCon {
    @Resource
    AdminsDao adminsDao;
    @Resource
    PermissionDao permissionDao;
    @RequestMapping("admins_login")
    public List<Map<String,Object>> login(Admins admins){
        System.out.println(adminsDao.admins_login(admins));
        return adminsDao.admins_login(admins);
    }
    @RequestMapping("admins_update")
    public Integer admins_update(Admins admins){
        System.out.println(admins.toString());
        return adminsDao.admins_update(admins);
    }

    @RequestMapping("admins_insert")
    public Integer admins_insert(Admins admins){
        return adminsDao.admins_insert(admins);
    }
    @RequestMapping("admins_query")
    public List<Map<String,Object>> admins_query(Admins admins){
        return adminsDao.admins_query(admins);
    }
    @RequestMapping("admins_delete")
    public Integer admins_delete(Integer adm_id){
        return adminsDao.admins_delete(adm_id);
    }
}
