package com.isakistakip.isakistakip.controller.Impl;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.isakistakip.isakistakip.controller.TaskController;
import com.isakistakip.isakistakip.model.Task;
import com.isakistakip.isakistakip.model.User;
import com.isakistakip.isakistakip.service.TaskService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class TaskContollerImpl implements TaskController {
private final TaskService service;

@Override
public String taskList(Model model) {
	List<Task> tasks=service.allTaskList();
	model.addAttribute("tasks",tasks);
	return "task-list";
}

@Override
public String taskListUserId(Long userId, Model model) {
	List<Task> tasks=service.taskList(userId);
	model.addAttribute("tasks",tasks);
	return "task-list";
}

@Override
public String changeComplated(Long taskId) {
	service.changeComplated(taskId);
	return "redirect:/tasks";
}

@Override
public String saveTask(Task task) {
	service.saveTask(task);
	return "redirect:/tasks";
}

@Override
public String saveForm(Model model) {
	model.addAttribute("task",new Task());
	return "add-task";
	
}
	

}
