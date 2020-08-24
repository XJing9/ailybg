package com.aaa.entity;

public class Complaint {
    private Integer com_id;
    private Integer cus_id;
    private Integer adm_id;
    private Integer iss_id;
    private Integer cau_id;
    private String com_phone;
    private Integer com_auditstate;
    private String com_result;
    private Integer com_state;
    private String com_remark;
    private String cus_name;
    private String adm_name;
    private String iss_name;
    private String cau_name;

    public Complaint() {
    }

    public Complaint(Integer com_id, Integer cus_id, Integer adm_id, Integer iss_id, Integer cau_id, String com_phone, Integer com_auditstate, String com_result, Integer com_state, String com_remark) {
        this.com_id = com_id;
        this.cus_id = cus_id;
        this.adm_id = adm_id;
        this.iss_id = iss_id;
        this.cau_id = cau_id;
        this.com_phone = com_phone;
        this.com_auditstate = com_auditstate;
        this.com_result = com_result;
        this.com_state = com_state;
        this.com_remark = com_remark;
    }

    public Integer getCom_id() {
        return com_id;
    }

    public void setCom_id(Integer com_id) {
        this.com_id = com_id;
    }

    public Integer getCus_id() {
        return cus_id;
    }

    public void setCus_id(Integer cus_id) {
        this.cus_id = cus_id;
    }

    public Integer getAdm_id() {
        return adm_id;
    }

    public void setAdm_id(Integer adm_id) {
        this.adm_id = adm_id;
    }

    public Integer getIss_id() {
        return iss_id;
    }

    public void setIss_id(Integer iss_id) {
        this.iss_id = iss_id;
    }

    public Integer getCau_id() {
        return cau_id;
    }

    public void setCau_id(Integer cau_id) {
        this.cau_id = cau_id;
    }

    public String getCom_phone() {
        return com_phone;
    }

    public void setCom_phone(String com_phone) {
        this.com_phone = com_phone;
    }

    public Integer getCom_auditstate() {
        return com_auditstate;
    }

    public void setCom_auditstate(Integer com_auditstate) {
        this.com_auditstate = com_auditstate;
    }

    public String getCom_result() {
        return com_result;
    }

    public void setCom_result(String com_result) {
        this.com_result = com_result;
    }

    public Integer getCom_state() {
        return com_state;
    }

    public void setCom_state(Integer com_state) {
        this.com_state = com_state;
    }

    public String getCom_remark() {
        return com_remark;
    }

    public void setCom_remark(String com_remark) {
        this.com_remark = com_remark;
    }

    public String getCus_name() {
        return cus_name;
    }

    public void setCus_name(String cus_name) {
        this.cus_name = cus_name;
    }

    public String getAdm_name() {
        return adm_name;
    }

    public void setAdm_name(String adm_name) {
        this.adm_name = adm_name;
    }

    public String getIss_name() {
        return iss_name;
    }

    public void setIss_name(String iss_name) {
        this.iss_name = iss_name;
    }

    public String getCau_name() {
        return cau_name;
    }

    public void setCau_name(String cau_name) {
        this.cau_name = cau_name;
    }

    @Override
    public String toString() {
        return "Complaint{" +
                "com_id=" + com_id +
                ", cus_id=" + cus_id +
                ", adm_id=" + adm_id +
                ", iss_id=" + iss_id +
                ", cau_id=" + cau_id +
                ", com_phone='" + com_phone + '\'' +
                ", com_auditstate=" + com_auditstate +
                ", com_result='" + com_result + '\'' +
                ", com_state=" + com_state +
                ", com_remark='" + com_remark + '\'' +
                ", cus_name='" + cus_name + '\'' +
                ", adm_name='" + adm_name + '\'' +
                ", iss_name='" + iss_name + '\'' +
                ", cau_name='" + cau_name + '\'' +
                '}';
    }
}
