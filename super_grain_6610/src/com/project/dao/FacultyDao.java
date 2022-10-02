package com.project.dao;

import java.util.List;

import com.project.bean.Faculty;
import com.project.exceptions.FacultyException;

public interface FacultyDao {

	public Faculty loginFaculty(String username, String password) throws FacultyException;

	public void logoutFaculty() throws FacultyException;

	public String registerFaculty(Faculty faculty) throws FacultyException;

	public String upadteFacultyById(int id, Faculty faculty) throws FacultyException;

	public List<Faculty> viewAllFaculty() throws FacultyException;

	public String deleteFacultyById() throws FacultyException;

	public boolean checkUsernamePassword(String username, String old_password) throws FacultyException;

	public String updateFacultyPassword(String username, String new_password) throws FacultyException;

}

