package com.service;

import java.util.List;

import com.entity.PermissionEntity;

public interface PermissionManager {


	public List<PermissionEntity> getAllPermissions();

	public void deletePermission(Integer pid);

	public PermissionEntity getPermission(Integer pid);

	public void persistPermission(PermissionEntity permission);
	
}