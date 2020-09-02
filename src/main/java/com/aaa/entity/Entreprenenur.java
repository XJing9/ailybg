package com.aaa.entity;

public class Entreprenenur {
    private Integer ent_id;
    private String ent_name;
    private String ent_abbreviation;
    private String ent_nature;
    private String ent_scale;
    private Integer are_id;
    private Integer ind_id;
    private String ent_photo;
    private Integer ent_capital;
    private String ent_url;
    private String ent_intro;
    private String ent_introduce;
    private String ent_logintime;
    private String ent_license;
    private Integer ent_authentication;
    private Integer ent_state;
    private String are_name;
    private String ind_name;
    private String iss_name;
    private Integer iss_id;
    private String iss_education;
    private String iss_address;
    private Integer iss_state;

    public Entreprenenur() {
    }

    public Entreprenenur(Integer ent_id, String ent_name, String ent_abbreviation, String ent_nature, String ent_scale, Integer are_id, Integer ind_id, String ent_photo, Integer ent_capital, String ent_url, String ent_intro, String ent_introduce, String ent_logintime, String ent_license, Integer ent_authentication, Integer ent_state) {
        this.ent_id = ent_id;
        this.ent_name = ent_name;
        this.ent_abbreviation = ent_abbreviation;
        this.ent_nature = ent_nature;
        this.ent_scale = ent_scale;
        this.are_id = are_id;
        this.ind_id = ind_id;
        this.ent_photo = ent_photo;
        this.ent_capital = ent_capital;
        this.ent_url = ent_url;
        this.ent_intro = ent_intro;
        this.ent_introduce = ent_introduce;
        this.ent_logintime = ent_logintime;
        this.ent_license = ent_license;
        this.ent_authentication = ent_authentication;
        this.ent_state = ent_state;
    }

    public Integer getEnt_id() {
        return ent_id;
    }

    public void setEnt_id(Integer ent_id) {
        this.ent_id = ent_id;
    }

    public String getEnt_name() {
        return ent_name;
    }

    public void setEnt_name(String ent_name) {
        this.ent_name = ent_name;
    }

    public String getEnt_abbreviation() {
        return ent_abbreviation;
    }

    public void setEnt_abbreviation(String ent_abbreviation) {
        this.ent_abbreviation = ent_abbreviation;
    }

    public String getEnt_nature() {
        return ent_nature;
    }

    public void setEnt_nature(String ent_nature) {
        this.ent_nature = ent_nature;
    }

    public String getEnt_scale() {
        return ent_scale;
    }

    public void setEnt_scale(String ent_scale) {
        this.ent_scale = ent_scale;
    }

    public Integer getAre_id() {
        return are_id;
    }

    public void setAre_id(Integer are_id) {
        this.are_id = are_id;
    }

    public Integer getInd_id() {
        return ind_id;
    }

    public void setInd_id(Integer ind_id) {
        this.ind_id = ind_id;
    }

    public String getEnt_photo() {
        return ent_photo;
    }

    public void setEnt_photo(String ent_photo) {
        this.ent_photo = ent_photo;
    }

    public Integer getEnt_capital() {
        return ent_capital;
    }

    public void setEnt_capital(Integer ent_capital) {
        this.ent_capital = ent_capital;
    }

    public String getEnt_url() {
        return ent_url;
    }

    public void setEnt_url(String ent_url) {
        this.ent_url = ent_url;
    }

    public String getEnt_intro() {
        return ent_intro;
    }

    public void setEnt_intro(String ent_intro) {
        this.ent_intro = ent_intro;
    }

    public String getEnt_introduce() {
        return ent_introduce;
    }

    public void setEnt_introduce(String ent_introduce) {
        this.ent_introduce = ent_introduce;
    }

    public String getEnt_logintime() {
        return ent_logintime;
    }

    public void setEnt_logintime(String ent_logintime) {
        this.ent_logintime = ent_logintime;
    }

    public String getEnt_license() {
        return ent_license;
    }

    public void setEnt_license(String ent_license) {
        this.ent_license = ent_license;
    }

    public Integer getEnt_authentication() {
        return ent_authentication;
    }

    public void setEnt_authentication(Integer ent_authentication) {
        this.ent_authentication = ent_authentication;
    }

    public Integer getEnt_state() {
        return ent_state;
    }

    public void setEnt_state(Integer ent_state) {
        this.ent_state = ent_state;
    }

    public String getAre_name() {
        return are_name;
    }

    public void setAre_name(String are_name) {
        this.are_name = are_name;
    }

    public String getInd_name() {
        return ind_name;
    }

    public void setInd_name(String ind_name) {
        this.ind_name = ind_name;
    }

    public String getIss_name() {
        return iss_name;
    }

    public void setIss_name(String iss_name) {
        this.iss_name = iss_name;
    }

    public Integer getIss_id() {
        return iss_id;
    }

    public void setIss_id(Integer iss_id) {
        this.iss_id = iss_id;
    }

    public String getIss_education() {
        return iss_education;
    }

    public void setIss_education(String iss_education) {
        this.iss_education = iss_education;
    }

    public String getIss_address() {
        return iss_address;
    }

    public void setIss_address(String iss_address) {
        this.iss_address = iss_address;
    }

    public Integer getIss_state() {
        return iss_state;
    }

    public void setIss_state(Integer iss_state) {
        this.iss_state = iss_state;
    }

    @Override
    public String toString() {
        return "Entreprenenur{" +
                "ent_id=" + ent_id +
                ", ent_name='" + ent_name + '\'' +
                ", ent_abbreviation='" + ent_abbreviation + '\'' +
                ", ent_nature='" + ent_nature + '\'' +
                ", ent_scale='" + ent_scale + '\'' +
                ", are_id=" + are_id +
                ", ind_id=" + ind_id +
                ", ent_photo='" + ent_photo + '\'' +
                ", ent_capital=" + ent_capital +
                ", ent_url='" + ent_url + '\'' +
                ", ent_intro='" + ent_intro + '\'' +
                ", ent_introduce='" + ent_introduce + '\'' +
                ", ent_logintime='" + ent_logintime + '\'' +
                ", ent_license='" + ent_license + '\'' +
                ", ent_authentication=" + ent_authentication +
                ", ent_state=" + ent_state +
                ", are_name='" + are_name + '\'' +
                ", ind_name='" + ind_name + '\'' +
                ", iss_name='" + iss_name + '\'' +
                ", iss_id=" + iss_id +
                ", iss_education='" + iss_education + '\'' +
                ", iss_address='" + iss_address + '\'' +
                ", iss_state=" + iss_state +
                '}';
    }
}
