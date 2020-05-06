package com.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Address entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "ADDRESS", schema = "SYSTEM")
public class Address implements java.io.Serializable {

	// Fields

	private AddressId id;
	private Employee1 employee1;
	private String addLine1;
	private String addLine2;
	private String city;
	private String state;
	private String country;
	private Integer zip;
	private Long phone;

	// Constructors

	/** default constructor */
	public Address() {
	}

	/** full constructor */
	public Address(AddressId id, Employee1 employee1, String addLine1,
			String addLine2, String city, String state, String country,
			Integer zip, Long phone) {
		this.id = id;
		this.employee1 = employee1;
		this.addLine1 = addLine1;
		this.addLine2 = addLine2;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zip = zip;
		this.phone = phone;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "empId", column = @Column(name = "EMP_ID", nullable = false, precision = 6, scale = 0)),
			@AttributeOverride(name = "addType", column = @Column(name = "ADD_TYPE", nullable = false, length = 1)) })
	public AddressId getId() {
		return this.id;
	}

	public void setId(AddressId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EMP_ID", nullable = false, insertable = false, updatable = false)
	public Employee1 getEmployee1() {
		return this.employee1;
	}

	public void setEmployee1(Employee1 employee1) {
		this.employee1 = employee1;
	}

	@Column(name = "ADD_LINE_1", nullable = false, length = 20)
	public String getAddLine1() {
		return this.addLine1;
	}

	public void setAddLine1(String addLine1) {
		this.addLine1 = addLine1;
	}

	@Column(name = "ADD_LINE_2", nullable = false, length = 20)
	public String getAddLine2() {
		return this.addLine2;
	}

	public void setAddLine2(String addLine2) {
		this.addLine2 = addLine2;
	}

	@Column(name = "CITY", nullable = false, length = 20)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "STATE", nullable = false, length = 20)
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "COUNTRY", nullable = false, length = 20)
	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Column(name = "ZIP", nullable = false, precision = 6, scale = 0)
	public Integer getZip() {
		return this.zip;
	}

	public void setZip(Integer zip) {
		this.zip = zip;
	}

	@Column(name = "PHONE", nullable = false, precision = 10, scale = 0)
	public Long getPhone() {
		return this.phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

}