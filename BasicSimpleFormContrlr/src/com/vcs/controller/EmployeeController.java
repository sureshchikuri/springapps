package com.vcs.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.vcs.command.Employee;

public class EmployeeController extends SimpleFormController {

	@Override
	protected Object formBackingObject(HttpServletRequest request)
			throws Exception {
		
		Employee employee=new Employee();
		
		employee.setEmpId("1123");
		
		employee.setEmpName("suresh");
		
		employee.setEmpSal("123456");
		return employee ;
	}
	
	@Override
	protected ModelAndView onSubmit(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {
		Employee employee=(Employee) command;
		System.out.println(employee.getEmpId());
		return new ModelAndView("success");
	}
}
