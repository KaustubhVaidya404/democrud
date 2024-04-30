package com.example.democrud.repository;

import com.example.democrud.models.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentData {


    static List<Student> studentList = new ArrayList<Student>();

    Student st = new Student();

    static  {
        studentList.add(new Student(1, "John"));
        studentList.add(new Student(2, "Jay"));
        studentList.add(new Student(3, "Mina"));
        studentList.add(new Student(4, "Jatin"));
        studentList.add(new Student(5, "Umar"));
        studentList.add(new Student(6, "Amit"));
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void deleteStudent(int id) {
        studentList.removeIf(student -> student.getId() == id);
    }

    public Student getStudent(int id) {
        return studentList.stream().filter(student -> student.getId() == id).findFirst().get();
    }

}
