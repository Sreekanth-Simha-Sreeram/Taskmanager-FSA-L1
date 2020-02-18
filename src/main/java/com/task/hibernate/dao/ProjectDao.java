package com.task.hibernate.dao;

import java.util.Date;

public interface ProjectDao {

	public void createProject(int projectId);
	public void allocateProject(int ProjectId);
	public void checkProjectStatus(Date startDate);
	public void checkCompletedProject(Date startDate, Date endDate);
}
