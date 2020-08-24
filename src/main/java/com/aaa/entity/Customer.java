package com.aaa.entity;

import java.util.Date;
//用户表
public class Customer {
    private Integer cus_id;
    private String cus_name;
    private String cus_pwd;
    private String cus_truename;
    private String cus_sex;
    private String cus_birthday;
    private String cus_address;
    private String cus_phone;
    private Date cus_registertime;
    private Date cus_logintime;
    private String cus_email;
    private String cus_idcard;
    private Integer cus_height;
    private Integer cus_marital;
    private String cus_koseki;
    private String cus_nativeplace;
    private String cus_introduce;
    private Integer cus_state;

    public Customer() {
    }

    public Customer(Integer cus_id, String cus_name, String cus_pwd, String cus_truename, String cus_sex, String cus_birthday, String cus_address, String cus_phone, Date cus_registertime, Date cus_logintime, String cus_email, String cus_idcard, Integer cus_height, Integer cus_marital, String cus_koseki, String cus_nativeplace, String cus_introduce, Integer cus_state) {
        this.cus_id = cus_id;
        this.cus_name = cus_name;
        this.cus_pwd = cus_pwd;
        this.cus_truename = cus_truename;
        this.cus_sex = cus_sex;
        this.cus_birthday = cus_birthday;
        this.cus_address = cus_address;
        this.cus_phone = cus_phone;
        this.cus_registertime = cus_registertime;
        this.cus_logintime = cus_logintime;
        this.cus_email = cus_email;
        this.cus_idcard = cus_idcard;
        this.cus_height = cus_height;
        this.cus_marital = cus_marital;
        this.cus_koseki = cus_koseki;
        this.cus_nativeplace = cus_nativeplace;
        this.cus_introduce = cus_introduce;
        this.cus_state = cus_state;
    }

    public Integer getCus_id() {
        return cus_id;
    }

    public void setCus_id(Integer cus_id) {
        this.cus_id = cus_id;
    }

    public String getCus_name() {
        return cus_name;
    }

    public void setCus_name(String cus_name) {
        this.cus_name = cus_name;
    }

    public String getCus_pwd() {
        return cus_pwd;
    }

    public void setCus_pwd(String cus_pwd) {
        this.cus_pwd = cus_pwd;
    }

    public String getCus_truename() {
        return cus_truename;
    }

    public void setCus_truename(String cus_truename) {
        this.cus_truename = cus_truename;
    }

    public String getCus_sex() {
        return cus_sex;
    }

    public void setCus_sex(String cus_sex) {
        this.cus_sex = cus_sex;
    }

    public String getCus_birthday() {
        return cus_birthday;
    }

    public void setCus_birthday(String cus_birthday) {
        this.cus_birthday = cus_birthday;
    }

    public String getCus_address() {
        return cus_address;
    }

    public void setCus_address(String cus_address) {
        this.cus_address = cus_address;
    }

    public String getCus_phone() {
        return cus_phone;
    }

    public void setCus_phone(String cus_phone) {
        this.cus_phone = cus_phone;
    }

    public Date getCus_registertime() {
        return cus_registertime;
    }

    public void setCus_registertime(Date cus_registertime) {
        this.cus_registertime = cus_registertime;
    }

    public Date getCus_logintime() {
        return cus_logintime;
    }

    public void setCus_logintime(Date cus_logintime) {
        this.cus_logintime = cus_logintime;
    }

    public String getCus_email() {
        return cus_email;
    }

    public void setCus_email(String cus_email) {
        this.cus_email = cus_email;
    }

    public String getCus_idcard() {
        return cus_idcard;
    }

    public void setCus_idcard(String cus_idcard) {
        this.cus_idcard = cus_idcard;
    }

    public Integer getCus_height() {
        return cus_height;
    }

    public void setCus_height(Integer cus_height) {
        this.cus_height = cus_height;
    }

    public Integer getCus_marital() {
        return cus_marital;
    }

    public void setCus_marital(Integer cus_marital) {
        this.cus_marital = cus_marital;
    }

    public String getCus_koseki() {
        return cus_koseki;
    }

    public void setCus_koseki(String cus_koseki) {
        this.cus_koseki = cus_koseki;
    }

    public String getCus_nativeplace() {
        return cus_nativeplace;
    }

    public void setCus_nativeplace(String cus_nativeplace) {
        this.cus_nativeplace = cus_nativeplace;
    }

    public String getCus_introduce() {
        return cus_introduce;
    }

    public void setCus_introduce(String cus_introduce) {
        this.cus_introduce = cus_introduce;
    }

    public Integer getCus_state() {
        return cus_state;
    }

    public void setCus_state(Integer cus_state) {
        this.cus_state = cus_state;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cus_id=" + cus_id +
                ", cus_name='" + cus_name + '\'' +
                ", cus_pwd='" + cus_pwd + '\'' +
                ", cus_truename='" + cus_truename + '\'' +
                ", cus_sex='" + cus_sex + '\'' +
                ", cus_birthday='" + cus_birthday + '\'' +
                ", cus_address='" + cus_address + '\'' +
                ", cus_phone='" + cus_phone + '\'' +
                ", cus_registertime=" + cus_registertime +
                ", cus_logintime=" + cus_logintime +
                ", cus_email='" + cus_email + '\'' +
                ", cus_idcard='" + cus_idcard + '\'' +
                ", cus_height=" + cus_height +
                ", cus_marital=" + cus_marital +
                ", cus_koseki='" + cus_koseki + '\'' +
                ", cus_nativeplace='" + cus_nativeplace + '\'' +
                ", cus_introduce='" + cus_introduce + '\'' +
                ", cus_state=" + cus_state +
                '}';
    }
}
