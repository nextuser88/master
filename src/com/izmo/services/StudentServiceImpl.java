package com.izmo.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.izmo.dao.StudentDao;
import com.izmo.entity.Student;
import com.izmo.services.StudentService;

@Service("studentService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;
    
    @Override
    public List<Student> listStudents() {
	return studentDao.listStudents();
    }

 
    @Override
    public Student getStudentById(int id) {
	return studentDao.getStudentById(id);
    }


    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public void saveStudent(Student obj) {
	studentDao.saveStudent(obj);
	
    }
    
}
