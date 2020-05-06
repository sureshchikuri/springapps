package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.RoleDao;
import com.entity.RoleEntity;

@Service
public class RoleManagerImpl implements RoleManager {

	@Autowired
	private RoleDao roleDao;
	
	@Override
	@Transactional
	public void deleteRole(Integer rid) {

		roleDao.deleteRole(rid);
	}

	@Override
	@Transactional
	public List<RoleEntity> getAllRoles() {

		return roleDao.getAllRoles();
	}

	@Override
	@Transactional
	public RoleEntity getRole(Integer rid) {

		return roleDao.getRole(rid);
	}

	@Override
	@Transactional
	public void persistRole(RoleEntity role) {

		roleDao.persistRole(role);
	}

}
