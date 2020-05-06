package com.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.entity.RoleEntity;

@Repository
public class RoleDaoImpl implements RoleDao {

	private SessionFactory sessionFactory;

	@Override
	public void deleteRole(Integer rid) {

		this.sessionFactory.getCurrentSession().delete(rid);
	}

	@Override
	public List<RoleEntity> getAllRoles() {

		return this.sessionFactory.getCurrentSession().createQuery(
				"from RoleEntity").list();
	}

	@Override
	public RoleEntity getRole(Integer rid) {

		RoleEntity role = (RoleEntity) this.sessionFactory.getCurrentSession().get(
				RoleEntity.class, rid);
		return role;
	}

	@Override
	public void persistRole(RoleEntity role) {

		this.sessionFactory.getCurrentSession().saveOrUpdate(role);
	}

}
