package com.aaa.dao;

import com.aaa.entity.Language;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface LanguageDao extends tk.mybatis.mapper.common.Mapper<Language> {
    @Select("select * from Language l1 left join resume r1 on l1.res_id=r1.res_id where l1.res_id=#{res_id}")
    List<Language>querylan(Integer res_id);
}
