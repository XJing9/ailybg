package com.aaa.entity;
//工作经历表
public class Work_experience {
    private Integer wor_id;
    private String wor_companyname;
    private String wor_workname;
    private String wor_action;
    private String wor_dimission;
    private String wor_workduty;
    private Integer res_id;
    private String res_education;

    public Work_experience() {
    }

    public Work_experience(Integer wor_id, String wor_companyname, String wor_workname, String wor_action, String wor_dimission, String wor_workduty, Integer res_id) {
        this.wor_id = wor_id;
        this.wor_companyname = wor_companyname;
        this.wor_workname = wor_workname;
        this.wor_action = wor_action;
        this.wor_dimission = wor_dimission;
        this.wor_workduty = wor_workduty;
        this.res_id = res_id;
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

    public String getWor_workname() {
        return wor_workname;
    }

    public void setWor_workname(String wor_workname) {
        this.wor_workname = wor_workname;
    }

    public String getWor_action() {
        return wor_action;
    }

    public void setWor_action(String wor_action) {
        this.wor_action = wor_action;
    }

    public String getWor_dimission() {
        return wor_dimission;
    }

    public void setWor_dimission(String wor_dimission) {
        this.wor_dimission = wor_dimission;
    }

    public String getWor_workduty() {
        return wor_workduty;
    }

    public void setWor_workduty(String wor_workduty) {
        this.wor_workduty = wor_workduty;
    }

    public Integer getRes_id() {
        return res_id;
    }

    public void setRes_id(Integer res_id) {
        this.res_id = res_id;
    }

    public String getRes_education() {
        return res_education;
    }

    public void setRes_education(String res_education) {
        this.res_education = res_education;
    }

    @Override
    public String toString() {
        return "Work_experience{" +
                "wor_id=" + wor_id +
                ", wor_companyname='" + wor_companyname + '\'' +
                ", wor_workname='" + wor_workname + '\'' +
                ", wor_action='" + wor_action + '\'' +
                ", wor_dimission='" + wor_dimission + '\'' +
                ", wor_workduty='" + wor_workduty + '\'' +
                ", res_id=" + res_id +
                ", res_education='" + res_education + '\'' +
                '}';
    }
}
