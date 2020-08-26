package com.aaa.controller;

import com.aaa.dao.IndustryDao;
import com.aaa.dao.PositionDao;
import com.aaa.entity.Position;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("PosCon")
public class PositionCon {
    @Resource
    PositionDao positionDao;

    @RequestMapping("pos_query")
    public List<Map<String,Object>> pos_query(){
       return positionDao.pos_query();
    }
    @RequestMapping("pos_add")
    public Integer pos_add(Position position){
        return positionDao.pos_add(position);
    }

    @RequestMapping("pos_update")
    public Integer pos_update(Position position){
        return positionDao.pos_update(position);
    }

    @RequestMapping("pos_delete")
    public Integer pos_delete(Position position){
        return positionDao.pos_delete(position);
    }
}
