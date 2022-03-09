package com.quinbay.march22.dependency.injection.service;

import com.quinbay.march22.dependency.injection.dto.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();
    List<Student> getpgstudents();
    List<Student> getMgstudents();
    List<Student> getredisstudents();
    void addpgStudent(Student student);
    void addMgstudent(Student student);
    void addredisStudent(Student student);

    Student getStudent(Integer id);
    void addStudent(Student student);
    Student UpdatingStudent(Student student);

    Student updatingStudent(Student student);

    void DeleteStudent(Integer id);


}

