package com.task.hibernate.dao;

import java.util.Date;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
//@Repository ("projectDAO")

public class ProjectDaoImpl implements ProjectDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public void createProject(int projectId) {
		// TODO Auto-generated method stub
		
	}

	public void allocateProject(int ProjectId) {
		// TODO Auto-generated method stub
		
	}

	public void checkProjectStatus(Date startDate) {
		// TODO Auto-generated method stub
		
	}

	public void checkCompletedProject(Date startDate, Date endDate) {
		// TODO Auto-generated method stub
		
	}

}
