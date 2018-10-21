package com.hnist.graduation.entity;

public class ThesisapplyKey {
    private String thid;

    private String uid;

    public String getThid() {
        return thid;
    }

    public void setThid(String thid) {
        this.thid = thid == null ? null : thid.trim();
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }
}