package com.kfh.training.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kfh.training.dao.UserRepository;
import com.kfh.training.entities.User;

@Service
public class UserService {
	
	@Autowired
	UserRepository repo;

	public Iterable<User> getAllUsers() {
		return repo.findAll();
	}

	public Optional<User> getUserById(int id) {
		return repo.findById(id);
	}
	
}
