package com.aaa.controller;

import com.aaa.dao.*;
import com.aaa.entity.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RequestMapping("Complaint")
@RestController
public class ComplaintCon {
    @Resource
    private ComplaintDao complaintDao;
    @Resource
    private AdminDao adminDao;
    @Resource
    private CustomerDao customerDao;
    @Resource
    private Issue_positionDao issue_positionDao;
    @Resource
    private CauseDao causeDao;

    @RequestMapping("show")
    @ResponseBody
    public List< Complaint> show(String com_phone,Integer cau_id){
        System.out.println(cau_id);
        if ((com_phone==null || com_phone=="") && cau_id==null){
            List<Complaint>list1=complaintDao.showlist();
            System.out.println(list1);
            return list1;
        }else{
            List<Complaint> list2=complaintDao.showmh2(com_phone,cau_id);
            System.out.println(list2);
            return list2;
        }
    }

    @RequestMapping("add")
    @ResponseBody
    public String add(@RequestBody Complaint complaint){
        Integer i=complaintDao.insertSelective(complaint);
        return "ok";
    }

    @RequestMapping("cus")
    @ResponseBody
    public List<Customer>cusquery(){
        //System.out.println(customerDao.selectAll());
        return customerDao.selectAll();
    }

    @RequestMapping("adm")
    @ResponseBody
    public List<Admins>admquery(){
        //System.out.println(adminDao.selectAll());
        return adminDao.selectAll();
    }

    @RequestMapping("iss")
    @ResponseBody
    public List<Issue_position>issquery(){
        //System.out.println(issue_positionDao.selectAll());
        return issue_positionDao.selectAll();
    }

    @RequestMapping("cau")
    @ResponseBody
    public List<Cause>cauquery(){
        //System.out.println(causeDao.selectAll());
        return causeDao.selectAll();
    }

    @RequestMapping("delete")
    @ResponseBody
    public String delete(Integer com_id){
        Integer i=complaintDao.deletecom(com_id);
        return "ok";
    }

    @RequestMapping("update")
    @ResponseBody
    public String update(@RequestBody Complaint complaint){
        //System.out.println(complaint);
        Integer i=complaintDao.updatecom(complaint);
        //System.out.println(i);
        return "ok";
    }
}
