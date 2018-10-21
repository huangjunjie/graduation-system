package com.hnist.graduation.entity;

public class Thesischeck {
    private Integer id;

    private String thid;

    private String tid;

    private String thtitle;

    private String thclass;

    private String thfrom;

    private Integer checkd;

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

    public String getThtitle() {
        return thtitle;
    }

    public void setThtitle(String thtitle) {
        this.thtitle = thtitle == null ? null : thtitle.trim();
    }

    public String getThclass() {
        return thclass;
    }

    public void setThclass(String thclass) {
        this.thclass = thclass == null ? null : thclass.trim();
    }

    public String getThfrom() {
        return thfrom;
    }

    public void setThfrom(String thfrom) {
        this.thfrom = thfrom == null ? null : thfrom.trim();
    }

    public Integer getCheckd() {
        return checkd;
    }

    public void setCheckd(Integer checkd) {
        this.checkd = checkd;
    }
}