package com.vcs.dao;

import java.util.List;

import com.vcs.model.Employee;

public interface EmployeeDao {

	void insertEmployee(Employee employee);

	List<Employee> selectEmployee(Integer empId);

}
