package com.aaa.entity;

public class Project_experience {
    private Integer pro_id;
    private String pro_name;
    private String pro_role;
    private String pro_action;
    private String pro_finish;
    private String pro_describe;
    private Integer wor_id;
    private String wor_companyname;

    public Project_experience() {
    }

    public Project_experience(Integer pro_id, String pro_name, String pro_role, String pro_action, String pro_finish, String pro_describe, Integer wor_id) {
        this.pro_id = pro_id;
        this.pro_name = pro_name;
        this.pro_role = pro_role;
        this.pro_action = pro_action;
        this.pro_finish = pro_finish;
        this.pro_describe = pro_describe;
        this.wor_id = wor_id;
    }

    public Integer getPro_id() {
        return pro_id;
    }

    public void setPro_id(Integer pro_id) {
        this.pro_id = pro_id;
    }

    public String getPro_name() {
        return pro_name;
    }

    public void setPro_name(String pro_name) {
        this.pro_name = pro_name;
    }

    public String getPro_role() {
        return pro_role;
    }

    public void setPro_role(String pro_role) {
        this.pro_role = pro_role;
    }

    public String getPro_action() {
        return pro_action;
    }

    public void setPro_action(String pro_action) {
        this.pro_action = pro_action;
    }

    public String getPro_finish() {
        return pro_finish;
    }

    public void setPro_finish(String pro_finish) {
        this.pro_finish = pro_finish;
    }

    public String getPro_describe() {
        return pro_describe;
    }

    public void setPro_describe(String pro_describe) {
        this.pro_describe = pro_describe;
    }

    public Integer getWor_id() {
        return wor_id;
    }

    public void setWor_id(Integer wor_id) {
        this.wor_id = wor_id;
    }

    public String getWor_companyname() {
        return wor_companyname;
    }

    public void setWor_companyname(String wor_companyname) {
        this.wor_companyname = wor_companyname;
    }

    @Override
    public String toString() {
        return "Project_experience{" +
                "pro_id=" + pro_id +
                ", pro_name='" + pro_name + '\'' +
                ", pro_role='" + pro_role + '\'' +
                ", pro_action='" + pro_action + '\'' +
                ", pro_finish='" + pro_finish + '\'' +
                ", pro_describe='" + pro_describe + '\'' +
                ", wor_id=" + wor_id +
                ", wor_companyname='" + wor_companyname + '\'' +
                '}';
    }
}
