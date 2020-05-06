package com.vcs.service;

import java.util.List;

import com.vcs.dao.EmployeeDao;
import com.vcs.model.Employee;

public class EmployeeService{

	private EmployeeDao employeeDao;

	public void insertEmployee(Employee employee) {
	

		employeeDao.insertEmployee(employee);

	}

	public List<Employee> selectEmployee(Integer empId) {

		List<Employee> empList;

		empList = employeeDao.selectEmployee(empId);

		return empList;

	}

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

}
