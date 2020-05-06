package com.vcs.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.vcs.model.Employee;

public class EmployeeDao extends HibernateDaoSupport {
	
	public void insertEmployee(Employee employee) {
		
		getSession().save(employee);
		
	}

	public List<Employee> selectEmployee(Integer empId) {
		
		List<Employee> empList=null;
		
		Criteria criteria=getSession().createCriteria(Employee.class).add(Restrictions.eq("empId", empId));
		
		empList=criteria.list();
		
		return empList;
		
	}

}
