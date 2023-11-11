package com.isakistakip.isakistakip.service.Impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.isakistakip.isakistakip.model.User;
import com.isakistakip.isakistakip.repository.UserRepository;
import com.isakistakip.isakistakip.service.UserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class UserServiceImpl implements UserService {
	private final UserRepository repository;
	
	@Override
	public void addUser(User user) {
		repository.save(user);
		
	}

	@Override
	public List<User> getAll() {
		
		return repository.findAll();
	}

	@Override
	public User getById(Long id) {
	
		return repository.findById(id).orElse(null);
	}

	@Override
	public void updateUser(User user) {
	
		repository.save(user);
	}

	@Override
	public void deleteUser(Long id) {
		
		repository.deleteById(id);
	}}
