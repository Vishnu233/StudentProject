package com.quinbay.march22.dependency.injection.dto;

import org.springframework.lang.NonNull;


public class Student {
    @NonNull
    public Integer id;

    public String pname,lname,branch;
    public Student(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
    public Student(Integer id,String pname,String lname,String branch){
        this.id=id;
        this.pname=pname;
        this.lname=lname;
        this.branch=branch;
    }
}
