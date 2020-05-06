package com.gsb.employee.controller;

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

public class EmployeeSearchController extends SimpleFormController {

	private EmployeeService employeeService;
	private PropertiesService propertiesService;

	private Employee employee;
	String status;
	private List<Employee> employeeList;

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	public void setPropertiesService(PropertiesService propertiesService) {
		this.propertiesService = propertiesService;
	}

	@Override
	protected Object formBackingObject(HttpServletRequest request)
			throws Exception {
		EmployeeCommand employeeCommand = new EmployeeCommand();
		List<PropertiesLov> isActiveList = new ArrayList<PropertiesLov>();

		isActiveList = propertiesService
				.getType(EmployeeConstants.EMPLOYEE_IS_ACTIVE);
		request.getSession().setAttribute("isActiveList", isActiveList);

		return employeeCommand;
	}

	@Override
	protected ModelAndView onSubmit(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {
		EmployeeCommand employeeCommand = new EmployeeCommand();
		Employee employee = new Employee();
		try {
			BeanUtils.copyProperties(employee, employeeCommand);
			employeeList = employeeService.searchEmployee(employee);
		} catch (EmployeeServiceException e) {
			status = EmployeeConstants.SYSTEM_ERROR;
		} catch (IllegalAccessException e) {
			status = EmployeeConstants.SYSTEM_ERROR;
		}

		request.setAttribute("employeeList", employeeList);
		return new ModelAndView("employeeSearch", "employee", employeeCommand);
	}

}
