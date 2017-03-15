package com.izmo.controller;
import java.util.List;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.izmo.entity.Student;
import com.izmo.services.StudentService;

@Controller
public class StudentController {
    private static Logger logger = Logger.getLogger(StudentController.class);
    @Autowired
    private StudentService studentService;
    @RequestMapping(value = "/listStudents.htm", method = RequestMethod.GET)
    public String listStudents(Model model){
	model.addAttribute("student", new Student());
	List<Student> students = studentService.listStudents();
	model.addAttribute("studentList", students);
	return "listStudent";
    }
    @RequestMapping(value = "/addStudent.htm", method = RequestMethod.GET) 
    public String addStudent(Model model){
	    Student student = new Student();
	    model.addAttribute("student", student);
	    return "addStudent";
    }

    @RequestMapping(value = "/saveStudent.htm", method = RequestMethod.POST) 
    public String saveStudent(@Valid @ModelAttribute("student") Student student, BindingResult results){
	if(results.hasErrors()){
	  logger.error("Binding result errors " + results.getAllErrors());
	    return "error";	
	}else{
	    studentService.saveStudent(student);
	    return "redirect:/listStudents.htm";
	}
    }
    @RequestMapping("/edit.htm/{id}")
    public String editStudent(@PathVariable("id") int id, Model model){
	model.addAttribute("student", studentService.getStudentById(id));
	model.addAttribute("listStudents", studentService.listStudents());
	return "editStudent";
    }
}
