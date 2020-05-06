package com.vcs.hibernate;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */

public class Student implements java.io.Serializable {

	// Fields

	private Long sno;
	private String sname;

	// Constructors

	/** default constructor */
	public Student() {
	}

	/** minimal constructor */
	public Student(Long sno) {
		this.sno = sno;
	}

	/** full constructor */
	public Student(Long sno, String sname) {
		this.sno = sno;
		this.sname = sname;
	}

	// Property accessors

	public Long getSno() {
		return this.sno;
	}

	public void setSno(Long sno) {
		this.sno = sno;
	}

	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

}