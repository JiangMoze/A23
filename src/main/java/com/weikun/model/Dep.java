package com.weikun.model;

public class Dep {
    private Integer deptno;

    private String deptname;

    private Object elist;//employee list

    public Object getElist() {
        return elist;
    }

    public void setElist(Object elist) {
        this.elist = elist;
    }

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname == null ? null : deptname.trim();
    }
}