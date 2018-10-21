package com.hnist.graduation.entity;

public class Teacher {
    private Integer id;

    private String tid;

    private String password;

    private Integer checkman;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid == null ? null : tid.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getCheckman() {
        return checkman;
    }

    public void setCheckman(Integer checkman) {
        this.checkman = checkman;
    }
}