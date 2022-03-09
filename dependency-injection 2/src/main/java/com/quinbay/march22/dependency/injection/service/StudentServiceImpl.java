package com.quinbay.march22.dependency.injection.service;

import com.quinbay.march22.dependency.injection.dto.Student;
import com.quinbay.march22.dependency.injection.entity.StudentEntity;
import com.quinbay.march22.dependency.injection.repository.StudentMongoRepository;
import com.quinbay.march22.dependency.injection.repository.StudentRedisRepository;
import com.quinbay.march22.dependency.injection.repository.StudentRepositary;
import com.quinbay.march22.dependency.injection.repository.Studentdb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.sun.tools.internal.xjc.reader.Ring.add;

@Service
public  class StudentServiceImpl implements StudentService {


    @Autowired
    Studentdb studentdb;

    @Autowired
    StudentRepositary studentRepository;

    @Autowired
    StudentRedisRepository studentRedisRepository;

    @Autowired
    StudentMongoRepository studentMangoRepository;
    private Integer id;

    /*@Override
    public List<Student> getAllStudents() {

       return studentdb.getStudentlist();
    }*/
  /*  @Override
    public List<Student> getAllStudents() {
        List<Student> s = new ArrayList<>();
        for (StudentEntity student : studentRepositary.findAll()) {
            Student s1 = new Student();
            s1.setId((int) student.getId());
            s1.setPname(student.getPname());
            s1.setLname(student.getLname());
            s1.setBranch(student.getBranch());
            s.add(s1);

        }
        return s;
    }*/

   /* @Override
    public Student getStudent(Integer id) {
        return null;
    }*/

    @Override
    public Student UpdatingStudent(Student student) {
        return null;
    }

    @Override
   public List<Student> getAllStudents() {
       List<Student> s=new ArrayList<>();
       for(StudentEntity student: studentMangoRepository.findAll()){
           Student s1=new Student();
           s1.setId((int) student.getId());
           s1.setPname(student.getPname());
           s1.setLname(student.getLname());
           s1.setBranch(student.getBranch());
           s.add(s1);
       }

       for(StudentEntity student:studentRepository.findAll()){
           Student s1=new Student();
           s1.setId((int) student.getId());
           s1.setPname(student.getPname());
           s1.setLname(student.getLname());
           s1.setBranch(student.getBranch());
           s.add(s1);
       }
       for(Student student:studentRedisRepository.findAll()){
           Student s1=new Student();
           s1.setId(student.getId());
           s1.setPname(student.getPname());
           s1.setLname(student.getLname());
           s1.setBranch(student.getBranch());
           s.add(s1);
       }
       return s;
   }

    @Override
    public Student getStudent(Integer id) {
        Student o=new Student();
        for(StudentEntity student: studentMangoRepository.findAll()) {
            if (student.getId() == id) {
                o.setId((int) student.getId());
                o.setPname(student.getPname());
                o.setLname(student.getLname());
                o.setBranch(student.getBranch());
                break;
            }
        }
        return o;
    }

    @Override
    public void addStudent(Student student) {
        StudentEntity se = new StudentEntity();
        se.setId(student.getId());
        se.setBranch(student.getBranch());
        se.setPname(student.getPname());
        se.setLname(student.getLname());
        studentMangoRepository.save(new StudentEntity((int) se.getId(), se.getPname(), se.getLname(), se.getBranch()));

    }

    @Override
    public Student updatingStudent(Student student) {
        Student so = new Student();
        for (StudentEntity se : studentMangoRepository.findAll()) {
            if (se.getId() == student.getId()) {
                se.setPname(student.getPname());
                studentMangoRepository.save(new StudentEntity((int) se.getId(), se.getPname(), se.getLname(), se.getBranch()));
                so.setId((int) se.getId());
                so.setBranch(se.getBranch());
                so.setPname(se.getPname());
                so.setLname(se.getLname());
            }
        }
        return so;
    }

    @Override
    public void DeleteStudent(Integer id) {
        for (StudentEntity stu : studentMangoRepository.findAll()) {
            if (stu.getId() == id) {
                studentMangoRepository.deleteById(id);
                break;
            }
        }

    }

    @Override
    public void addpgStudent(Student student) {
        StudentEntity se = new StudentEntity();
        se.setId(student.getId());
        se.setBranch(student.getBranch());
        se.setPname(student.getPname());
        se.setLname(student.getLname());
        studentRepository.save(new StudentEntity((int) se.getId(), se.getPname(), se.getLname(), se.getBranch()));
    }

