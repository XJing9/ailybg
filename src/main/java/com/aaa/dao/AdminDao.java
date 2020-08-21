package com.aaa.dao;

import com.aaa.entity.Admins;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminDao extends tk.mybatis.mapper.common.Mapper<Admins> {
}
