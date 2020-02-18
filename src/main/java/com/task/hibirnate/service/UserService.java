package com.task.hibirnate.service;

import java.util.List;

import com.task.hibernate.models.Task;
import com.task.hibernate.models.User;

public interface UserService {

	public void createUser(User user);
    public Task searchTask(Task task);
    public List<User> viewAllUser();
    public void editTask( Task task,int taskId);
    
    public Task viewTask(int taskId);
    public List<Task> viewAllTask();
    public void endTask(int taskId);
    public void addTask(Task task);
    public List<Task> viewUserTask(int userId);
	
}
