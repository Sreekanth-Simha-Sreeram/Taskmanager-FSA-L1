package com.task.hibirnate.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.task.hibernate.dao.ProjectDao;

@Component
@Service ("projectService")
public class ProjectServiceImpl implements ProjectService {
	
	@Autowired
	ProjectDao projectDao;
	@Transactional

	public void createProject(int projectId) {
		// TODO Auto-generated method stub
		
	}
	
	@Transactional
	public void allocateProject(int ProjectId) {
		// TODO Auto-generated method stub
		
	}
	
	@Transactional
	public void checkProjectStatus(Date startDate) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	public void checkCompletedProject(Date startDate, Date endDate) {
		// TODO Auto-generated method stub
		
	}

}
