package com.real_estate.dao;


import com.real_estate.models.User;

import java.util.List;


public interface UserDaoI  {
	public void createUser(User user);
	public List<User> getAllUsers();
	public User loginUser(String email,String password);
	public void updateUser(User user);
	
}
