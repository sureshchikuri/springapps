package com.vcs.dao;

import java.util.List;

import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.vcs.model.Employee;

public class EmployeeDaoImpl extends HibernateDaoSupport implements EmployeeDao {

	@Override
	public void create(Employee employee) {

		getSession().save(employee);
	}

	@Override
	public List<Employee> searchEmployee(int employeeId) {
		List<Employee> employeeList = null;
		employeeList = getSession().createCriteria(Employee.class).add(
				Restrictions.eq("empId", employeeId)).list();
		return employeeList;
	}

}
