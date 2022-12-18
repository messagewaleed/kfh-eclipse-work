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
import org.springframework.web.bind.annotation.RestController;

import com.kfh.training.entities.Place;
import com.kfh.training.entities.User;
import com.kfh.training.services.PlaceService;

@RestController
public class PlaceController {
	
	@Autowired
	PlaceService service;

	@GetMapping("/places/user/{userId}")
	List<Place> getAllPlacesByUserId(@PathVariable Integer userId) {
		return service.getAllPlacesByUserId(userId);
	}
	
	@GetMapping("/places/{placeId}")
	Optional<Place> getPlaceById(@PathVariable Integer placeId){
		return service.getPlaceById(placeId);
	}
	
	@PostMapping("/places/{userId}")
	void addNewPlace(@RequestBody Place place, @PathVariable Integer userId) {
		//Before adding a new place, map it to a User : Because places without users can't exist :
		place.setUser(new User(userId, "", ""));
		
		service.addPlace(place);
	}
	
	@PutMapping("/places/{userId}")
	void updateNewPlace(@RequestBody Place place, @PathVariable Integer userId) {
		place.setUser(new User(userId, "", ""));
		
		service.updatePlace(place);
	}
	
	@DeleteMapping("/places/{placeId}")
	void deletePlaceById(@PathVariable Integer placeId) {
		service.deletePlaceById(placeId);
	}
	
	
	
	
	
	
	
	
	
	
}
