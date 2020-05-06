package com.gsb.employee.lovMappings;

public class PropertiesLov implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Short id;
	private String key;
	private String type;
	private String value;

	// Constructors

	/** default constructor */
	public PropertiesLov() {
	}

	/** minimal constructor */
	public PropertiesLov(Short id) {
		this.id = id;
	}

	/** full constructor */
	public PropertiesLov(Short id, String key, String type, String value) {
		this.id = id;
		this.key = key;
		this.type = type;
		this.value = value;
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

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}