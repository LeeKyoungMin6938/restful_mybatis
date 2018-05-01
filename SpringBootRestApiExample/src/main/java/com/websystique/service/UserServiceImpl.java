package com.websystique.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.websystique.model.User;
import com.websystique.repository.UserMapper;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> findAllUsers(){
		return userMapper.findAllUsers();
	}
	
	@Override
	public User selectById(long id) {
		return userMapper.selectById(id);
	}
	
	@Override
	public void saveUser(User user) {
		userMapper.saveUser(user);
	}
	
	@Override
	public void updateUser(User user) {
		userMapper.updateUser(user);		
	}
	
	@Override
	public void deleteUserById(long id) {
		userMapper.deleteById(id);
	}
	
	@Override
	public void deleteAllUsers() {
		userMapper.deleteAllUsers();		
	}
	
	@Override
	public boolean isUserExist(User user) {
		if(user == null) {
			return false;
		} else {
			return true;
		}
	}
}
