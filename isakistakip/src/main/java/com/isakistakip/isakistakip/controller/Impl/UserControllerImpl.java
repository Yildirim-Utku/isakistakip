package com.isakistakip.isakistakip.controller.Impl;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RestController;

import com.isakistakip.isakistakip.controller.UserController;
import com.isakistakip.isakistakip.model.User;
import com.isakistakip.isakistakip.service.UserService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor

public class UserControllerImpl implements UserController{
	private final UserService service;

	@Override
	public String getAll(Model model) {
		List<User> users=service.getAll();
		model.addAttribute("users",users);
		return "index";
	}



	@Override
	public void deleteUser(Long id) {
			
		service.deleteUser(id);
	}





	@Override
	public String getById(Long id,Model model) {
		User user=service.getById(id);
		model.addAttribute("user",user);
		return "user-detail";
	}



	@Override
	public String saveForm(Model model) {
		model.addAttribute("user",new User());
		return "user-add";
	}



	@Override
	public String save(User user) {
		service.addUser(user);
		return "redirect:/users";
	}



	@Override
	public String updateUser(Long id, Model model) {
		User user=service.getById(id);
		model.addAttribute("user", user);
		return "user-add";
	}



	@Override
	public String updateUserForm(Long id, User user) {
		user.setId(id);
		service.updateUser(user);
		return "redirect:/users";
	}



	



	
}
