package com.duyi.qxgl.domain;

import java.io.Serializable;
import java.util.List;

public class Function implements Serializable {

    //基本信息
    private Integer fno ;
    private String fname ;
    private String fhref ;
    private Integer pno ;
    private Integer flag ; //1菜单，2按钮
    private String yl1;
    private String yl2;

    //关联信息
    //private Function parent ;//当前功能的父级功能。
    private List<Function> children ;//当前功能分配的子功能 (父级菜单->子级菜单)

    public Integer getFno() {
        return fno;
    }

    public void setFno(Integer fno) {
        this.fno = fno;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getFhref() {
        return fhref;
    }

    public void setFhref(String fhref) {
        this.fhref = fhref;
    }

    public Integer getPno() {
        return pno;
    }

    public void setPno(Integer pno) {
        this.pno = pno;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public List<Function> getChildren() {
        return children;
    }

    public void setChildren(List<Function> children) {
        this.children = children;
    }

    public Function(Integer fno, String fname, String fhref, Integer pno, Integer flag) {
        this.fno = fno;
        this.fname = fname;
        this.fhref = fhref;
        this.pno = pno;
        this.flag = flag;
    }

    public Function() {
    }
}
