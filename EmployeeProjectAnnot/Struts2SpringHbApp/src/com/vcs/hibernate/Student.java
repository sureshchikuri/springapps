package com.vcs.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "STUDENT", schema = "SYSTEM")
public class Student implements java.io.Serializable {

	// Fields

	private Long studentNo;
	private String studentName;

	// Constructors

	/** default constructor */
	public Student() {
	}

	/** minimal constructor */
	public Student(Long studentNo) {
		this.studentNo = studentNo;
	}

	/** full constructor */
	public Student(Long studentNo, String studentName) {
		this.studentNo = studentNo;
		this.studentName = studentName;
	}

	// Property accessors
	@Id
	@Column(name = "SNO", unique = true, nullable = false, precision = 10, scale = 0)
	public Long getStudentNo() {
		return this.studentNo;
	}

	public void setStudentNo(Long studentNo) {
		this.studentNo = studentNo;
	}

	@Column(name = "SNAME", length = 25)
	public String getStudentName() {
		return this.studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}