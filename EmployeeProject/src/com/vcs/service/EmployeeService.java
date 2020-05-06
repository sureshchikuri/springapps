package com.vcs.service;

import java.util.List;

import com.vcs.model.Employee;

public interface EmployeeService {

	void create(Employee employee);

	List searchEmployee(int parseInt);

}
