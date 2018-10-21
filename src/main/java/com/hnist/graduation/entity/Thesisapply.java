package com.hnist.graduation.entity;

public class Thesisapply extends ThesisapplyKey {
    private String tid;

    private Integer apply;

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid == null ? null : tid.trim();
    }

    public Integer getApply() {
        return apply;
    }

    public void setApply(Integer apply) {
        this.apply = apply;
    }
}