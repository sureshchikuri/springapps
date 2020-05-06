package com.vcs.java;

public class College {
	
	private Student student;
	private String name;
	
	public College(Student student) {
		// TODO Auto-generated constructor stub
		
		this.student = student; 
	}

	public College(Student student, String name) {
		super();
		this.student = student;
		this.name = name;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "College [student=" + student + ", name=" + name + "]";
	}
	
	

}
