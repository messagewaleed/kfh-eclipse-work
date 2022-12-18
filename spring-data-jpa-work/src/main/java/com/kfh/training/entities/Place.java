package com.kfh.training.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Place {

	@Id
	private Integer placeId;
	
	private String placeName;
	
	private String placePin;
	
	//Foriegn to Primary Key relationship
	@ManyToOne
	private User user; 
	
	
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	Place(){
		
	}

	public Place(Integer placeId, String placeName, String placePin, Integer userId) {
		super();
		this.placeId = placeId;
		this.placeName = placeName;
		this.placePin = placePin;
		
		this.user = new User(userId, "", "");
	}

	public Integer getPlaceId() {
		return placeId;
	}

	public void setPlaceId(Integer placeId) {
		this.placeId = placeId;
	}

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public String getPlacePin() {
		return placePin;
	}

	public void setPlacePin(String placePin) {
		this.placePin = placePin;
	}

	@Override
	public String toString() {
		return "Place [placeId=" + placeId + ", placeName=" + placeName + ", placePin=" + placePin + "]";
	}
	
	
	
	
	
	
	
}
