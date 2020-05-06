package com.vcs.service;

import java.util.List;

import com.vcs.model.Employee;

public interface EmployeeService {

	String create(Employee employee);

	List<Employee> searchEmployee(int parseInt);

}
