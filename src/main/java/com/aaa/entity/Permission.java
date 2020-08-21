package com.aaa.entity;

public class Permission {
    private Integer per_id;
    private String per_name;
    private Integer per_url;
    private Integer per_parent;

    @Override
    public String toString() {
        return "Permission{" +
                "per_id=" + per_id +
                ", per_name='" + per_name + '\'' +
                ", per_url=" + per_url +
                ", per_parent=" + per_parent +
                '}';
    }

    public Integer getPer_id() {
        return per_id;
    }

    public void setPer_id(Integer per_id) {
        this.per_id = per_id;
    }

    public String getPer_name() {
        return per_name;
    }

    public void setPer_name(String per_name) {
        this.per_name = per_name;
    }

    public Integer getPer_url() {
        return per_url;
    }

    public void setPer_url(Integer per_url) {
        this.per_url = per_url;
    }

    public Integer getPer_parent() {
        return per_parent;
    }

    public void setPer_parent(Integer per_parent) {
        this.per_parent = per_parent;
    }
}
