package com.vcs.stu;

/**
 * Student1 entity. @author MyEclipse Persistence Tools
 */

public class Student1 implements java.io.Serializable {

	// Fields

	private String studentno;
	private String studentname;

	// Constructors

	/** default constructor */
	public Student1() {
	}

	/** minimal constructor */
	public Student1(String studentno) {
		this.studentno = studentno;
	}

	/** full constructor */
	public Student1(String studentno, String studentname) {
		this.studentno = studentno;
		this.studentname = studentname;
	}

	// Property accessors

	public String getStudentno() {
		return this.studentno;
	}

	public void setStudentno(String studentno) {
		this.studentno = studentno;
	}

	public String getStudentname() {
		return this.studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

}