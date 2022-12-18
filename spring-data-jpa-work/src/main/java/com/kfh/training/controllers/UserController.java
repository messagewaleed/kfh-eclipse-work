package com.kfh.training.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.kfh.training.entities.User;
import com.kfh.training.services.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService service;

	@GetMapping("/users")
	Iterable<User> getAllUsers() {
		return service.getAllUsers();
	}
	
	@GetMapping("/users/{id}")
	Optional<User> getUserById(@PathVariable int id) {
		return service.getUserById(id);
	}
	
	
}
