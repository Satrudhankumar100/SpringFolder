package com.app.service;

import java.util.List;

import com.app.model.Book;

public interface BookService {
	
	void addBook(Book book);
	List<Book> viewBook();
	void bookDelete(int id);
	
	

}
