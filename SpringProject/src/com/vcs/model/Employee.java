package com.vcs.model;

/**
 * Employee entity. @author MyEclipse Persistence Tools
 */

public class Employee implements java.io.Serializable {

	// Fields

	private Integer empId;
	private String empName;
	private String empSal;

	// Constructors

	/** default constructor */
	public Employee() {
	}

	/** minimal constructor */
	public Employee(Integer empId, String empSal) {
		this.empId = empId;
		this.empSal = empSal;
	}

	/** full constructor */
	public Employee(Integer empId, String empName, String empSal) {
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}

	// Property accessors

	public Integer getEmpId() {
		return this.empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return this.empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpSal() {
		return this.empSal;
	}

	public void setEmpSal(String empSal) {
		this.empSal = empSal;
	}

}