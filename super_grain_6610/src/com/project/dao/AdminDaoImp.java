package com.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.project.bean.Admin;
import com.project.exceptions.AdminException;
import com.project.main.UserActivity;
import com.project.utility.DBUtil;

public class AdminDaoImp implements AdminDao{

	@Override
	public Admin loginAdmin(String username, String password) throws AdminException {		

		
		Admin admin=null;		
		
		try(Connection conn=DBUtil.provideConnection()){
			PreparedStatement ps= conn.prepareStatement("select * from admin where username=? AND password=?");
			
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
				int id= rs.getInt("id");
				String user= rs.getString("username");				
				String pass= rs.getString("password");
				
				admin=new Admin(id, user, pass);
			}else {
				throw new AdminException("Invalid username or password!");
			}
			
			
		} catch (SQLException e) {
			throw new AdminException(e.getMessage());
		}
		
		
		
		return admin;
	}

	@Override
	public void logoutAdmin() throws AdminException{
		
		UserActivity.selectUser();
	}	

}
