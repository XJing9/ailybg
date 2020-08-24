package com.aaa.entity;

import javax.persistence.Id;

public class Role {
    @Id
    private Integer rol_id;
    private String rol_name;/*
    private Integer rol_state;

    public Integer getRol_state() {
        return rol_state;
    }

    public void setRol_state(Integer rol_state) {
        this.rol_state = rol_state;
    }*/

    @Override
    public String toString() {
        return "Role{" +
                "rol_id=" + rol_id +
                ", rol_name='" + rol_name + '\'' +
                '}';
    }

    public Integer getRol_id() {
        return rol_id;
    }

    public void setRol_id(Integer rol_id) {
        this.rol_id = rol_id;
    }

    public String getRol_name() {
        return rol_name;
    }

    public void setRol_name(String rol_name) {
        this.rol_name = rol_name;
    }
}
