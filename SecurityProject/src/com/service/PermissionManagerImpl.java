package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.PermissionDao;
import com.entity.PermissionEntity;

@Service
public class PermissionManagerImpl implements PermissionManager{

	@Autowired
	private PermissionDao permissionDao;
	
	
	@Override
	@Transactional
	public void deletePermission(Integer pid) {

		permissionDao.deletePermission(pid);
	}

	@Override
	@Transactional
	public List getAllPermissions() {

		return permissionDao.getAllPermissions();
	}

	@Override
	public PermissionEntity getPermission(Integer pid) {

		return permissionDao.getPermission(pid);
	}

	@Override
	public void persistPermission(PermissionEntity permission) {

		permissionDao.persistPermission(permission);
	}

}
