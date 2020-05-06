package com.vcs.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.vcs.model.Employee;
import com.vcs.service.EmployeeService;

public class EmployeeController extends MultiActionController {
	
	private EmployeeService employeeService;
	
	public ModelAndView insert(HttpServletRequest request,
			HttpServletResponse response,Employee employee) throws Exception {
		
		employeeService.insertEmployee(employee);
		
		return new ModelAndView("success");
	}
	
	public ModelAndView update(HttpServletRequest request,
			HttpServletResponse response,Employee employee) throws Exception {
		
		return new ModelAndView("success");
	}
	
	public ModelAndView delete(HttpServletRequest request,
			HttpServletResponse response,Employee employee) throws Exception {
		return new ModelAndView("success");
	}
	
	public ModelAndView select(HttpServletRequest request,
			HttpServletResponse response,Employee employee) throws Exception {
		
		List<Employee> empList=new ArrayList<Employee>();
		
		empList=employeeService.selectEmployee(employee.getEmpId());
		
		
		return new ModelAndView("employeeData");
	}

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

}
