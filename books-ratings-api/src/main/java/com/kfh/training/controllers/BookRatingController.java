package com.kfh.training.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.kfh.training.dto.Book;
import com.kfh.training.services.BookRatingService;

@RestController
public class BookRatingController {
	
	@Autowired
	BookRatingService service;

	@GetMapping("/rating/{bookId}")
	Book getBookRating(@PathVariable Integer bookId) {
		return service.getBookRating(bookId);
	}
	
	
	@GetMapping("/rating/all")
		List<Object> getAllBooks() {
			return service.getAllBooks();
		}
	
	
	
	
	
	
	
}
