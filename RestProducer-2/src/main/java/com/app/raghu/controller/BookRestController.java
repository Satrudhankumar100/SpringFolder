package com.app.raghu.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.raghu.entity.Book;

@RestController
@RequestMapping("/book")
public class BookRestController {
	
	@GetMapping("/find")
	public ResponseEntity<Book> getOneBook(){
		Book book=new Book(890,"Core java",200.9);
		return new ResponseEntity<Book>(book,HttpStatus.OK);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Book>> getAllBook(){
		List<Book> books = Arrays.asList(new Book(100,"A",200.0),
				new Book(200,"B",300.0));
		return new ResponseEntity<List<Book>>(books,HttpStatus.OK);
	}
	@GetMapping("/test")
	public ResponseEntity<Map<String,Book>> getMappedBooks(){
		Map<String, Book> mbooks = Map.of("B1",new Book(300,"spring",400.0),
				"B2",new Book(400,"SpringBoot",500.0));
		return new ResponseEntity<Map<String,Book>>(mbooks,HttpStatus.OK);
	}
	

}
