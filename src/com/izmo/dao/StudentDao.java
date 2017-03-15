package com.izmo.dao;

import java.util.List;
import com.izmo.entity.Student;

public interface StudentDao {
    List<Student> listStudents();
    void saveStudent(Student obj);
    Student getStudentById(int id);
}
