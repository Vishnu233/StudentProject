package com.quinbay.march22.dependency.injection.repository;

import com.quinbay.march22.dependency.injection.dto.Department;
import com.quinbay.march22.dependency.injection.dto.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class Departmentdb {
    private static List<Department> dept = new ArrayList<>();


    public static List<Department> getDeptList() {
        if (dept.size() == 0) {



            Department d1 = new Department(1,"cse","vishnu");
            Department d2 = new Department(2,"ece","sai");
            Department d3 = new Department(3,"eee","reddy");
            Department d4 = new Department(4,"mba","venu");

            dept.add(d1);
            dept.add(d2);
            dept.add(d3);
            dept.add(d4);


        }
        return dept;
    }
}
