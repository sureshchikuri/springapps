package com.gsb.emplloyee.dao;

import java.util.List;

import com.gsb.employee.exception.EmployeeDaoException;
import com.gsb.employee.model.Employee;

public interface EmployeeDao {

	public void insertEmployee(Employee employee) throws EmployeeDaoException;

	public List<Employee> searchEmployee(Employee employee)
			throws EmployeeDaoException;

	public List<Integer> getManage(String Ismanager)
			throws EmployeeDaoException;

}
