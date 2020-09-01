package com.aaa.entity;

public class Pay_function {
    private Integer pay_id;
    private String pay_name;
    private String pay_price;

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

    public String getPay_price() {
        return pay_price;
    }

    public void setPay_price(String pay_price) {
        this.pay_price = pay_price;
    }

    @Override
    public String toString() {
        return "Pay_function{" +
                "pay_id=" + pay_id +
                ", pay_name='" + pay_name + '\'' +
                ", pay_price='" + pay_price + '\'' +
                '}';
    }
}
