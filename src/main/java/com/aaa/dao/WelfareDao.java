package com.aaa.dao;

import com.aaa.entity.Welfare;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface WelfareDao extends tk.mybatis.mapper.common.Mapper<Welfare> {
    @Update("update Welfare set wel_name=#{wel_name},wel_state=#{wel_state} where wel_id=#{wel_id}")
    Integer updatewel(Welfare welfare);
    @Delete("delete from Welfare where wel_id=#{wel_id}")
    Integer deletewel(Integer wel_id);
    @Select("select wel_id,wel_name,wel_state from Welfare where wel_name like CONCAT('%',#{wel_name},'%')")
    List<Welfare>mhquerywel(@Param("wel_name") String wel_name);
}
