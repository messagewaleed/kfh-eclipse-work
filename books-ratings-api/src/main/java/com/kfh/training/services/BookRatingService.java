package com.kfh.training.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.kfh.training.dto.Book;

@Service
public class BookRatingService {
	
	@Autowired
	RestTemplate restTemplate;

	public Book getBookRating(Integer bookId) {
		return new Book("Alchemist", "4.7");
	}

	public List<Object> getAllBooks() {
		
		
		String urlOfAnotherService = "http://localhost:8080/books";
//		String urlOfAnotherService = "http://books-api/books";
		
		Object[] dataFromOtherService = restTemplate.getForObject(urlOfAnotherService, Object[].class);
	
		return Arrays.asList(dataFromOtherService);
	}
	
}
