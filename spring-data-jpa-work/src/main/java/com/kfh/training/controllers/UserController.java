package com.kfh.training.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@PostMapping("/users")
	public void addNewUser(@RequestBody User theUser) {
		service.addNewUser(theUser);
	}
	
	@PutMapping("/users/{id}")
	public void updateUser(@RequestBody User theUser) {
		service.updateUser(theUser);
	}
	
	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable Integer id) {
		service.deleteUser(id);
	}
	
//	@GetMapping("/users/names")
	@GetMapping("/users/name/{name}")
	public User getUserByName(@PathVariable String name) {
		return service.getUserByName(name);
	}
	
	@GetMapping("/users/locations/{location}")
	public List<User> getUsersByLocation(@PathVariable String location) {
		return service.getUsersByLocation(location);
	}
	
	
}
