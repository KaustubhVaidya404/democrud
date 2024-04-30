package com.example.democrud.controllers;

import com.example.democrud.models.Student;
import com.example.democrud.repository.StudentData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    StudentData studentData;

    @PostMapping("/add")
    public void addStudent(@RequestBody Student student) {
        studentData.addStudent(student);
    }

    @GetMapping("/get")
    public Student getAllStudent(){
        return (Student) studentData.getStudentList();
    }



}
