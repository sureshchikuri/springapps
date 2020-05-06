package com.gsb.employee.controller;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.gsb.emplloyee.Service.EmployeeService;
import com.gsb.employee.command.EmployeeCommand;
import com.gsb.employee.constnts.EmployeeConstants;
import com.gsb.employee.exception.EmployeeServiceException;
import com.gsb.employee.lovMappings.PropertiesLov;
import com.gsb.employee.model.Employee;
import com.gsb.employee.properties.service.PropertiesService;

@SuppressWarnings("deprecation")
public class EmployeeCreateController extends SimpleFormController {

	private PropertiesService propertiesService;
	private EmployeeService employeeService;
	private Employee employee;
	private Employee manager;

	String status;

	public void setPropertiesService(PropertiesService propertiesService) {
		this.propertiesService = propertiesService;
	}

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@Override
	protected Object formBackingObject(HttpServletRequest request)
			throws Exception {

		EmployeeCommand emploCommand = new EmployeeCommand();
		List<PropertiesLov> teamList = new ArrayList<PropertiesLov>();
		List<PropertiesLov> isActiveList = new ArrayList<PropertiesLov>();
		List<PropertiesLov> isManagerList = new ArrayList<PropertiesLov>();
		List<PropertiesLov> managerList = new ArrayList<PropertiesLov>();

		teamList = propertiesService.getType(EmployeeConstants.EMPLOYEE_TEAM);
		isActiveList = propertiesService
				.getType(EmployeeConstants.EMPLOYEE_IS_ACTIVE);
		isManagerList = propertiesService
				.getType(EmployeeConstants.EMPLOYEE_IS_MANAGER);

		request.getSession().setAttribute("teamList", teamList);
		request.getSession().setAttribute("isActiveList", isActiveList);
		request.getSession().setAttribute("isManagerList", isManagerList);

		return emploCommand;
	}

	@Override
	protected ModelAndView onSubmit(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {

		EmployeeCommand employeeCommand = (EmployeeCommand) command;
		employee = new Employee();
		manager = new Employee();
		manager.setEmployeeId(Integer.parseInt(employeeCommand.getManager()));

		try {
			BeanUtils.copyProperties(employee, employeeCommand);
			employee.setEmployee(manager);
			status = employeeService.insertEmployee(employee);
			request.setAttribute("status", status);

		} catch (EmployeeServiceException e) {
			status = EmployeeConstants.SYSTEM_ERROR;

		} catch (IllegalAccessException e) {
			status = EmployeeConstants.SYSTEM_ERROR;
		} catch (InvocationTargetException e) {
			status = EmployeeConstants.SYSTEM_ERROR;
		}

		return new ModelAndView("employeeCreate", "employee", employeeCommand);
	}
}
