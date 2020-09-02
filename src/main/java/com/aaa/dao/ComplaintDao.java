package com.aaa.dao;

import com.aaa.entity.Complaint;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ComplaintDao extends tk.mybatis.mapper.common.Mapper<Complaint> {

    @Select("select * from Complaint ct left join customer cr on ct.cus_id=cr.cus_id\n" +
            "left join Admins ads on ct.adm_id=ads.adm_id\n" +
            "left join Issue_position ion on ct.iss_id=ion.iss_id\n" +
            "left join Cause cau on ct.cau_id=cau.cau_id " +
            "where ct.com_phone like CONCAT('%',#{com_phone},'%')")
    List<Complaint>showmh(@Param("com_phone") String com_phone);

    @Select("select * from Complaint ct left join customer cr on ct.cus_id=cr.cus_id\n" +
            "left join Admins ads on ct.adm_id=ads.adm_id\n" +
            "left join Issue_position ion on ct.iss_id=ion.iss_id\n" +
            "left join Cause cau on ct.cau_id=cau.cau_id ")
    List<Complaint>showlist();


    @Select("select * from Complaint ct left join customer cr on ct.cus_id=cr.cus_id\n" +
            "left join Admins ads on ct.adm_id=ads.adm_id\n" +
            "left join Issue_position ion on ct.iss_id=ion.iss_id\n" +
            "left join Cause cau on ct.cau_id=cau.cau_id " +
            "where ct.com_phone like CONCAT('%',#{com_phone},'%') and ct.cau_id=#{cau_id}")
    List<Complaint>showmh2(@Param("com_phone") String com_phone,@Param("cau_id") Integer cau_id);



    @Delete("delete from Complaint where com_id=#{com_id}")
    Integer deletecom(Integer com_id);
    @Update("update Complaint set cus_id=#{cus_id},adm_id=#{adm_id},iss_id=#{iss_id},cau_id=#{cau_id},com_phone=#{com_phone}," +
            "com_auditstate=#{com_auditstate},com_result=#{com_result},com_state=#{com_state},com_remark=#{com_remark} where com_id=#{com_id}")
    Integer updatecom(Complaint complaint);

    @Update("update Complaint set com_auditstate=#{com_auditstate} where com_id=#{com_id}")
    Integer updfhzt(Complaint complaint);

    @Update("update Complaint set com_state=#{com_state} where com_id=#{com_id}")
    Integer updclzt(Complaint complaint);
}
