package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.UserDao;
import com.entity.UserEntity;

@Service
public class UserManagerImpl implements UserDao {

	@Autowired
	private UserDao userDao;

	@Transactional
	public void deleteUser(Integer userId) {
		userDao.deleteUser(userId);
	}

	@Transactional
	public List<UserEntity> getAllUsers() {
		return userDao.getAllUsers();
	}

	@Transactional
	public UserEntity getUser(Integer userId) {
		return userDao.getUser(userId);
	}

	@Transactional
	public UserEntity login(String userName, String password) {
		return userDao.getUser(userName, password);
	}

	@Transactional
	public void persistUser(UserEntity user) {

		userDao.persistUser(user);

	}

	@Override
	public UserEntity getUser(String userName, String password) {
		// TODO Auto-generated method stub
		return null;
	}

}
