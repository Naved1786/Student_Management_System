package com.jpahibernate.example.student_management_db.service;

import com.jpahibernate.example.student_management_db.model.Student;
import com.jpahibernate.example.student_management_db.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public  String addStudent(Student saveRequest){
         studentRepository.save(saveRequest);
         return "Student saved successfully";
    }

    public String deleteStudentById(@PathVariable int StudentId){
        studentRepository.deleteById(StudentId);
        return "Student delted by id : "+StudentId;
    }

}
