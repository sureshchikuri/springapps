package com.vcs.validator;

import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.vcs.command.Employee;

public class EmployeeValidator implements Validator {

	@Override
	public boolean supports(Class clazz) {
		return clazz.equals(Employee.class);
	}

	@Override
	public void validate(Object command, Errors error) {

		Employee employee=(Employee) command;
		
		if(!StringUtils.hasLength(employee.getEmpId())){
			error.rejectValue("empId", "error.empId", "EmployeeId is Required");
		}
		
	}

}
