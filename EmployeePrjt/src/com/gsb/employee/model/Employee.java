package com.gsb.employee.model;

import java.util.HashSet;
import java.util.Set;

public class Employee implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer employeeId;
	private Employee employee;
	private String team;
	private String firstName;
	private String lastName;
	private String ntLogin;
	private String isActive;
	private Long mobile;
	private String email;
	private String isManager;
	private String manager;

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	private Set employees = new HashSet(0);

	// Constructors

	/** default constructor */
	public Employee() {
	}

	/** minimal constructor */
	public Employee(Integer employeeId) {
		this.employeeId = employeeId;
	}

	/** full constructor */
	public Employee(Integer employeeId, Employee employee, String team,
			String firstName, String lastName, String ntLogin, String isActive,
			Long mobile, String email, String isManager, Set employees) {
		this.employeeId = employeeId;
		this.employee = employee;
		this.team = team;
		this.firstName = firstName;
		this.lastName = lastName;
		this.ntLogin = ntLogin;
		this.isActive = isActive;
		this.mobile = mobile;
		this.email = email;
		this.isManager = isManager;
		this.employees = employees;
	}

	// Property accessors

	public Integer getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getTeam() {
		return this.team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNtLogin() {
		return this.ntLogin;
	}

	public void setNtLogin(String ntLogin) {
		this.ntLogin = ntLogin;
	}

	public String getIsActive() {
		return this.isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public Long getMobile() {
		return this.mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIsManager() {
		return this.isManager;
	}

	public void setIsManager(String isManager) {
		this.isManager = isManager;
	}

	public Set getEmployees() {
		return this.employees;
	}

	public void setEmployees(Set employees) {
		this.employees = employees;
	}

}