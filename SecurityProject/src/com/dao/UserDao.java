package com.dao;

import java.util.List;

import com.entity.UserEntity;

public interface UserDao {

	public void persistUser(UserEntity user);

	public List<UserEntity> getAllUsers();

	public void deleteUser(Integer userId);

	public UserEntity getUser(Integer userId);

	public UserEntity getUser(String userName, String password);
}
