package com.vcs.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.vcs.model.Student;

public class StudentController extends SimpleFormController {

	@Override
	protected Object formBackingObject(HttpServletRequest request)
			throws Exception {

		Student student=new Student();
		
		student.setStudentNo("111");
		
		return student;
	}
	
	@Override
	protected ModelAndView onSubmit(Object command) throws Exception {

		Student student=(Student)command;
		System.out.println("StudentName:"+student.getStudentName());
		return new ModelAndView("success");
	}
}
