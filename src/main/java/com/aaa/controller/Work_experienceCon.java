package com.aaa.controller;

import com.aaa.dao.Work_experienceDao;
import com.aaa.entity.Work_experience;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("Work_experience")
public class Work_experienceCon {
    @Resource
    private Work_experienceDao work_experienceDao;

    @RequestMapping("query")
    @ResponseBody
    public List<Work_experience>quework(Integer res_id){
        List<Work_experience>list=work_experienceDao.querywork(res_id);
        System.out.println(list);
        return list;
    }
}
