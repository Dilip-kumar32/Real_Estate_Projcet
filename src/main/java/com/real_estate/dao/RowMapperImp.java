package com.real_estate.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.real_estate.models.*;
import org.springframework.jdbc.core.RowMapper;



public class RowMapperImp implements RowMapper<User> {

	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User s=new User();
		s.setId(rs.getInt(1));
		s.setUser_name(rs.getString(5));
		s.setUser_email(rs.getString(3));
		s.setUser_password(rs.getString(6));
		s.setUser_address(rs.getString(2));
		s.setUser_phone(rs.getString(7));
		s.setUser_photo(rs.getString(8));
		s.setUser_gender(rs.getString(4));
		
		return s;
	}
	

}
