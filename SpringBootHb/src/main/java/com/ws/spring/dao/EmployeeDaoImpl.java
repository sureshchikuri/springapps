package com.ws.spring.dao;

import org.springframework.stereotype.Repository;

import com.ws.spring.model.Employee;

@Repository
public class EmployeeDaoImpl extends AbstractDao implements EmployeeDao {

	@Override
	public String createEmployee(Employee emp) {
		// TODO Auto-generated method stub
		String result="success";
		
		getSession().save(emp);
		
		return result;
	}

	
}
