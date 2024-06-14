package com.real_estate.dao;


import java.util.List;

import javax.transaction.Transactional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate5.HibernateTemplate;

import org.springframework.stereotype.Repository;


import com.real_estate.models.User;
import com.real_estate.dao.RowMapperImp;


@Repository
public class UserDao  {
	
	@Autowired
	private HibernateTemplate hibernatetemplate;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
//	use to save and update data in database
	@Transactional
	public void createUser(User user) {
		this.hibernatetemplate.saveOrUpdate(user);
	}
	
//	get all users
	public List<User> getAllUsers(){
		List<User> p=this.hibernatetemplate.loadAll(User.class);
		return p;
	}
	
	
//	check user is valid or not login
	public User loginUser(String email,String password) {
		email = email != "" ? email : "rfa@gmail.com";
		password = password != "" ? password : "Mr."; 
		String q="select * from user where user_email=? and user_password=?";
//		RowMapper<User> rowMapper = new RowMapperImp();
		try {
		User u=this.jdbcTemplate.queryForObject(q, new RowMapperImp(),email,password);
		
		if(u!=null)
			return u;
		}
		catch(Exception e){
			return null;
		}
		return null;
			
	}
	
//	delete the single product
	@Transactional
	public void deleteProduct(int uid) {
		User u=this.hibernatetemplate.load(User.class, uid);
		this.hibernatetemplate.delete(u);
	}

	
	@Transactional
	public void updateUser(User user) {
		this.hibernatetemplate.update(user);
	
	}
	
	

}
;