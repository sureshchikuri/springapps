package com.gsb.emplloyee.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.gsb.employee.model.Employee;

public class EmployeeDaoImpl extends HibernateDaoSupport implements EmployeeDao {

	@Override
	public void insertEmployee(Employee employee) {

	}

	@Override
	public List searchEmployee(Employee employee) {

		return null;
	}

	@Override
	public List getManage(String Ismanager) {
		return null;
	}

}
