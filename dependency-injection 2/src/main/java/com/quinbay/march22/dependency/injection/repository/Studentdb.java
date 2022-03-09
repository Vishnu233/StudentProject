package com.quinbay.march22.dependency.injection.repository;

import com.quinbay.march22.dependency.injection.dto.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class Studentdb {
    private  List<Student> li=new ArrayList<>();
    public  List<Student> getStudentlist() {
        if (li.size() == 0) {


            Student st1 = new Student(1, "vishnu", "vardhan", "CSE");
            Student st2 = new Student(2, "vishnu1", "vardhan1", "CSE1");
            Student st3 = new Student(3, "vishnu2", "vardhan2", "CSE2");
            Student st4 = new Student(4, "vishnu3", "vardhan3", "CSE3");

            li.add(st1);
            li.add(st2);
            li.add(st3);
            li.add(st4);


        }
        return li;
    }
}





