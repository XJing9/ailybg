package com.aaa.controller;

import com.aaa.dao.WelfareDao;
import com.aaa.entity.Welfare;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("Welfare")
public class WelfareCon {
    @Resource
    WelfareDao welfareDao;

    @RequestMapping("query")
    @ResponseBody
    public List<Welfare>queryWelfare(){
        //System.out.println(welfareDao.selectAll());
        return welfareDao.selectAll();
    }

    @RequestMapping("add")
    @ResponseBody
    public String addWelfare(@RequestBody Welfare welfare){
        //System.out.println(welfare);
        Integer i=welfareDao.insertSelective(welfare);
        //System.out.println(i);
        return "ok";
    }

    @RequestMapping("update")
    @ResponseBody
    public String updateWelfare(@RequestBody Welfare welfare){
        //System.out.println(welfare);
        Integer i=welfareDao.updatewel(welfare);
        //System.out.println(i);
        return "ok";
    }

    @RequestMapping("delete")
    @ResponseBody
    public String deleteWelfare(Integer wel_id){
        //System.out.println(wel_id);
        Integer i=welfareDao.deletewel(wel_id);
        //System.out.println(i);
        return "ok";
    }

    @RequestMapping("mhquery")
    @ResponseBody
    public List<Welfare>mhquery(String wel_name){
        if (wel_name==null || wel_name==""){
            List<Welfare>list1=welfareDao.selectAll();
            return list1;
        }else{
            List<Welfare>list2=welfareDao.mhquerywel(wel_name);
            return list2;
        }
    }

}
