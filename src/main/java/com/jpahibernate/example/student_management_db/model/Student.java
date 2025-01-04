package com.jpahibernate.example.student_management_db.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data // getters and setters
@Entity // it is a model or entity class or entity which directly represents database table
@Table(name="student") // it will create table inside database
public class Student {
    @Id // it is primary key of the table and can not take duplicate values
    @Column(name="student_id") // it will create a column in a database table
    private int studentId;

    @Column(name="name", nullable = false)
    private String name;

    @Column(name="email", nullable = false,unique = true)
    private String email;

    @Column(name="dob", nullable = false)
    private String dob;

    @Column(name="gender", nullable = false)
    private String gender;

    @Column(name="grade", nullable = false)
    private String grade;
}
