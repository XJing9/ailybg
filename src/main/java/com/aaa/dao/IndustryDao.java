package com.aaa.dao;

import com.aaa.entity.Industry;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface IndustryDao extends tk.mybatis.mapper.common.Mapper<Industry> {

    @Select("select i.*,ind.indu_name from industry i join industrys ind on i.indu_id=ind.indu_id")
    List<Industry> querys();

    @Update("update industry set ind_name=#{ind_name},indu_id=#{indu_id} where ind_id=#{ind_id}")
    Integer updates(Industry industry);

    @Update("update industry set ind_state=#{ind_state} where ind_id=#{ind_id}")
    Integer updateState(Industry industry);

    @Delete("delete from industry where ind_id=#{ind_id}")
    Integer deletes(Integer ind_id);

    @Insert("insert into industry(ind_name,indu_id)values(#{ind_name},#{indu_id})")
    Integer inserts(Industry industry);
}
