package com.aaa.controller;

import com.aaa.dao.AreaDao;
import com.aaa.dao.LandmarkDao;
import com.aaa.entity.Area;
import com.aaa.entity.Landmark;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Configuration
@CrossOrigin
@RestController
@RequestMapping("areaCon")
public class AreaCon {
    @Resource
    AreaDao areaDao;
    @RequestMapping("queryAre")
    public List<Map<String,Object>> select(){
        List<Map<String, Object>> areList=areaDao.queryOne();
        for (Map<String,Object> a:areList){
            List<Map<String,Object>> twoList= areaDao.queryTwo(a.get("are_id"));
            a.put("twoList",twoList);
        }
        return areList;
    }
    @RequestMapping("add")
    public Integer add(Area area){
        return areaDao.insertSelective(area);
    }

    @RequestMapping("delete")
    public Integer delete(Integer are_id){
        return areaDao.deleteByPrimaryKey(are_id);
    }
    @RequestMapping("update")
    public Integer update(Area area){
        return areaDao.updateByPrimaryKeySelective(area);
    }
}
