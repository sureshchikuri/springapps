package com.vcs.contrlr;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Employee entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "EMPLOYEE", schema = "SYSTEM")
public class Employee implements java.io.Serializable {

	// Fields

	private Integer empId;
	private String empName;
	private String empsal;

	// Constructors

	/** default constructor */
	public Employee() {
	}

	/** minimal constructor */
	public Employee(Integer empId, String empsal) {
		this.empId = empId;
		this.empsal = empsal;
	}

	/** full constructor */
	public Employee(Integer empId, String empName, String empsal) {
		this.empId = empId;
		this.empName = empName;
		this.empsal = empsal;
	}

	// Property accessors
	@Id
	@Column(name = "EMPID", unique = true, nullable = false, precision = 5, scale = 0)
	public Integer getEmpId() {
		return this.empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	@Column(name = "EMPNAME", length = 20)
	public String getEmpName() {
		return this.empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Column(name = "SALARY", nullable = false, length = 10)
	public String getEmpsal() {
		return this.empsal;
	}

	public void setEmpsal(String empsal) {
		this.empsal = empsal;
	}

}