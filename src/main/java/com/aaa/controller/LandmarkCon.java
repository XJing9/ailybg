package com.aaa.controller;

import com.aaa.dao.LandmarkDao;
import com.aaa.entity.Landmark;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("Land")
public class LandmarkCon {
    @Resource
    LandmarkDao landmarkDao;

    @RequestMapping("select")
    public List<Landmark> selectAll(){
        return landmarkDao.selectAll();
    }

    @RequestMapping("add")
    public Integer add(Landmark landmark){
        return landmarkDao.insertSelective(landmark);
    }

    @RequestMapping("update")
    public Integer update(Landmark landmark){
        return landmarkDao.updateByPrimaryKeySelective(landmark);
    }

    @RequestMapping("delete")
    public Integer delete(Integer land_id){
        return landmarkDao.deleteByPrimaryKey(land_id);
    }
}
