package com.vcs.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.vcs.model.Student;


@Action(value="StudentAction",results={
		@Result(name="success",location="/success.jsp"),
		@Result(name="error",location="/error.jsp")})

public class StudentAction {

	private Student student;

	public void setStudent(Student student) {
		this.student = student;
	}

	public Student getStudent() {
		return student;
	}
	
	public String execute(){
		
		return "success";
	}
}
