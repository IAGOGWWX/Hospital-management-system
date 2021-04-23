package com.duyi.qxgl.domain;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable {

    private Integer uno ;
    private String uname ;
    private String zjm ;
    private String upass ;
    private Integer age ;
    private String sex ;
    private String dept ;
    private String yl1 ;
    private String yl2 ;
    private String yl3 ;

    private List<Role> roles ;//当前这个用户分配角色

    public Integer getUno() {
        return uno;
    }

    public void setUno(Integer uno) {
        this.uno = uno;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getZjm() {
        return zjm;
    }

    public void setZjm(String zjm) {
        this.zjm = zjm;
    }

    public String getUpass() {
        return upass;
    }

    public void setUpass(String upass) {
        this.upass = upass;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getYl1() {
        return yl1;
    }

    public void setYl1(String yl1) {
        this.yl1 = yl1;
    }

    public String getYl2() {
        return yl2;
    }

    public void setYl2(String yl2) {
        this.yl2 = yl2;
    }

    public String getYl3() {
        return yl3;
    }

    public void setYl3(String yl3) {
        this.yl3 = yl3;
    }

    public User(Integer uno, String uname, String zjm, String upass, Integer age, String sex, String dept, String yl1, String yl2, String yl3) {
        this.uno = uno;
        this.uname = uname;
        this.zjm = zjm;
        this.upass = upass;
        this.age = age;
        this.sex = sex;
        this.dept = dept;
        this.yl1 = yl1;
        this.yl2 = yl2;
        this.yl3 = yl3;
    }

    @Override
    public String toString() {
        return "User{" +
                "uno=" + uno +
                ", uname='" + uname + '\'' +
                ", zjm='" + zjm + '\'' +
                ", upass='" + upass + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", dept='" + dept + '\'' +
                ", yl1='" + yl1 + '\'' +
                ", yl2='" + yl2 + '\'' +
                ", yl3='" + yl3 + '\'' +
                ", roles=" + roles +
                '}';
    }

    public User() {
    }
}
