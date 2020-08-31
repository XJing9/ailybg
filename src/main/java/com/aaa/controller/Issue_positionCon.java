package com.aaa.controller;

import com.aaa.dao.EntrepreneurDao;
import com.aaa.dao.Issue_positionDao;
import com.aaa.entity.Entreprenenur;
import com.aaa.entity.Issue_position;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("Issue_position")
public class Issue_positionCon {
    @Resource
    private Issue_positionDao issue_positionDao;
    @Resource
    private EntrepreneurDao entrepreneurDao;

    @RequestMapping("query")
    @ResponseBody
    public List<Issue_position>queryiss(String iss_name){
        if (iss_name==null || iss_name==""){
            List<Issue_position>list1=issue_positionDao.queryiss();
            return list1;
        }else{
            List<Issue_position>list2=issue_positionDao.queryissmh(iss_name);
            return list2;
        }
    }

    @RequestMapping("add")
    @ResponseBody
    public String addiss(@RequestBody Issue_position issue_position){
        Integer i=issue_positionDao.insertSelective(issue_position);
        return "ok";
    }

    @RequestMapping("update")
    @ResponseBody
    public String updiss(@RequestBody Issue_position issue_position){
        Integer i=issue_positionDao.updateiss(issue_position);
        return "ok";
    }

    @RequestMapping("delete")
    @ResponseBody
    public String deliss(Integer iss_id){
        Integer i=issue_positionDao.deleteiss(iss_id);
        return "ok";
    }

    @RequestMapping("queryent")
    @ResponseBody
    public List<Entreprenenur>showent(){
        return entrepreneurDao.queryent();
    }
}
