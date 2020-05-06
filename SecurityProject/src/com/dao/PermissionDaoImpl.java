package com.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.entity.PermissionEntity;

@Repository
public class PermissionDaoImpl implements PermissionDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void deletePermission(Integer pid) {

		this.sessionFactory.getCurrentSession().delete(pid);
	}

	@Override
	public List<PermissionEntity> getAllPermissions() {
		return this.sessionFactory.getCurrentSession().createQuery(
				"from PermissionEntity").list();
	}

	@Override
	public PermissionEntity getPermission(Integer pid) {

		PermissionEntity permission = (PermissionEntity) this.sessionFactory.getCurrentSession()
				.get(PermissionEntity.class, pid);
		return permission;
	}

	@Override
	public void persistPermission(PermissionEntity permission) {

		this.sessionFactory.getCurrentSession().saveOrUpdate(permission);
	}

}
