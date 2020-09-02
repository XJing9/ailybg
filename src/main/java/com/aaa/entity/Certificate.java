package com.aaa.entity;
//证书表
public class Certificate {
    private Integer cer_id;
    private String cer_name;
    private String cer_time;
    private Integer res_id;
    private String res_education;

    public Certificate() {
    }

    public Certificate(Integer cer_id, String cer_name, String cer_time, Integer res_id) {
        this.cer_id = cer_id;
        this.cer_name = cer_name;
        this.cer_time = cer_time;
        this.res_id = res_id;
    }

    public Integer getCer_id() {
        return cer_id;
    }

    public void setCer_id(Integer cer_id) {
        this.cer_id = cer_id;
    }

    public String getCer_name() {
        return cer_name;
    }

    public void setCer_name(String cer_name) {
        this.cer_name = cer_name;
    }

    public String getCer_time() {
        return cer_time;
    }

    public void setCer_time(String cer_time) {
        this.cer_time = cer_time;
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
        return "Certificate{" +
                "cer_id=" + cer_id +
                ", cer_name='" + cer_name + '\'' +
                ", cer_time='" + cer_time + '\'' +
                ", res_id=" + res_id +
                ", res_education='" + res_education + '\'' +
                '}';
    }
}
