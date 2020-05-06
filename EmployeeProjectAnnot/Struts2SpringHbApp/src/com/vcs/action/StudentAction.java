package com.vcs.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.vcs.hibernate.Student;
import com.vcs.service.StudentService;


@Action(value="StudentAction",results={
		@Result(name="success",location="/success.jsp"),
		@Result(name="error",location="/error.jsp")})

public class StudentAction {

	private StudentService studentService;
	private Student student;

	public void setStudent(Student student) {
		this.student = student;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	public Student getStudent() {
		return student;
	}
	
	public String execute(){
		
		studentService.insertStudent(student);
		return "success";
	}
}
