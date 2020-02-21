package com.task.hibernate.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.task.hibernate.models.Task;
import com.task.hibernate.models.User;
@Component
//@Repository("userDao")
public class UserDaoImpl implements UserDao {

	
	@Autowired
	private SessionFactory sessionFactory;

	public void createUser(User user) {
		// TODO Auto-generated method stub
		
	}

	public Task searchTask(Task task) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> viewAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	public void editTask(Task task, int taskId) {
		// TODO Auto-generated method stub
		
	}

	public Task viewTask(int taskId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Task> viewAllTask() {
		// TODO Auto-generated method stub
		return null;
	}

	public void endTask(int taskId) {
		// TODO Auto-generated method stub
		
	}

	public void addTask(Task task) {
		// TODO Auto-generated method stub
		
	}

	public List<Task> viewUserTask(int userId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
