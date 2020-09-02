package com.aaa.dao;

import com.aaa.entity.Certificate;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CertificateDao extends tk.mybatis.mapper.common.Mapper<Certificate> {
    @Select("select * from certificate c1 left join resume r1 on c1.res_id=r1.res_id where c1.res_id=#{res_id}")
    List<Certificate>querycer(Integer res_id);
}
