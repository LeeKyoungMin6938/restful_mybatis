package com.websystique.service;

import java.util.List;

import com.websystique.model.User;

public interface UserService {
	public List<User> findAllUsers();
	public User selectById(long id);	
	public void saveUser(User user);
	public void updateUser(User currentUser);
	public void deleteUserById(long id);
	public void deleteAllUsers();
	public boolean isUserExist(User user);
}
