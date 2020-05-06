package com.gsb.emplloyee.Service;

import java.util.List;

import com.gsb.employee.exception.EmployeeServiceException;
import com.gsb.employee.model.Employee;

public interface EmployeeService {
	public String insertEmployee(Employee employee)
			throws EmployeeServiceException;

	public List<Employee> searchEmployee(Employee employee)
			throws EmployeeServiceException;

}
