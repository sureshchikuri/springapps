package com.vcs.service;

import java.util.List;

import com.vcs.model.Employee;

public interface EmployeeService {

	void insertEmployee(Employee employee);

	List<Employee> selectEmployee(Integer empId);

}
