package com.mastercard.employees.service;

import java.util.List;

import com.entity.Employee1;
import com.mastercard.employees.exception.EmployeeServiceException;

public interface EmployeeService {

	public List<Employee1> getEmployees() throws EmployeeServiceException;

	public Employee1 getEmployee(final Integer empId) throws EmployeeServiceException;

	public Employee1 getManager(final Integer empId) throws EmployeeServiceException;

	public List<Employee1> getManagerReportees(final Integer empId) throws EmployeeServiceException;

	public void deleteEmployee(final Integer empId) throws EmployeeServiceException;

	public void updateEmployee(Employee1 employee1)throws EmployeeServiceException;

}
