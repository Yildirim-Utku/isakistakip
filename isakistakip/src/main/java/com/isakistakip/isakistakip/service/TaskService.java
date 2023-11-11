package com.isakistakip.isakistakip.service;

import java.util.List;

import com.isakistakip.isakistakip.model.Task;

public interface TaskService {
	List<Task> allTaskList();
	
	List<Task> taskList(Long userId);
	
	Task changeComplated(Long id);
	
	 Task getById(Long id);
	 
	 Task saveTask(Task task);
	
}
 