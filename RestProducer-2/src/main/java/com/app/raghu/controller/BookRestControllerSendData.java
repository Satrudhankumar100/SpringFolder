package com.app.raghu.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.raghu.entity.Book;

@RestController
@RequestMapping("/book")
public class BookRestControllerSendData {
	
	@PostMapping("/save")
	public ResponseEntity<String> createBook(@RequestBody Book book) {
		System.out.println(book);
		return new ResponseEntity<String>("Data Received",HttpStatus.OK);
	}
	
	@GetMapping("/findbyId")
	public ResponseEntity<Book> findBook(@RequestBody Book bookId)
	{
		return new ResponseEntity<Book>(bookId,HttpStatus.OK);
	}

}
