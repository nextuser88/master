package com.izmo.services;
import java.util.List;
import com.izmo.entity.Student;

public interface StudentService {
    List<Student> listStudents();
    void saveStudent(Student obj);
    Student getStudentById(int id);
}
