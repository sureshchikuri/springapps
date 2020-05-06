package com.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Employee1 entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "EMPLOYEE1", schema = "SYSTEM")
public class Employee1 implements java.io.Serializable {

	// Fields

	private Integer empId;
	private Company company;
	private Jobs jobs;
	private Employee1 manager;
	private String firstName;
	private String lastName;
	private Double salary;
	private Set<Employee1> employee1s = new HashSet<Employee1>(0);
	private Set<Address> addresses = new HashSet<Address>(0);

	// Constructors

	/** default constructor */
	public Employee1() {
	}

	/** minimal constructor */
	public Employee1(Integer empId, String firstName, String lastName,
			Double salary) {
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	// Property accessors
	@Id
	@Column(name = "EMP_ID", unique = true, nullable = false, precision = 6, scale = 0)
	public Integer getEmpId() {
		return this.empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "COMPANY_ID")
	public Company getCompany() {
		return this.company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "JOB_ID")
	public Jobs getJobs() {
		return this.jobs;
	}

	public void setJobs(Jobs jobs) {
		this.jobs = jobs;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "MGR_EMP_ID")
	public Employee1 getManager() {
		return this.manager;
	}

	public void setManager(Employee1 manager) {
		this.manager = manager;
	}

	@Column(name = "FIRST_NAME", nullable = false, length = 20)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "LAST_NAME", nullable = false, length = 20)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "SALARY", nullable = false, precision = 8)
	public Double getSalary() {
		return this.salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "employee1")
	public Set<Employee1> getEmployee1s() {
		return this.employee1s;
	}

	public void setEmployee1s(Set<Employee1> employee1s) {
		this.employee1s = employee1s;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="EMP_ID",referencedColumnName="EMP_ID")
	public Set<Address> getAddresses() {
		return this.addresses;
	}

	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}

}