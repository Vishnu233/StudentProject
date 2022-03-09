package com.quinbay.march22.dependency.injection.studentcontroller;

import com.quinbay.march22.dependency.injection.service.DeptService;
import com.quinbay.march22.dependency.injection.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptController {

    @Autowired
    DeptService ds;
    StudentService ss;

//    @GetMapping("/Students")
//    public List<Department> getAllDept(){
//        for(Student s:ss.getAllStudents()){
//            for(Department d:ds.getAllDepartents())
//            if(s.getBranch().equals(d.getDept_name())){
//                return (List<Department>) d;
//            }
//        }
//        return null;
//    }
}
