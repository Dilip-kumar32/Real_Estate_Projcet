package com.real_estate.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.real_estate.dao.UserDao;
import com.real_estate.models.User;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public void SaveUsers(User user) {
		this.userDao.createUser(user);
	}
	public User loginUsers(String email,String password) {
		User user=this.userDao.loginUser(email, password);
		return user;
	}
	public void changeUser(User user) {
		this.userDao.updateUser(user);
	}
	
	
}
