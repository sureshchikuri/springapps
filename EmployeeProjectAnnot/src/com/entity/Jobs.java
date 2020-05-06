package com.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Jobs entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "JOBS", schema = "SYSTEM")
public class Jobs implements java.io.Serializable {

	// Fields

	private Byte jobId;
	private String title;
	private String grade;
	private Set<Employee1> employee1s = new HashSet<Employee1>(0);

	// Constructors

	/** default constructor */
	public Jobs() {
	}

	/** minimal constructor */
	public Jobs(Byte jobId, String title, String grade) {
		this.jobId = jobId;
		this.title = title;
		this.grade = grade;
	}

	/** full constructor */
	public Jobs(Byte jobId, String title, String grade,
			Set<Employee1> employee1s) {
		this.jobId = jobId;
		this.title = title;
		this.grade = grade;
		this.employee1s = employee1s;
	}

	// Property accessors
	@Id
	@Column(name = "JOB_ID", unique = true, nullable = false, precision = 2, scale = 0)
	public Byte getJobId() {
		return this.jobId;
	}

	public void setJobId(Byte jobId) {
		this.jobId = jobId;
	}

	@Column(name = "TITLE", nullable = false, length = 20)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "GRADE", nullable = false, length = 1)
	public String getGrade() {
		return this.grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "jobs")
	public Set<Employee1> getEmployee1s() {
		return this.employee1s;
	}

	public void setEmployee1s(Set<Employee1> employee1s) {
		this.employee1s = employee1s;
	}

}