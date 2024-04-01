package com.app.service;

import java.util.List;

import com.app.model.Student;

public interface StudentService {
	
	List<Student> getAllStudentById();
	void saveStudent(Student student);
	
	

}
