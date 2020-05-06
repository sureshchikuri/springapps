package com.vcs.controller;

import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class StudentValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {

		return clazz.equals(Student.class);
	}

	@Override
	public void validate(Object arg0, Errors arg1) {

	}

	public void student(Object target, Errors errors) {

		Student student = (Student) target;

		if (!StringUtils.hasLength(student.getStudentNo())) {
			errors.rejectValue("studentNo", "errors.studentNo",
					"StudentNo is required");

		}

	}

	public void student1(Object target, Errors errors) {
		// TODO Auto-generated method stub

		Student student = (Student) target;

		if (!StringUtils.hasLength(student.getStudentName())) {
			errors.rejectValue("studentName", "errors.studentName",
					"StudentName is required");

		}
	}

}
