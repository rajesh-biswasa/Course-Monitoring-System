package com.project.dao;


import com.project.bean.Admin;
import com.project.exceptions.AdminException;

public interface AdminDao  {
	
	
	public Admin loginAdmin(String username,String password)throws AdminException;
	
	public void logoutAdmin() throws AdminException;

}

