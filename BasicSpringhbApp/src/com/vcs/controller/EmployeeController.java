package com.vcs.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.vcs.command.EmployeeCommand;

public class EmployeeController extends SimpleFormController {

	@Override
	protected Object formBackingObject(HttpServletRequest request)
			throws Exception {

		System.out.println("hai");
		
		return super.formBackingObject(request);
	}
	
	@Override
	protected ModelAndView onSubmit(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {

		System.out.println("hai");
		EmployeeCommand employee= (EmployeeCommand) command;
		
		return new ModelAndView("success");
	}
}
