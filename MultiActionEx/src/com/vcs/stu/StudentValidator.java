package com.vcs.stu;

import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class StudentValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return clazz.equals(Student.class);
	}

	@Override
	public void validate(Object command, Errors errors) {
		
		Student student=(Student) command;
		if(!StringUtils.hasLength(student.getStudentno()))
		{
			errors.rejectValue("studentno", "errors.studentno", "StudentNO is requiered");
			
		}

	}

}
