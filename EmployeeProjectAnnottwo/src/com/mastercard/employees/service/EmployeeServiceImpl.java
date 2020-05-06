package com.mastercard.employees.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.entity.Employee1;
import com.mastercard.employees.dao.EmployeeDao;
import com.mastercard.employees.exception.EmployeeServiceException;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
	
	private static Logger log=Logger.getLogger(EmployeeServiceImpl.class);
	
	private EmployeeDao employeeDao;
	
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Transactional(propagation=Propagation.REQUIRED)
	public void deleteEmployee(Integer empId) throws EmployeeServiceException {

		if(empId==null){
			throw new EmployeeServiceException(200,"Invalid input.");
		}
		employeeDao.deleteEmployee(empId);
	}

	@Override
	public Employee1 getEmployee(Integer empId) throws EmployeeServiceException {

		Employee1 employee1=null;
		
		if(empId==null){
			throw new EmployeeServiceException(200,"Invalid input.");
		}
		employee1=employeeDao.getEmployee(empId);
		if(employee1==null){
			throw new EmployeeServiceException(200," Employee Record does not exist");
		}
		return employee1;
	}

	@Override
	public List<Employee1> getEmployees() throws EmployeeServiceException {

		List<Employee1> employees=null;
		employees=employeeDao.getEmployees();
		if(employees==null ||employees.isEmpty()){
			throw new EmployeeServiceException(200," Employee Record  not Found");
		}
		return employees;
	}

	@Override
	public Employee1 getManager(Integer empId) throws EmployeeServiceException {

		Employee1 employee1=null;
		
		if(empId==null){
			throw new EmployeeServiceException(200,"Invalid input.");
		}
		employee1=employeeDao.getManager(empId);
		if(employee1==null){
			throw new EmployeeServiceException(200," Manager Record  not Found");
		}
		return employee1;
	}

	@Override
	public List<Employee1> getManagerReportees(Integer empId)
			throws EmployeeServiceException {

		if(empId==null){
			throw new EmployeeServiceException(200,"Invalid input.");
		}
		return employeeDao.getManagerReportees(empId);
	}

	@Transactional(propagation=Propagation.REQUIRED)
	public void updateEmployee(Employee1 employee1)
			throws EmployeeServiceException {

		Employee1 tempRecord=getEmployee(employee1.getEmpId());
		tempRecord.setSalary(employee1.getSalary());
		employeeDao.updateEmployee(tempRecord);
	}

}
