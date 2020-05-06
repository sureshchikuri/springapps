package com.vcs.command;

import com.vcs.hibernate.Employee;

public class EmployeeCommand {

	private String employeeId;
	private String team;
	private String firstName;
	private String lastName;
	private String ntLogin;
	private String isActive;
	private String mobile;
	private String email;
	private String isManager;
	private String manager;
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
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
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	@Override
	public String toString() {
		return "EmployeeCommand [email=" + email + ", employeeId=" + employeeId
				+ ", firstName=" + firstName + ", isActive=" + isActive
				+ ", isManager=" + isManager + ", lastName=" + lastName
				+ ", manager=" + manager + ", mobile=" + mobile + ", ntLogin="
				+ ntLogin + ", team=" + team + "]";
	}
	
	
}
