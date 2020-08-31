package com.aaa.controller;

import com.aaa.dao.PermissionDao;
import com.aaa.entity.Per_rol;
import com.aaa.entity.Permission;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("PermissionCon")
public class PermissionCon {
    @Resource
    PermissionDao permissionDao;
    @RequestMapping("menu_one")
    public List<Map<String,Object>> menu_one(Per_rol per_rol){
        //System.out.println(permissionDao.menu_one(rol_id));
        //��ȡһ���˵�
        List<Map<String,Object>> listOne=permissionDao.menu_one(per_rol.getRol_id());
        System.out.println(listOne);
        //��ȡ�����˵�
        for(Map<String,Object> m:listOne){
            //��ǰһ���˵��µĶ����˵�
            System.out.println(per_rol.getRol_id());
            System.out.println((Integer) m.get("per_id"));
            List<Map<String,Object>> listTwo=permissionDao.menu_two(per_rol.getRol_id(), (Integer) m.get("per_id"));
            System.out.println(listTwo);
            m.put("listTwo",listTwo);
        }
        return listOne;
    }
    @RequestMapping("menu_insert")
    public Integer menu_insert(Permission permission){
        return permissionDao.permission_insert(permission);
    }
    @RequestMapping("menu_query")
    public List<Map<String,Object>> menu_query(){
        List<Map<String,Object>> listOne=permissionDao.menu_query();
        for(Map<String,Object> m:listOne){
            //��ǰһ���˵��µĶ����˵�
            List<Map<String,Object>> listTwo=permissionDao.menu_twoQueryAll((Integer) m.get("per_id"));

            System.out.println(listTwo.toString());
            m.put("listTwo",listTwo);
            m.put("twoLength",listTwo.size());
        }
        return listOne;
    }
    @RequestMapping("permission_update")
    public Integer permission_update(Permission permission){
        return permissionDao.permission_update(permission);
    }
    @RequestMapping("permission_delete")
    public Integer permission_delete(Integer per_id){
        System.out.println(per_id);
        return permissionDao.permission_delete(per_id);
    }
}
