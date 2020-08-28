package com.aaa.entity;

import javax.persistence.Id;

public class Landmark {
    @Id
    private Integer land_id;
    private String are_name;
    private Integer are_id;

    public Integer getLand_id() {
        return land_id;
    }

    public void setLand_id(Integer land_id) {
        this.land_id = land_id;
    }

    public String getAre_name() {
        return are_name;
    }

    public void setAre_name(String are_name) {
        this.are_name = are_name;
    }

    public Integer getAre_id() {
        return are_id;
    }

    public void setAre_id(Integer are_id) {
        this.are_id = are_id;
    }

    @Override
    public String toString() {
        return "Landmark{" +
                "land_id=" + land_id +
                ", are_name='" + are_name + '\'' +
                ", are_id=" + are_id +
                '}';
    }
}
