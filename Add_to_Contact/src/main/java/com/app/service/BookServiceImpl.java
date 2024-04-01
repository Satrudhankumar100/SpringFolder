package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Book;
import com.app.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {
	@Autowired
	private BookRepository bookRepository;

	@Override
	public void addBook(Book book) {
		this.bookRepository.save(book);
		
	}

	@Override
	public List<Book> viewBook() {
		List<Book> list = bookRepository.findAll();
		return list;
	}

	@Override
	public void bookDelete(int id) {
		bookRepository.deleteById(id);
		
	}

	

	

}
