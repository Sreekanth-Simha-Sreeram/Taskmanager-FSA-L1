package com.task.hibirnate.service;

import java.util.Date;

public interface ProjectService {

	public void createProject(int projectId);
	public void allocateProject(int ProjectId);
	public void checkProjectStatus(Date startDate);
	public void checkCompletedProject(Date startDate, Date endDate);
	
	
}
