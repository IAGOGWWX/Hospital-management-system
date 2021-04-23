package com.duyi.qxgl.domain;

import java.util.List;

public class Page {
    private Integer max;
    private List<?> userList;

    public Page() {
    }

    public Page(Integer max, List<?> userList) {
        this.max = max;
        this.userList = userList;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public List<?> getUserList() {
        return userList;
    }

    public void setUserList(List<?> userList) {
        this.userList = userList;
    }
}
