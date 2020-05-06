package com.gsb.emplloyee.Service;

import java.util.List;

import com.gsb.emplloyee.dao.EmployeeDao;
import com.gsb.employee.constnts.EmployeeConstants;
import com.gsb.employee.exception.EmployeeDaoException;
import com.gsb.employee.exception.EmployeeServiceException;
import com.gsb.employee.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao;
	String status;

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	public String insertEmployee(Employee employee)
			throws EmployeeServiceException {

		try {

			employeeDao.insertEmployee(employee);
		} catch (EmployeeDaoException ede) {
			throws new EmployeeServiceException("serviceerror",ede);
		}
		status=EmployeeConstants.EMPLOYEE_INSERT_SUCCESS;
		return status;

	}

	@Override
	public List<Employee> searchEmployee(Employee employee)
			throws EmployeeServiceException {

		List<Employee> employeeList = null;

		try {

			employeeList = employeeDao.searchEmployee(employee);
		} catch (EmployeeDaoException ede) {
			throw new EmployeeServiceException("service", ede);
		}
		return employeeList;
	}
}
