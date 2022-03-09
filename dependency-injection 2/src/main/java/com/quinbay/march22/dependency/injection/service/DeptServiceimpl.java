package com.quinbay.march22.dependency.injection.service;

import com.quinbay.march22.dependency.injection.dto.Department;
import com.quinbay.march22.dependency.injection.repository.Departmentdb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public  class DeptServiceimpl implements DeptService {


    @Autowired
    Departmentdb departmentdb;

    @Override
    public List<Department> getAllDepartments() {
        return Departmentdb.getDeptList();
    }

    @Override
    public Department getDepartment(Integer dept_id) {
        for (Department department : departmentdb.getDeptList()){
            if (department.getDept_id() == dept_id){
                return department;
            }
    }
        return null;
    }

    public DeptServiceimpl() {
        super();
    }

    @Override
    public void addDepartment(Department department) {

    }

    @Override
    public Department UpdatinDepartment(Department department) {
        return null;
    }

    @Override
    public void DeleteDepartment(Integer dept_id) {

    }
}
