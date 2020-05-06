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
 * Company entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "COMPANY", schema = "SYSTEM")
public class Company implements java.io.Serializable {

	// Fields

	private Short companyId;
	private String name;
	private Set<Employee1> employee1s = new HashSet<Employee1>(0);

	// Constructors

	/** default constructor */
	public Company() {
	}

	/** minimal constructor */
	public Company(Short companyId, String name) {
		this.companyId = companyId;
		this.name = name;
	}

	/** full constructor */
	public Company(Short companyId, String name, Set<Employee1> employee1s) {
		this.companyId = companyId;
		this.name = name;
		this.employee1s = employee1s;
	}

	// Property accessors
	@Id
	@Column(name = "COMPANY_ID", unique = true, nullable = false, precision = 4, scale = 0)
	public Short getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(Short companyId) {
		this.companyId = companyId;
	}

	@Column(name = "NAME", nullable = false, length = 20)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "company")
	public Set<Employee1> getEmployee1s() {
		return this.employee1s;
	}

	public void setEmployee1s(Set<Employee1> employee1s) {
		this.employee1s = employee1s;
	}

}