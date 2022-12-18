package com.kfh.training.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.kfh.training.entities.Place;

public interface PlaceRepository extends CrudRepository<Place, Integer>{

	List<Place> findByUserId(Integer userId);
}
