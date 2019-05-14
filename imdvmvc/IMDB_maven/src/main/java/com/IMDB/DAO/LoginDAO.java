package com.IMDB.DAO;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.IMDB.model.Loginuser;

public class LoginDAO 
{
	 @Autowired
	  JdbcTemplate jdbcTemplate;

	
	public boolean check(Loginuser user)
	{
		
		String sql = "select * from users where username='" + user.getUsername()+ "' and password='" + user.getPassword()
	    + "'";
		ResultSet rs=s.executeQuery(sql);
		  String dname=user.getUsername();
		  String dpwd=user.getPassword();
		
		
		   
		return false;
		
	}

}
