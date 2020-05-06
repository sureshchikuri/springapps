package com.entity;

// default package

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * PermissionEntity entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "PERMISSIONS", schema = "SYSTEM")
public class PermissionEntity implements java.io.Serializable {

	// Fields
	@Id
	@Column(name = "PERMISSION_ID")
	@GeneratedValue
	private Integer pid;

	@Column(name = "PERMISSION_NAME")
	private String name;

	@ManyToMany(mappedBy = "permissions")
	private Set<RoleEntity> roles;

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<RoleEntity> getRoles() {
		return roles;
	}

	public void setRoles(Set<RoleEntity> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return getName();
	}

	@Override
	public boolean equals(Object obj) {
		return getName().equals(((PermissionEntity)obj).getName());
	}
	
	@Override
	public int hashCode() {
		return 1;
	}
}