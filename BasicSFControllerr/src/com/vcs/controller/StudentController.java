package com.vcs.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.vcs.command.Student;

public class StudentController  extends SimpleFormController{
	
	@Override
	protected Object formBackingObject(HttpServletRequest request)
			throws Exception {
		
		System.out.println("formBacking");
		
		return super.formBackingObject(request);
	}
	
	@Override 
	protected ModelAndView onSubmit(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {

		Student student = (Student) command;
		System.out.println("OnSubmit()");
		
		return new ModelAndView("success");
	}
	

}
