package com.duyi.qxgl.domain;

import java.io.Serializable;
import java.util.List;

public class Role implements Serializable {

    private Integer rno ;
    private String rname ;
    private String rdescription ;
    private String yl1 ;
    private String yl2 ;

    //private List<User> users ;// 具有当前角色那些用户
    private List<Function> functions ; //当前角色分配的功能

    @Override
    public String toString() {
        return "Role{" +
                "rno=" + rno +
                ", rname='" + rname + '\'' +
                ", rdescription='" + rdescription + '\'' +
                ", yl1='" + yl1 + '\'' +
                ", yl2='" + yl2 + '\'' +
                ", functions=" + functions +
                '}';
    }

    public Integer getRno() {
        return rno;
    }

    public void setRno(Integer rno) {
        this.rno = rno;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public String getRdescription() {
        return rdescription;
    }

    public void setRdescription(String rdescription) {
        this.rdescription = rdescription;
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

    public List<Function> getFunctions() {
        return functions;
    }

    public void setFunctions(List<Function> functions) {
        this.functions = functions;
    }

    public Role(Integer rno, String rname, String rdescription, String yl1, String yl2) {
        this.rno = rno;
        this.rname = rname;
        this.rdescription = rdescription;
        this.yl1 = yl1;
        this.yl2 = yl2;
    }

    public Role() {
    }
}
