package com.project.dao;

import java.util.List;

import com.project.bean.CoursePlan;
import com.project.bean.ReportDayWiseDTO;
import com.project.exceptions.CoursePlanException;

public interface CoursePlanDao {

	public boolean isBatchIdAvailable(int id) throws CoursePlanException;

	public String createCoursePlan(CoursePlan coursePlan) throws CoursePlanException;

	public boolean isPlanIdAvailable(int id) throws CoursePlanException;

	public String upadteCoursePlanById(int id, CoursePlan coursePlan) throws CoursePlanException;

	public List<CoursePlan> viewAllCoursePlanDetails() throws CoursePlanException;

	public String coursePlanDeleteById() throws CoursePlanException;

	public List<ReportDayWiseDTO> dayWiseCoursePlanForBatch() throws CoursePlanException;

	public List<CoursePlan> pendingCoursePlan() throws CoursePlanException;

	public String updateCoursePlanStatus(int id) throws CoursePlanException;

	public boolean isIdAvaillableAndStatusPending(int id) throws CoursePlanException;
}

