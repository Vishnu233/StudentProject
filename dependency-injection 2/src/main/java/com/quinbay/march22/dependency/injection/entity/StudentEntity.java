package com.quinbay.march22.dependency.injection.entity;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="student")
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    @NonNull
    private Integer id;

    @NotBlank(message="student should be null")
    String pname,lname,branch;
    public StudentEntity(){

    }

    public long getId() {
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
    public StudentEntity(int id, String pname, String lname, String branch){
        this.id=id;
        this.pname=pname;
        this.lname=lname;
        this.branch=branch;
    }
}
