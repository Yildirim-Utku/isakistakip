 package com.isakistakip.isakistakip.service;

import java.util.List;

import com.isakistakip.isakistakip.model.User;

public interface UserService {
	void addUser(User user);
	
	List<User> getAll();
	
	User getById(Long id);
	
	void updateUser(User user);
	
	void deleteUser(Long id);
}
