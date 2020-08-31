package com.aaa.controller;

import com.aaa.dao.AreaDao;
import com.aaa.dao.EntrepreneurDao;
import com.aaa.dao.IndustryDao;
import com.aaa.dao.Issue_positionDao;
import com.aaa.entity.Area;
import com.aaa.entity.Entreprenenur;
import com.aaa.entity.Industry;
import com.aaa.entity.Issue_position;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("Entrepreneur")
public class EntrepreneurCon {
    @Resource
    private EntrepreneurDao entrepreneurDao;
    @Resource
    private AreaDao areaDao;
    @Resource
    private IndustryDao industryDao;
    @Resource
    private Issue_positionDao issue_positionDao;

    @RequestMapping("query")
    @ResponseBody
    public List<Entreprenenur>queryent(String ent_name){
        //System.out.println(ent_name);
        if (ent_name==null || ent_name==""){
            List<Entreprenenur>list1=entrepreneurDao.queryent();
            System.out.println(list1);
            return list1;
        }else{
            List<Entreprenenur>list2=entrepreneurDao.mhqueryent(ent_name);
            System.out.println(list2);
            return list2;
        }
    }

    @RequestMapping("queryare")
    @ResponseBody
    public List<Area>queryare(){
        return areaDao.selectAll();
    }

    @RequestMapping("queryind")
    @ResponseBody
    public List<Industry>queryind(){
        return industryDao.querys();
    }

    @RequestMapping("add")
    @ResponseBody
    public String addent(@RequestBody Entreprenenur entreprenenur){
        Integer i=entrepreneurDao.insertSelective(entreprenenur);
        return "ok";
    }

    @RequestMapping("delete")
    @ResponseBody
    public String deleteent(Integer ent_id){
        Integer i=entrepreneurDao.deleteent(ent_id);
        return "ok";
    }

    @RequestMapping("update")
    @ResponseBody
    public String updateent(@RequestBody Entreprenenur entreprenenur){
        System.out.println(entreprenenur);
        Integer i=entrepreneurDao.updent(entreprenenur);
        System.out.println(i);
        return "ok";
    }

   /* @RequestMapping("queryissent")
    @ResponseBody
    public List<Entreprenenur>queryissent(Integer ent_id){
        System.out.println(ent_id);
        List<Entreprenenur> listissent=entrepreneurDao.listissent(ent_id);
        System.out.println(listissent);
        return listissent;
    }*/

    @RequestMapping("queryissent2")
    @ResponseBody
    public List<Issue_position>queryissent2(Integer ent_id){
        System.out.println(ent_id);
        List<Issue_position> listissent=entrepreneurDao.listissent2(ent_id);
        System.out.println(listissent);
        return listissent;
    }

    @RequestMapping("listquery")
    @ResponseBody
    public List<Entreprenenur>lisstquery(){
        return entrepreneurDao.listquery();
    }

    @RequestMapping("updqyzt")
    @ResponseBody
    public Integer updateqyzt(@RequestBody Entreprenenur entreprenenur){
        //System.out.println("状态：   "+entreprenenur.getEnt_authentication());
        Integer i=entrepreneurDao.updzyzt(entreprenenur);
        //System.out.println("修改了  ："+i+"  条数据");
        return i;
    }

    @RequestMapping("updzt")
    @ResponseBody
    public Integer updatezt(@RequestBody Entreprenenur entreprenenur){
        Integer i=entrepreneurDao.updzt(entreprenenur);
        return i;
    }
}
