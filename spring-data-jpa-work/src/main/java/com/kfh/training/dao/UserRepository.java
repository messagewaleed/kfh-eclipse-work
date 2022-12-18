package com.kfh.training.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kfh.training.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
