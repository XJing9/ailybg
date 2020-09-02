package com.aaa.controller;

import com.aaa.dao.Edu_experienceDao;
import com.aaa.entity.Edu_experience;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("Edu_experience")
public class Edu_experienceCon {
    @Resource
    private Edu_experienceDao edu_experienceDao;

    @RequestMapping("query")
    @ResponseBody
    public List<Edu_experience>query(Integer res_id){
        List<Edu_experience>list=edu_experienceDao.queryedu(res_id);
        System.out.println(res_id);
        System.out.println(list);
        return list;
    }
}
