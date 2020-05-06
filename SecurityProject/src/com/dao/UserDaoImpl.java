package com.dao;

import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.entity.UserEntity;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void deleteUser(Integer userId) {

		UserEntity user = (UserEntity) this.sessionFactory.getCurrentSession().load(
				UserEntity.class, userId);
		if(null!=user){
			this.sessionFactory.getCurrentSession().delete(user);
		}
	}

	@Override
	public List<UserEntity> getAllUsers() {
		return this.sessionFactory.getCurrentSession().createQuery(
		"from UserEntity").list();
	}

	@Override
	public UserEntity getUser(Integer userId) {
		UserEntity user = (UserEntity) this.sessionFactory.getCurrentSession().get(
				UserEntity.class, userId);
		return user;
	}

	@Override
	public UserEntity getUser(String userName, String password) {

		Session session= sessionFactory.getCurrentSession();
		
		Criteria crt=session.createCriteria(UserEntity.class);
		crt.add(Restrictions.eq("username", userName));
		crt.add(Restrictions.eq("password", password));
		
		return (UserEntity)crt.uniqueResult();
	}

	@Override
	public void persistUser(UserEntity user) {

		this.sessionFactory.getCurrentSession().saveOrUpdate(user);
	}

}
