package com.aaa.controller;

import com.aaa.dao.EntrepreneurDao;
import com.aaa.dao.InterviewDao;
import com.aaa.entity.Entreprenenur;
import com.aaa.entity.Interview;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("Interview")
public class InterviewCon {
    @Resource
    private InterviewDao interviewDao;
    @Resource
    private EntrepreneurDao entrepreneurDao;

    @RequestMapping("query")
    @ResponseBody
    public List<Interview>queryint(String int_name){
        if (int_name==null || int_name==""){
            List<Interview>list1=interviewDao.listint();
            return list1;
        }else{
            List<Interview>list2=interviewDao.mhlistint(int_name);
            return list2;
        }
    }

    @RequestMapping("queryent")
    @ResponseBody
    public List<Entreprenenur>queryent(){
        return entrepreneurDao.queryent();
    }

    @RequestMapping("add")
    @ResponseBody
    public String addent(@RequestBody Interview interview){
        Integer i=interviewDao.insertSelective(interview);
        return "ok";
    }

    @RequestMapping("update")
    @ResponseBody
    public String updateent(@RequestBody Interview interview){
        Integer i=interviewDao.updateint(interview);
        return "ok";
    }

    @RequestMapping("delete")
    @ResponseBody
    public String deleteent(Integer int_id){
        Integer i=interviewDao.deleteint(int_id);
        return "ok";
    }
}
