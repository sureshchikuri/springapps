package com.entity;

// default package

import java.util.HashSet;
import java.util.Hashtable;
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
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * UserEntity entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "USERS", schema = "SYSTEM")
public class UserEntity implements java.io.Serializable {

	// Fields
	@Id
	@Column(name = "USER_ID")
	@GeneratedValue
	private Integer userId;

	@Column(name = "ADDRESS")
	private String address;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "FIRSTNAME")
	private String firstname;

	@Column(name = "LASTNAME")
	private String lastname;

	@Column(name = "TEELEPHONE")
	private String telephone;

	@Column(name = "USERNAME")
	private String username;

	@Column(name = "PASSWORD")
	private String password;

	@Transient
	private int[] roleIds;

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "user_role", joinColumns = { @JoinColumn(name = "ROLE_ID", updatable = false) })
	private Set<RoleEntity> roles=new HashSet<RoleEntity>();

	// Constructors

	public int[] getRoleIds() {
		return roleIds;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<RoleEntity> getRoles() {
		return roles;
	}

	public void setRoles(Set<RoleEntity> roles) {
		this.roles = roles;
	}

	public void setRoleIds(int[] roleIds) {
		this.roleIds = roleIds;
	}

	public void addRole(RoleEntity role){
		this.roles.add(role);
	}

	@Override
	public String toString() {
		return "UserEntity [address=" + address + ", email=" + email
				+ ", firstname=" + firstname + ", lastname=" + lastname
				+ ", password=" + password + ", roleIds=" + roleIds
				+ ", roles=" + roles + ", telephone=" + telephone + ", userId="
				+ userId + ", username=" + username + "]";
	}
	
	
}