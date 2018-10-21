package com.hnist.graduation.entity;

public class Task {
    private Integer id;

    private String taskid;

    private String tid;

    private String uid;

    private String contenta;

    private String contentb;

    private String contentc;

    private String contentd;

    private String remark;

    private Integer status;

    private String lasttime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTaskid() {
        return taskid;
    }

    public void setTaskid(String taskid) {
        this.taskid = taskid == null ? null : taskid.trim();
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

    public String getContenta() {
        return contenta;
    }

    public void setContenta(String contenta) {
        this.contenta = contenta == null ? null : contenta.trim();
    }

    public String getContentb() {
        return contentb;
    }

    public void setContentb(String contentb) {
        this.contentb = contentb == null ? null : contentb.trim();
    }

    public String getContentc() {
        return contentc;
    }

    public void setContentc(String contentc) {
        this.contentc = contentc == null ? null : contentc.trim();
    }

    public String getContentd() {
        return contentd;
    }

    public void setContentd(String contentd) {
        this.contentd = contentd == null ? null : contentd.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getLasttime() {
        return lasttime;
    }

    public void setLasttime(String lasttime) {
        this.lasttime = lasttime == null ? null : lasttime.trim();
    }
}