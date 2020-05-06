package com.vcs.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.sun.org.apache.commons.beanutils.BeanUtils;
import com.vcs.command.EmployeeCommand;
import com.vcs.model.Employee;
import com.vcs.model.WsLov;
import com.vcs.service.EmployeeService;
import com.vcs.service.WorkStationService;

public class EmployeeController extends SimpleFormController {

	private EmployeeService employeeService;

	private WorkStationService workStationService;

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	public void setWorkStationService(WorkStationService workStationService) {
		this.workStationService = workStationService;
	}

	@Override
	protected Object formBackingObject(HttpServletRequest request)
			throws Exception {

		EmployeeCommand employee = new EmployeeCommand();
		WsLov wsLov = new WsLov();

		List typeList = null;
		List commonList = null;

		typeList = workStationService.getTypeList(wsLov);
		commonList = workStationService.getCommonList(wsLov);

		request.setAttribute("typeList", typeList);
		request.setAttribute("commonList", commonList);

		return employee;
	}

	@Override
	protected ModelAndView onSubmit(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {

		EmployeeCommand employeeCommand = (EmployeeCommand) command;
		Employee employee = new Employee();
		Employee manager = new Employee();

		BeanUtils.copyProperties(employee, employeeCommand);

		if (employeeCommand.getManager().equals("")) {
			employeeCommand.setManager("0");
		}

		manager.setEmpId(Integer.parseInt(employeeCommand.getManager()));
		employee.setEmployee(manager);

		String status = null;
		status=employeeService.create(employee);

		return new ModelAndView("success", "employeeCommand", command);
	}
}
