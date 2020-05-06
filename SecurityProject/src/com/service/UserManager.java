package com.service;

import java.util.List;

import com.entity.UserEntity;

public interface UserManager {

	public void persistUser(UserEntity user);

	public List<UserEntity> getAllUsers();

	public void deleteUser(Integer userId);

	public UserEntity getUser(Integer userId);

	public UserEntity login(String userName, String password);
}
