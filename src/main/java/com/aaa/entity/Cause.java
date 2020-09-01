package com.aaa.entity;

import org.apache.ibatis.annotations.Insert;

public class Cause {
    private Integer cau_id;
    private String cau_name;
    private Integer cau_type;

    public Integer getCau_id() {
        return cau_id;
    }

    public void setCau_id(Integer cau_id) {
        this.cau_id = cau_id;
    }

    public String getCau_name() {
        return cau_name;
    }

    public void setCau_name(String cau_name) {
        this.cau_name = cau_name;
    }

    public Integer getCau_type() {
        return cau_type;
    }

    public void setCau_type(Integer cau_type) {
        this.cau_type = cau_type;
    }

    @Override
    public String toString() {
        return "Cause{" +
                "cau_id=" + cau_id +
                ", cau_name='" + cau_name + '\'' +
                ", cau_type=" + cau_type +
                '}';
    }
}
