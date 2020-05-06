package com.vcs.dao;

import java.util.List;

import com.vcs.model.Employee;


public interface EmployeeDao {

	void create(Employee employee);

	List searchEmployee(int employeeId);


}
