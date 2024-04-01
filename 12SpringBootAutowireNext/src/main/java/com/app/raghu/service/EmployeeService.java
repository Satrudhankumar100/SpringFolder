package com.app.raghu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.raghu.repo.EmployeeRepository;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Component
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository reop;

}
