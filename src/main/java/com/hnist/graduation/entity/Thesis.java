package com.hnist.graduation.entity;

public class Thesis {
    private Integer id;

    private String thid;

    private String tid;

    private String uid;

    private String thname;

    private String thtitle;

    private String thesiscard;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getThid() {
        return thid;
    }

    public void setThid(String thid) {
        this.thid = thid == null ? null : thid.trim();
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid == null ? null : tid.trim();
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getThname() {
        return thname;
    }

    public void setThname(String thname) {
        this.thname = thname == null ? null : thname.trim();
    }

    public String getThtitle() {
        return thtitle;
    }

    public void setThtitle(String thtitle) {
        this.thtitle = thtitle == null ? null : thtitle.trim();
    }

    public String getThesiscard() {
        return thesiscard;
    }

    public void setThesiscard(String thesiscard) {
        this.thesiscard = thesiscard == null ? null : thesiscard.trim();
    }
}