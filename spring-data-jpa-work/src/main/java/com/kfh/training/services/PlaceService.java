package com.kfh.training.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kfh.training.dao.PlaceRepository;
import com.kfh.training.entities.Place;

@Service
public class PlaceService {
	
	@Autowired
	PlaceRepository repo;
	
	public List<Place> getAllPlacesByUserId(Integer userId) {
		return repo.findByUserId(userId);
	}
	
	public Optional<Place> getPlaceById(Integer id) {
		return repo.findById(id);
	}
	
	
	public void addPlace(Place place) {
		repo.save(place);
	}
	
	public void updatePlace(Place place) {
		repo.save(place);
	}
	
	public void deletePlaceById(Integer id) {
		repo.deleteById(id);
	}
	
	
	
	
	
	
	
	
}
