package com.quinbay.march22.dependency.injection.studentcontroller;

import com.quinbay.march22.dependency.injection.dto.Student;
import com.quinbay.march22.dependency.injection.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService ss;

    @GetMapping("/Students")
    public List<Student> getAllStudent(@RequestParam String db) {
        switch (db) {
            case "pg":
                return ss.getpgstudents();
            case "redis":
                return ss.getredisstudents();
            case "mg":
                return ss.getMgstudents();
            default:
                return ss.getAllStudents();
        }
    }
   /* @GetMapping( "/Student/{id}")
    public Student getStudent(@PathVariable Integer id){
        return ss.getStudent(id);

    }*/

   @GetMapping("/Student")
    public Student getStudent(@RequestParam(required = true) Integer id){
        return ss.getStudent(id);
    }
        @PostMapping("/Stud")
        public void addStudent(@RequestBody Student student, @RequestParam String db){
            switch (db) {
                case "pg":
                    ss.addpgStudent(student);
                    break;
                case "redis":
                    ss.addredisStudent(student);
                    break;
                case "mg":
                    ss.addMgstudent(student);
                    break;
                default:
                    ss.addStudent(student);

            }
        }
        @PutMapping("/st")
        public void putStudent (@RequestBody Student student){
            ss.UpdatingStudent(student);
        }
        @DeleteMapping("/s")
        public void deleteStudent (@RequestParam(value = "id") Integer id){
            ss.DeleteStudent(id);
        }
    }



