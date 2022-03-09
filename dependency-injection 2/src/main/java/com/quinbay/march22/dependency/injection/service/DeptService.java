package com.quinbay.march22.dependency.injection.service;

import com.quinbay.march22.dependency.injection.dto.Department;
import com.quinbay.march22.dependency.injection.dto.Student;
import org.springframework.stereotype.Service;


import java.util.List;


public interface DeptService {
    List<Department> getAllDepartments();

    Department getDepartment(Integer dept_id);

    void addDepartment(Department department);

    Department UpdatinDepartment(Department department);

    void DeleteDepartment(Integer dept_id);
}


