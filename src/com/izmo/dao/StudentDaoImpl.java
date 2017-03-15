package com.izmo.dao;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.izmo.dao.StudentDao;
import com.izmo.entity.Student;

@Repository("studentDao")
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private SessionFactory sessionFactory;
   
    @SuppressWarnings("unchecked")
    @Override
    public List<Student> listStudents() {
	return (List<Student>) sessionFactory.getCurrentSession().createCriteria(Student.class).list();
    }

    @Override
    public void saveStudent(Student obj) {
	sessionFactory.getCurrentSession().saveOrUpdate(obj);
    }

    @Override
    public Student getStudentById(int id) {
	return (Student) sessionFactory.getCurrentSession().get(Student.class, id);
    }
   
}
