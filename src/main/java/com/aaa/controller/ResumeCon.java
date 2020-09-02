package com.aaa.controller;

import com.aaa.dao.ResumeDao;
import com.aaa.entity.Resume;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("Resume")
public class ResumeCon {
    @Resource
    private ResumeDao resumeDao;

    @RequestMapping("queryName")
    @ResponseBody
    public List<Resume>queryName(String res_education){
        if (res_education==null || res_education==""){
            List<Resume>list1=resumeDao.query();
            System.out.println(list1);
            return list1;
        }else{
            List<Resume>list2=resumeDao.queryres(res_education);
            return list2;
        }
    }

    @RequestMapping("updatezt")
    @ResponseBody
    public Integer updzt(@RequestBody Resume resume){
        System.out.println(resume);
        Integer i=resumeDao.updatezt(resume);
        System.out.println(i);
        return i;
    }
}
