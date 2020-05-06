package com.ws.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ws.spring.dao.EmployeeDao;
import com.ws.spring.model.Employee;

@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeDao empDao;

	@Override
	public String createEmployee(Employee emp) {
		// TODO Auto-generated method stub
		String result;
		
		result=empDao.createEmployee(emp);
		
		return result;
	}
	
	

}
