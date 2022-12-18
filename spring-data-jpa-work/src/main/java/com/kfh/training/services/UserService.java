package com.kfh.training.services;

import java.util.List;
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

	public Optional<User> getUserById(Integer id) {
		return repo.findById(id);
	}
	
	public void addNewUser(User theUser) {
		repo.save(theUser);
	}
	
	public void updateUser(User theUser) {
		repo.save(theUser);
	}
	
	public void deleteUser(Integer id) {
		repo.deleteById(id);
	}
	
	
	public User getUserByName(String name) {
		return repo.findByName(name);
	}

	public List<User> getUsersByLocation(String location) {
		
		return repo.findByLocation(location);
	}
	
	
	
	
	
	
	
	
	
}
