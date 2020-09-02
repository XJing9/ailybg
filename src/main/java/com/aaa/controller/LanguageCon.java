package com.aaa.controller;

import com.aaa.dao.LanguageDao;
import com.aaa.entity.Language;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("Language")
public class LanguageCon {
   @Resource
   private LanguageDao languageDao;

   @RequestMapping("query")
   @ResponseBody
   public List<Language>qurlan(Integer res_id){
       List<Language>list=languageDao.querylan(res_id);
       return list;
   }
}
