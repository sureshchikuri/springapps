package com.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AddressId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class AddressId implements java.io.Serializable {

	// Fields

	private Integer empId;
	private String addType;

	// Constructors

	/** default constructor */
	public AddressId() {
	}

	/** full constructor */
	public AddressId(Integer empId, String addType) {
		this.empId = empId;
		this.addType = addType;
	}

	// Property accessors

	@Column(name = "EMP_ID", nullable = false, precision = 6, scale = 0)
	public Integer getEmpId() {
		return this.empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	@Column(name = "ADD_TYPE", nullable = false, length = 1)
	public String getAddType() {
		return this.addType;
	}

	public void setAddType(String addType) {
		this.addType = addType;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AddressId))
			return false;
		AddressId castOther = (AddressId) other;

		return ((this.getEmpId() == castOther.getEmpId()) || (this.getEmpId() != null
				&& castOther.getEmpId() != null && this.getEmpId().equals(
				castOther.getEmpId())))
				&& ((this.getAddType() == castOther.getAddType()) || (this
						.getAddType() != null
						&& castOther.getAddType() != null && this.getAddType()
						.equals(castOther.getAddType())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getEmpId() == null ? 0 : this.getEmpId().hashCode());
		result = 37 * result
				+ (getAddType() == null ? 0 : this.getAddType().hashCode());
		return result;
	}

}