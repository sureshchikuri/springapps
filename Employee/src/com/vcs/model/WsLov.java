package com.vcs.model;

/**
 * WsLov entity. @author MyEclipse Persistence Tools
 */

public class WsLov implements java.io.Serializable {

	// Fields

	private Integer id;
	private String key;
	private String value;
	private String type;

	// Constructors

	/** default constructor */
	public WsLov() {
	}

	/** minimal constructor */
	public WsLov(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public WsLov(Integer id, String key, String value, String type) {
		this.id = id;
		this.key = key;
		this.value = value;
		this.type = type;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
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