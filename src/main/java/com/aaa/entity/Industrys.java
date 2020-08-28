package com.aaa.entity;

import javax.persistence.Id;
import java.util.List;

public class Industrys {
    @Id
    private Integer indu_id;
    private String indu_name;

    public Integer getIndu_id() {
        return indu_id;
    }

    public void setIndu_id(Integer indu_id) {
        this.indu_id = indu_id;
    }

    public String getIndu_name() {
        return indu_name;
    }

    public void setIndu_name(String indu_name) {
        this.indu_name = indu_name;
    }
}
