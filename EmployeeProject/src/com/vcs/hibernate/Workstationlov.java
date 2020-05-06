package com.vcs.hibernate;

/**
 * Workstationlov entity. @author MyEclipse Persistence Tools
 */

public class Workstationlov implements java.io.Serializable {

	// Fields

	private Short id;
	private String key;
	private String value;
	private String type;

	// Constructors

	/** default constructor */
	public Workstationlov() {
	}

	/** minimal constructor */
	public Workstationlov(Short id) {
		this.id = id;
	}

	/** full constructor */
	public Workstationlov(Short id, String key, String value, String type) {
		this.id = id;
		this.key = key;
		this.value = value;
		this.type = type;
	}

	// Property accessors

	public Short getId() {
		return this.id;
	}

	public void setId(Short id) {
		this.id = id;
	}

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}