package com.aaa.entity;

public class Per_rol {
    private Integer rol_id;
    private Integer per_id;

    @Override
    public String toString() {
        return "Per_rol{" +
                "rol_id=" + rol_id +
                ", per_id=" + per_id +
                '}';
    }

    public Integer getRol_id() {
        return rol_id;
    }

    public void setRol_id(Integer rol_id) {
        this.rol_id = rol_id;
    }

    public Integer getPer_id() {
        return per_id;
    }

    public void setPer_id(Integer per_id) {
        this.per_id = per_id;
    }
}
