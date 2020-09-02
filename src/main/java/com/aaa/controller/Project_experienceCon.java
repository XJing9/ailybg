package com.aaa.controller;

import com.aaa.dao.Project_experienceDao;
import com.aaa.entity.Project_experience;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("Project_experience")
public class Project_experienceCon {
    @Resource
    private Project_experienceDao project_experienceDao;

    @RequestMapping("query")
    @ResponseBody
    public List<Project_experience>quepro(Integer wor_id){
        System.out.println(wor_id);
        List<Project_experience>list=project_experienceDao.querypro(wor_id);
        System.out.println(list);
        return list;
    }
}
