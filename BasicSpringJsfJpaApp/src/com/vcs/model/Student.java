package com.vcs.model;

import com.vcs.service.Service;

public class Student {
	
	private Service service;
	private String studentNo;
	
	private String studentName;

	public void setService(Service service) {
		this.service = service;
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	
	public String execute() 
	{
		service.serviceMethod();
		return "success";
	}

}
