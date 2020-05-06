package com.vcs.employee.validation;

import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.gsb.employee.command.EmployeeCommand;

public class EmployeeValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.equals(EmployeeCommand.class);
	}

	@Override
	public void validate(Object command, Errors errors) {
		EmployeeCommand employeeCommand = (EmployeeCommand) command;

		if (!StringUtils.hasLength(employeeCommand.getTeam())) {
			errors.rejectValue("team", "errors.team",
					"Employee Team is required");
		}

		if (!StringUtils.hasLength(employeeCommand.getFirstName())) {
			errors.rejectValue("firstName", "errors.firstName",
					"Employee firstName is required");
		}

		if (!StringUtils.hasLength(employeeCommand.getLastName())) {
			errors.rejectValue("lastName", "errors.lastName",
					"Employee lastName is required");
		}

		if (!StringUtils.hasLength(employeeCommand.getNtLogin())) {
			errors.rejectValue("ntLogin", "errors.ntLogin",
					"Employee NT Login is required");
		}

		if (!StringUtils.hasLength(employeeCommand.getIsActive())) {
			errors.rejectValue("isActive", "errors.team",
					"Employee isActive is required");
		}

		if (!StringUtils.hasLength(employeeCommand.getMobile())) {
			errors.rejectValue("mobile", "errors.team",
					"Employee mobile is required");
		}

		if (!StringUtils.hasLength(employeeCommand.getEmail())) {
			errors.rejectValue("email", "errors.team",
					"Employee email is required");
		}

		if (!StringUtils.hasLength(employeeCommand.getIsManager())) {
			errors.rejectValue("isManager", "errors.team",
					"Employee isManager is required");
		}

		if (!StringUtils.hasLength(employeeCommand.getManager())) {
			errors.rejectValue("manager", "errors.team",
					"Employee Manager is required");
		}

	}

}
