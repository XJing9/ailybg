package com.aaa.entity;
//面试地址表
public class Interview {
    private Integer int_id;
    private String int_name;
    private String int_email;
    private String int_qq;
    private String int_reladdress;
    private Integer ent_id;
    private Integer int_state;
    private String ent_name;

    public Interview() {
    }

    public Interview(Integer int_id, String int_name,String int_email, String int_qq, String int_reladdress, Integer ent_id, Integer int_state) {
        this.int_id = int_id;
        this.int_name = int_name;
        this.int_email = int_email;
        this.int_qq = int_qq;
        this.int_reladdress = int_reladdress;
        this.ent_id = ent_id;
        this.int_state = int_state;
    }

    public Integer getInt_id() {
        return int_id;
    }

    public void setInt_id(Integer int_id) {
        this.int_id = int_id;
    }

    public String getInt_name() {
        return int_name;
    }

    public void setInt_name(String int_name) {
        this.int_name = int_name;
    }

    public String getInt_email() {
        return int_email;
    }

    public void setInt_email(String int_email) {
        this.int_email = int_email;
    }

    public String getInt_qq() {
        return int_qq;
    }

    public void setInt_qq(String int_qq) {
        this.int_qq = int_qq;
    }

    public String getInt_reladdress() {
        return int_reladdress;
    }

    public void setInt_reladdress(String int_reladdress) {
        this.int_reladdress = int_reladdress;
    }

    public Integer getEnt_id() {
        return ent_id;
    }

    public void setEnt_id(Integer ent_id) {
        this.ent_id = ent_id;
    }

    public Integer getInt_state() {
        return int_state;
    }

    public void setInt_state(Integer int_state) {
        this.int_state = int_state;
    }

    public String getEnt_name() {
        return ent_name;
    }

    public void setEnt_name(String ent_name) {
        this.ent_name = ent_name;
    }

    @Override
    public String toString() {
        return "Interview{" +
                "int_id=" + int_id +
                ", int_name='" + int_name + '\'' +
                ", int_email='" + int_email + '\'' +
                ", int_qq='" + int_qq + '\'' +
                ", int_reladdress='" + int_reladdress + '\'' +
                ", ent_id=" + ent_id +
                ", int_state=" + int_state +
                ", ent_name='" + ent_name + '\'' +
                '}';
    }
}
