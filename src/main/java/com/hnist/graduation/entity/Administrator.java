package com.hnist.graduation.entity;

public class Administrator {
    private Integer id;

    private String adminid;

    private String adminuserid;

    private String adminpassword;

    private String adminrealname;

    private String adminemail;

    private String admintel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdminid() {
        return adminid;
    }

    public void setAdminid(String adminid) {
        this.adminid = adminid == null ? null : adminid.trim();
    }

    public String getAdminuserid() {
        return adminuserid;
    }

    public void setAdminuserid(String adminuserid) {
        this.adminuserid = adminuserid == null ? null : adminuserid.trim();
    }

    public String getAdminpassword() {
        return adminpassword;
    }

    public void setAdminpassword(String adminpassword) {
        this.adminpassword = adminpassword == null ? null : adminpassword.trim();
    }

    public String getAdminrealname() {
        return adminrealname;
    }

    public void setAdminrealname(String adminrealname) {
        this.adminrealname = adminrealname == null ? null : adminrealname.trim();
    }

    public String getAdminemail() {
        return adminemail;
    }

    public void setAdminemail(String adminemail) {
        this.adminemail = adminemail == null ? null : adminemail.trim();
    }

    public String getAdmintel() {
        return admintel;
    }

    public void setAdmintel(String admintel) {
        this.admintel = admintel == null ? null : admintel.trim();
    }
}