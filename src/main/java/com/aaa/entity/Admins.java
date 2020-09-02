package com.aaa.entity;

import javax.persistence.Id;

public class Admins {
    @Id
    private Integer adm_id;
    private String adm_name;
    private String adm_pwd;
    private Integer rol_id;
    private Integer adm_state;
    private String adm_phone;

    public String getAdm_phone() {
        return adm_phone;
    }

    public void setAdm_phone(String adm_phone) {
        this.adm_phone = adm_phone;
    }

    public Integer getAdm_id() {
        return adm_id;
    }

    public void setAdm_id(Integer adm_id) {
        this.adm_id = adm_id;
    }

    public String getAdm_name() {
        return adm_name;
    }

    public void setAdm_name(String adm_name) {
        this.adm_name = adm_name;
    }

    public String getAdm_pwd() {
        return adm_pwd;
    }

    public void setAdm_pwd(String adm_pwd) {
        this.adm_pwd = adm_pwd;
    }

    public Integer getRol_id() {
        return rol_id;
    }

    public void setRol_id(Integer rol_id) {
        this.rol_id = rol_id;
    }

    public Integer getAdm_state() {
        return adm_state;
    }

    public void setAdm_state(Integer adm_state) {
        this.adm_state = adm_state;
    }

    public Admins() {
    }

    @Override
    public String toString() {
        return "Admins{" +
                "adm_id=" + adm_id +
                ", adm_name='" + adm_name + '\'' +
                ", adm_pwd='" + adm_pwd + '\'' +
                ", rol_id=" + rol_id +
                ", adm_state=" + adm_state +
                '}';
    }
}
