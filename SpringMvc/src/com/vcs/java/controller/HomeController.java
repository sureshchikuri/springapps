package com.vcs.java.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.vcs.java.dao.StudentDao;
import com.vcs.java.model.Student;

@Controller
public class HomeController {
	
	@Autowired
	private StudentDao StudentDao;

	@RequestMapping(value="/")
	public ModelAndView listStudent(ModelAndView model) throws IOException{
	    List<Student> listStudent = StudentDao.list();
	    model.addObject("listStudent", listStudent);
	    model.setViewName("home");
	 
	    return model;
	}
	
	@RequestMapping(value = "/newStudent", method = RequestMethod.GET)
	public ModelAndView newStudent(ModelAndView model) {
	    Student newStudent = new Student();
	    model.addObject("Student", newStudent);
	    model.setViewName("StudentForm");
	    return model;
	}
	
	@RequestMapping(value = "/saveStudent", method = RequestMethod.POST)
	public ModelAndView saveStudent(@ModelAttribute Student Student) {
	    StudentDao.saveOrUpdate(Student);
	    return new ModelAndView("redirect:/");
	}
	
	@RequestMapping(value = "/deleteStudent", method = RequestMethod.GET)
	public ModelAndView deleteStudent(HttpServletRequest request) {
	    int StudentId = Integer.parseInt(request.getParameter("id"));
	    StudentDao.delete(StudentId);
	    return new ModelAndView("redirect:/");
	}
	
	@RequestMapping(value = "/editStudent", method = RequestMethod.GET)
	public ModelAndView editStudent(HttpServletRequest request) {
	    int StudentId = Integer.parseInt(request.getParameter("id"));
	    Student Student = StudentDao.get(StudentId);
	    ModelAndView model = new ModelAndView("StudentForm");
	    model.addObject("Student", Student);
	 
	    return model;
	}
}
