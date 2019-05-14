package com.IMDB.wrapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.IMDB.model.Loginuser;

class UserMapper implements RowMapper<Loginuser> {
	  public Loginuser mapRow(ResultSet rs, int arg1) throws SQLException {
		  Loginuser user = new Loginuser();
	    user.setUsername(rs.getString("username"));
	    user.setPassword(rs.getString("password"));
	  
	    return user;
	  }
	}