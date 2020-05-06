package com.vcs.service;

import java.util.List;

import com.vcs.dao.EmployeeDao;
import com.vcs.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao;
	
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public String create(Employee employee) {

		String status=null;
		employeeDao.create(employee);
		status="employee created successfully";
		return status;
	}

	@Override
	public List<Employee> searchEmployee(int employeeId) {

		List<Employee> employeeList=null;
		
		employeeList=employeeDao.searchEmployee(employeeId);
		return employeeList;
	}
}