    @Override
    public void addMgstudent(Student student) {
        StudentEntity se = new StudentEntity();
        se.setId(student.getId());
        se.setBranch(student.getBranch());
        se.setPname(student.getPname());
        se.setLname(student.getLname());
        studentMangoRepository.save(new StudentEntity((int) se.getId(), se.getPname(), se.getLname(), se.getBranch()));
    }

    @Override
    public void addredisStudent(Student student) {
        studentRedisRepository.addOne(student);

    }

    @Override
    public List<Student> getpgstudents() {
        List<Student> s = new ArrayList<>();
        for (StudentEntity student : studentRepository.findAll()) {
            Student s1 = new Student();
            s1.setId((int) student.getId());
            s1.setPname(student.getPname());
            s1.setLname(student.getLname());
            s1.setBranch(student.getBranch());
            s.add(s1);
        }
        return s;
    }

    @Override
    public List<Student> getMgstudents() {
        List<Student> s = new ArrayList<>();
        for (StudentEntity student : studentMangoRepository.findAll()) {
            Student s1 = new Student();
            s1.setId((int)student.getId());
            s1.setPname(student.getPname());
            s1.setLname(student.getLname());
            s1.setBranch(student.getBranch());
            s.add(s1);
        }
        return s;
    }

   @Override
    public List<Student> getredisstudents() {
        return studentRedisRepository.findAll();
    }



   /* @Override
    public Student getStudent(Integer id, String name) {
        return null;
    }

    @Override
    public void addStudent(Student student) {

    }

    @Override
    public Student UpdatingStudent(Student student) {
        return null;
    }

    @Override
    public void getStudent(Student id) {

    }

    @Override
    public void DeleteStudent(Integer id) {
        return null;
    }

    @Override
    public Student UpdatingStudent(Integer id) {
        return null;
    }
  /* @Override
  // public  List<Student> getAllStudents(){
       return studentRedisRepository.findAll();
   //}

    @Override
    public void getStudent(Integer id) {

    }

    @Override
    public Student getStudent(Integer id, String name) {
        return null;
    }


    /* @Override
     public Student getStudent(Integer id) {
         for (Student student : studentdb.getStudentlist()) {
             if (student.getId() == id) {
                 return student;
             }
         }
         return null;
     }*/
   /* @Override
    public void addStudent(Student student){
        studentRedisRepository.addOne(student);
    }

    @Override
    public Student UpdatingStudent(Student student) {
        return null;
    }*/


   /* @Override
   public Student getStudent(Integer id, String name){
       Student o=new Student();
       for(StudentEntity student:studentRepositary.findAll()){
           if(student.getId()==id && student.getPname().equals(name)){
               o.setId((int) student.getId());
               o.setBranch(student.getBranch());
               o.setPname(student.getPname());
               o.setLname(student.getLname());

           }
       }
       return o;
   }*/

   /* @Override
    public void addStudent(Student student) {
        studentRepositary.save(new StudentEntity(student.getId(), student.getPname(), student.getLname(), student.getBranch()));

    }*/
    /*@Override
    public void getStudent(Student student){
        studentRedisRepository.addOne(student);
    }




    @Override
    public void DeleteStudent(Integer id){
        studentRedisRepository.deleteOne(id);
    }


    /*@Override
    public Student UpdatingStudent(Student student) {
        for (Student stu : studentdb.getStudentlist()) {
            if (stu.getId() == stu.getId()) {
                stu.lname = student.getLname();


            }


        }
        return student;
    }*/
   /* @Override
    public Student UpdatingStudent(Student student){
        Student so=new Student();
        for(StudentEntity s1:studentRepositary.findAll()){
            if(s1.getId()==student.getId()){
                s1.setPname(student.getPname());
                studentRepositary.save(new StudentEntity((int) s1.getId(),s1.getPname(),s1.getLname(),s1.getBranch()));
                so.setId((int) s1.getId());
                so.setBranch(s1.getBranch());
                so.setPname(s1.getPname());
                so.setLname(s1.getLname());
            }
        }
        return so;
    }*/
   /*@Override
    public Student UpdatingStudent(Integer id){
       return null;
   }
   /* @Override
    public void DeleteStudent(Integer id) {
        for (StudentEntity stu : studentRepositary.findAll()) {
            if (stu.getId() == id) {
                studentRepositary.deleteById(id);
                break;

            }
        }
    }*/
}
