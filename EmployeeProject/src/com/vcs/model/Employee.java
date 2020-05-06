package com.vcs.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Employee entity. @author MyEclipse Persistence Tools
 */

public class Employee implements java.io.Serializable {

	// Fields

	private Integer employeeId;
	private Employee employee;
	private String team;
	private String firstName;
	private String lastName;
	private Integer ntlogin;
	private String isActive;
	private Integer mobile;
	private String email;
	private String isManager;
	
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getNtlogin() {
		return ntlogin;
	}
	public void setNtlogin(Integer ntlogin) {
		this.ntlogin = ntlogin;
	}

	public Integer getMobile() {
		return mobile;
	}
	public void setMobile(Integer mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getIsManager() {
		return isManager;
	}
	public void setIsManager(String isManager) {
		this.isManager = isManager;
	}
	@Override
	public String toString() {
		return "Employee [email=" + email + ", employee=" + employee
				+ ", employeeId=" + employeeId + ", firstName=" + firstName
				+ ", isManager=" + isManager + ", isactive=" + isActive
				+ ", lastName=" + lastName + ", mobile=" + mobile
				+ ", ntlogin=" + ntlogin + ", team=" + team + "]";
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	public String getIsActive() {
		return isActive;
	}

	
}