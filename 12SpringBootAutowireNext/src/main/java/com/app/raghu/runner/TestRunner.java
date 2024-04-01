package com.app.raghu.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.raghu.service.EmployeeService;

@Component
public class TestRunner implements CommandLineRunner{
	
	@Autowired
	private EmployeeService service;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(service);
		
	}
	
	
}
