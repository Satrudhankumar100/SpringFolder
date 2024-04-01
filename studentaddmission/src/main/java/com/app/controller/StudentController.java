package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.model.Student;
import com.app.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	
	@GetMapping("/")
	public String showHomePage(Model model) {
		Model attribute = model.addAttribute("liststudent",studentService.getAllStudentById());
		return "index";
	
	}
	
	@PostMapping("/register")
	public String saveStudentPage(@ModelAttribute("student")Student student,Model model) {
		studentService.saveStudent(student);
		model.addAttribute("created","successfully");
		return "redirect:/";
	}

}
