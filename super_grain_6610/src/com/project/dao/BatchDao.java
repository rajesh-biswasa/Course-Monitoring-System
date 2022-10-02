package com.project.dao;

import java.util.List;

import com.project.bean.Batch;
import com.project.bean.ReportForBatchDTO;
import com.project.exceptions.BatchException;

public interface BatchDao {

	
	public boolean isCourseIdPresent(int courseId) throws BatchException;

	
	public boolean isFacultyIdPresent(int facultyId) throws BatchException;

	
	public boolean isBatchNameUnique(String name) throws BatchException;

	
	public String createBatch(Batch batch) throws BatchException;

	
	public String upadteBatchByName(String old_name, Batch batch) throws BatchException;


	public List<Batch> viewAllBatchDetails() throws BatchException;

	
	public String batchDeleteByName() throws BatchException;

	
	public List<ReportForBatchDTO> coursePlanReportForBatch() throws BatchException;
	
	
	public List<Batch> availableBatch() throws BatchException;

}
