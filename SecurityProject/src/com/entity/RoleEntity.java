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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * RoleEntity entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "ROLES", schema = "SYSTEM")
public class RoleEntity implements java.io.Serializable {

	// Fields
	@Id
	@Column(name = "ROLE_ID")
	@GeneratedValue
	private Integer rid;
	
	@Transient
	private int[] pid;

	@Column(name = "ROLE_NAME")
	private String rName;

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "role_permissions", joinColumns = { @JoinColumn(name = "ROLE_ID") }, inverseJoinColumns = { @JoinColumn(name = "PERMISSION_ID") })
	private Set<PermissionEntity> Permissions = new HashSet<PermissionEntity>();

	public Set<PermissionEntity> getPermissions() {
		return Permissions;
	}

	public void setPermissions(Set<PermissionEntity> permissions) {
		Permissions = permissions;
	}

	@ManyToMany(mappedBy = "roles")
	private Set<UserEntity> users;

	public void setRid(Integer rid) {
		this.rid = rid;
	}

	public Integer getRid() {
		return rid;
	}

	public void setrName(String rName) {
		this.rName = rName;
	}

	public String getrName() {
		return rName;
	}

	public void addPermission(PermissionEntity permission){
		this.Permissions.add(permission);
	}

	public void setUsers(Set<UserEntity> users) {
		this.users = users;
	}

	public Set<UserEntity> getUsers() {
		return users;
	}

	public void setPid(int[] pid) {
		this.pid = pid;
	}

	public int[] getPid() {
		return pid;
	}
	
	public boolean hasPermission(String operationName){
		return Permissions.contains(operationName);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return rName+":"+Permissions;
	}
}