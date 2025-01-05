package com.jpahibernate.example.student_management_db.controller;

import com.jpahibernate.example.student_management_db.model.Student;
import com.jpahibernate.example.student_management_db.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student/apis")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/save")
    public String saveStudent(@RequestBody Student studentRequest){
        return studentService.addStudent(studentRequest);
    }

    @DeleteMapping("/delete/{StudentId}")
    public String deleteStudent(@PathVariable int StudentId){
        String response= studentService.deleteStudentById(StudentId);
        return  response;
    }

    @GetMapping("/findAll")
   public List<Student> findAllStudent(){
       List<Student>  list=studentService.findAllStudent();
       return list;

   }
}
