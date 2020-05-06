package com.vcs.stu;

import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class StudentValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub

		return clazz.equals(Student1.class);
	}

	@Override
	public void validate(Object command, Errors errors) {
		// TODO Auto-generated method stub
		
		Student1 student1=(Student1) command;
		
		if(!StringUtils.hasLength(student1.getStudentno()))
		{
			
			errors.rejectValue("studentno", "errors.studentno", "StudentNo is required");
		}
		
		if(!StringUtils.hasLength(student1.getStudentname()))
		{
			
			errors.rejectValue("studentname", "errors.studentname", "StudentName is required");
		}
		
		

	}

}
