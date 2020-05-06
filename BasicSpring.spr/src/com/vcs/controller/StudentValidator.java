package com.vcs.controller;

import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.vcs.model.Student;

public class StudentValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.equals(Student.class);
	}

	@Override
	public void validate(Object command, Errors errors) {

		Student student=(Student) command;
		if(!StringUtils.hasLength(student.getStudentNo())){
			errors.rejectValue("studentNo", "errors.studentNo", "StudentNo is Required");
		}
		if(!StringUtils.hasLength(student.getStudentName())){
			errors.rejectValue("studentName", "errors.studentName", "StudentName is Required");
		}
	}

}
