package com.vcs.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Employee entity. @author MyEclipse Persistence Tools
 */

public class Employee implements java.io.Serializable {

	// Fields

	private Integer empId;
	private Employee employee;
	private String team;
	private String firstName;
	private String lastName;
	private String ntLogin;
	private String isActive;
	private Long mobile;
	private String email;
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
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
	public String getNtLogin() {
		return ntLogin;
	}
	public void setNtLogin(String ntLogin) {
		this.ntLogin = ntLogin;
	}
	public String getIsActive() {
		return isActive;
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Employee [email=" + email + ", empId=" + empId + ", employee="
				+ employee + ", firstName=" + firstName + ", isActive="
				+ isActive + ", lastName=" + lastName + ", mobile=" + mobile
				+ ", ntLogin=" + ntLogin + ", team=" + team + "]";
	}

	
}