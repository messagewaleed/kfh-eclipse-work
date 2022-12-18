package com.kfh.training.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity  //Tells JPA this is our class : table
public class User {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
//	@Column("userName")
	private String name;
	
	private String location;
	
	User(){
		
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", location=" + location + "]";
	}

	public User(int id, String name, String location) {
		this.id = id;
		this.name = name;
		this.location = location;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
	
	
}
