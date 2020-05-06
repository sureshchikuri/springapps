package com.service;

import java.util.List;

import com.entity.RoleEntity;


public interface RoleManager {


	public List<RoleEntity> getAllRoles();

	public void deleteRole(Integer rid);

	public RoleEntity getRole(Integer rid);

	public void persistRole(RoleEntity role);
}
