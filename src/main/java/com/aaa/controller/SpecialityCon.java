package com.aaa.controller;

import com.aaa.dao.SpecialityDao;
import com.aaa.entity.Speciality;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("Speciality")
public class SpecialityCon {
    @Resource
    private SpecialityDao specialityDao;

    @RequestMapping("query")
    @ResponseBody
    public List<Speciality>query(){
        return specialityDao.selectAll();
    }

    @RequestMapping("add")
    @ResponseBody
    public String add(@RequestBody Speciality speciality){
        Integer i=specialityDao.insertSelective(speciality);
        return "ok";
    }

    @RequestMapping("update")
    @ResponseBody
    public String update(@RequestBody Speciality speciality){
        Integer i=specialityDao.updatespe(speciality);
        return "ok";
    }

    @RequestMapping("delete")
    @ResponseBody
    public String delete(Integer spe_id){
        Integer i=specialityDao.deletespe(spe_id);
        return "ok";
    }

    @RequestMapping("mhquery")
    @ResponseBody
    public List<Speciality>mhquery(String spe_name) {
        //System.out.println(spe_name);
        if (spe_name == null || spe_name == "") {
            List<Speciality> list1 = specialityDao.selectAll();
            //System.out.println(list1);
            return list1;
        } else {
            //System.out.println("spe_name"+spe_name);
            List<Speciality> list2 = specialityDao.moqueryspe(spe_name);
            //System.out.println(list2);
            return list2;
        }
    }

    @RequestMapping("queryl")
    @ResponseBody
    public List<Speciality>queryl(){
        return specialityDao.queryqb();
    }
}
