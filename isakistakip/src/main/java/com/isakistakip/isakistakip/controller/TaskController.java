package com.isakistakip.isakistakip.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.isakistakip.isakistakip.model.Task;



public interface TaskController {
	@GetMapping("/tasks")
	public String taskList(Model model);

	@GetMapping("/tasks/{userId}")
	public String taskListUserId(@PathVariable Long userId,Model model);

	@GetMapping("/update/{taskId}")
	public String changeComplated(@PathVariable Long taskId);

	@GetMapping("/tasks/new")
	public String saveForm(Model model);
	
	@PostMapping("/tasks/new")
	public String saveTask(@ModelAttribute Task task);

	
}
