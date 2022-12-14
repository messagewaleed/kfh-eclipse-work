package com.kfh.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeveloperController {
	
	@Autowired
	DeveloperDao dao;

	ArrayList<Developer> listOfDevelopers = new ArrayList<>(Arrays.asList(
			new Developer(89, "Zahem", "Backend"),
			new Developer(31, "Haneen", "Backend"),
			new Developer(891, "Omar", "Testing"),
			new Developer(809, "Sarah", "UI"),
			new Developer(19, "Nasir", "Devops")));

//	Get all developer details
	@RequestMapping("/developers")
	List<Developer> getAllDevelopers() {
		return listOfDevelopers;
	}

//	Get a developer details by id
	@RequestMapping("/developers/{id}")
	Developer getDeveloperDetailsById(@PathVariable Integer id) {
		return listOfDevelopers.stream().filter(ref -> ref.id().equals(id)).findFirst().get();
	}

//	Add a new Developer
	@RequestMapping(method = RequestMethod.POST, value = "/developers")
	void addNewDeveloper(@RequestBody Developer theDeveloper) {
		listOfDevelopers.add(theDeveloper);
	}

//	Update an already existing developer
	@RequestMapping(method = RequestMethod.PUT, value =  "/developers/{id}")
	void updateDeveloperDetails(@PathVariable Integer id, @RequestBody Developer theDeveloper) {
//		for(Developer developer : listOfDevelopers) {
//			if(developer.id().equals(id)) {
//				listOfDevelopers.set(listOfDevelopers.indexOf(developer), theDeveloper);
//			}
//		}

//		Or With java 8 streams lambdas :
		 
		listOfDevelopers.set(
				listOfDevelopers.indexOf(
						getDeveloperDetailsById(id)),
				theDeveloper);

	}
	
//	Delete an already existing Developer
	@RequestMapping(method = RequestMethod.DELETE, value = "/developers/{id}")
	void deleteDeveloperById(@PathVariable Integer id) {
		listOfDevelopers.remove(listOfDevelopers.indexOf(getDeveloperDetailsById(id)));
	}
	
	
	
//	Get developer count from the database table : developer
	@RequestMapping("/developers/count")
	Integer getCountOfDevelopers() {
		return dao.getCountOfDevelopers();
	}
	
	
	
	
	
	
	
	

}
