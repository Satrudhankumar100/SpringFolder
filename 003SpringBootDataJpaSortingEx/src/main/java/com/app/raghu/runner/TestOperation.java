package com.app.raghu.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.raghu.repo.BookRepository;

@Component
public class TestOperation implements CommandLineRunner {
	
	@Autowired
	private BookRepository repo;

	@Override
	public void run(String... args) throws Exception {
			
		
		
	}

}
