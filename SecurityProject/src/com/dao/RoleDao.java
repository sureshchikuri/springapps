package com.dao;

import java.util.List;

import com.entity.RoleEntity;

public interface RoleDao {

	public List<RoleEntity> getAllRoles();

	public void deleteRole(Integer rid);

	public RoleEntity getRole(Integer rid);

	public void persistRole(RoleEntity role);
}
