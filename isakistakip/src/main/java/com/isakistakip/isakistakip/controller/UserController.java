package com.isakistakip.isakistakip.controller;



import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import com.isakistakip.isakistakip.model.User;



public interface UserController {
	@GetMapping("/users")
	public String getAll(Model model);
	
	@GetMapping("/users/{id}")
	public String getById(@PathVariable Long id,Model model);
	
	@PostMapping("/delete/{id}")
	public void deleteUser(@PathVariable Long id);
	
	@GetMapping("/users/update/{id}")
	public String updateUser(@PathVariable Long id , Model model);
	
	@PostMapping("/users/update/{id}")
	public String updateUserForm(@PathVariable Long id ,@ModelAttribute User user);
	
	@GetMapping("/users/new")
	public String saveForm(Model model);
	
	@PostMapping("/users/new")
	public String save(@ModelAttribute User user); 
	
}
