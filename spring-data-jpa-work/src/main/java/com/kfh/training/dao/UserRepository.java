package com.kfh.training.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kfh.training.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

	User findByName(String name);
	
	List<User> findByLocation(String location);
}
