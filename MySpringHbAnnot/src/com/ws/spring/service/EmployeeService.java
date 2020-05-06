package com.ws.spring.service;

import java.util.List;

import com.ws.spring.model.Employee;

public interface EmployeeService {

	 void saveEmployee(Employee employee);
	 
	    List<Employee> findAllEmployees();
	 
	    void deleteEmployeeBySsn(String ssn);
	 
	    Employee findBySsn(String ssn);
	 
	    void updateEmployee(Employee employee);
}
