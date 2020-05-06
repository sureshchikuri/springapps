package com.gsb.emplloyee.dao;

import java.util.List;

import com.gsb.employee.model.Employee;

public interface EmployeeDao {

	public void insertEmployee(Employee employee);

	public List<Employee> searchEmployee(Employee employee);

	public List getManage(String Ismanager);

}
