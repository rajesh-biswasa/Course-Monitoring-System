package com.project.dao;


import java.util.List;

import com.project.bean.Course;
import com.project.exceptions.CourseException;

public interface CourseDao {

	
	public boolean isNameUnique(String name) throws CourseException;

	public String createCourse(Course course) throws CourseException;

	public boolean isCourseNameAvailable(String name) throws CourseException;

	public String upadteCourseByName(String old_name, Course course) throws CourseException;

	public List<Course> viewAllCourseDetails() throws CourseException;

	public String courseDeleteByName() throws CourseException;

}

