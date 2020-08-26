package com.aaa.entity;

public class Industry {
    private Integer ind_id;
    private String ind_name;
    private Integer ind_state;
    private Integer indu_id;

    public Integer getIndu_id() {
        return indu_id;
    }

    public void setIndu_id(Integer indu_id) {
        this.indu_id = indu_id;
    }

    public Integer getInd_id() {
        return ind_id;
    }

    public void setInd_id(Integer ind_id) {
        this.ind_id = ind_id;
    }

    public String getInd_name() {
        return ind_name;
    }

    public void setInd_name(String ind_name) {
        this.ind_name = ind_name;
    }

    public Integer getInd_state() {
        return ind_state;
    }

    public void setInd_state(Integer ind_state) {
        this.ind_state = ind_state;
    }

    @Override
    public String toString() {
        return "Industry{" +
                "ind_id=" + ind_id +
                ", ind_name='" + ind_name + '\'' +
                ", ind_state=" + ind_state +
                ", indu_id=" + indu_id +
                '}';
    }
}
