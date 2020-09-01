package com.aaa.dao;

import com.aaa.entity.Cause;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CauseDao extends tk.mybatis.mapper.common.Mapper<Cause>{

    @Select("select * from cause")
    List<Cause> query();

    @Insert("insert into cause (cau_name,cau_type) values (#{cau_name},#{cau_type})")
    Integer add(Cause cause);

    @Update("update cause set cau_name=#{cau_name},cau_type=#{cau_type} where cau_id=#{cau_id}")
    Integer Update(Cause cause);

    @Delete("delete from cause where cau_id=#{cau_id}")
    Integer delete(Integer cau_id);
}
