package com.aaa.entity;

import org.apache.ibatis.annotations.Insert;

import javax.persistence.Table;

@Table(name = "orders")
public class Order{
    private Integer ord_id;
    private Integer cus_id;
    private String cus_name;
    private Integer pay_id;
    private String pay_name;
    private String ord_time;
    private String ord_method;
    private String ord_totalprice;
    private String ord_payment;
    private Integer ord_state;
    private Integer ord_states;

    public Integer getOrd_id() {
        return ord_id;
    }

    public void setOrd_id(Integer ord_id) {
        this.ord_id = ord_id;
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

    public Integer getPay_id() {
        return pay_id;
    }

    public void setPay_id(Integer pay_id) {
        this.pay_id = pay_id;
    }

    public String getPay_name() {
        return pay_name;
    }

    public void setPay_name(String pay_name) {
        this.pay_name = pay_name;
    }

    public String getOrd_time() {
        return ord_time;
    }

    public void setOrd_time(String ord_time) {
        this.ord_time = ord_time;
    }

    public String getOrd_method() {
        return ord_method;
    }

    public void setOrd_method(String ord_method) {
        this.ord_method = ord_method;
    }

    public String getOrd_totalprice() {
        return ord_totalprice;
    }

    public void setOrd_totalprice(String ord_totalprice) {
        this.ord_totalprice = ord_totalprice;
    }

    public String getOrd_payment() {
        return ord_payment;
    }

    public void setOrd_payment(String ord_payment) {
        this.ord_payment = ord_payment;
    }

    public Integer getOrd_state() {
        return ord_state;
    }

    public void setOrd_state(Integer ord_state) {
        this.ord_state = ord_state;
    }

    public Integer getOrd_states() {
        return ord_states;
    }

    public void setOrd_states(Integer ord_states) {
        this.ord_states = ord_states;
    }

    @Override
    public String toString() {
        return "Order{" +
                "ord_id=" + ord_id +
                ", cus_id=" + cus_id +
                ", cus_name='" + cus_name + '\'' +
                ", pay_id=" + pay_id +
                ", pay_name='" + pay_name + '\'' +
                ", ord_time='" + ord_time + '\'' +
                ", ord_method='" + ord_method + '\'' +
                ", ord_totalprice='" + ord_totalprice + '\'' +
                ", ord_payment='" + ord_payment + '\'' +
                ", ord_state=" + ord_state +
                ", ord_states=" + ord_states +
                '}';
    }
}
