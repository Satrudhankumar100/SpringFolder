package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Student;
import com.app.repository.StudentRepository;
import com.app.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository repository;

	@Override
	public List<Student> getAllStudentById() {
		List<Student> listOfStudents = repository.findAll();
		return listOfStudents;
	}

	@Override
	public void saveStudent(Student student) {
		repository.save(student);
		
	}

}
