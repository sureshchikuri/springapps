package com.vcs.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.vcs.command.EmployeeCommand;
import com.vcs.model.Employee;
import com.vcs.service.EmployeeService;

public class EmployeeSearchController extends SimpleFormController {

	private EmployeeService employeeService;

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@Override
	protected Object formBackingObject(HttpServletRequest request)
			throws Exception {

		EmployeeCommand employeeCommand = new EmployeeCommand();
		return employeeCommand;
	}

	@Override
	protected ModelAndView onSubmit(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {

		EmployeeCommand employeeCommand = (EmployeeCommand) command;
		List<Employee> employeeList = null;

		employeeList = employeeService.searchEmployee(Integer
				.parseInt(employeeCommand.getEmpId()));

		request.setAttribute("employeeList", employeeList);
		return new ModelAndView("employeeSearch", "employeeCommand", command);
	}
}
