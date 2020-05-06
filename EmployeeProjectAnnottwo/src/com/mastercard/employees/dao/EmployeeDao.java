package com.mastercard.employees.dao;

import java.util.List;

import com.entity.Employee1;

public interface EmployeeDao {

	public void deleteEmployee(final Integer empId);

	public Employee1 getEmployee(final Integer empId);

	public List<Employee1> getEmployees();

	public Employee1 getManager(final Integer empId);

	public List<Employee1> getManagerReportees(final Integer empId);

	public void updateEmployee(Employee1 employee1);

}
