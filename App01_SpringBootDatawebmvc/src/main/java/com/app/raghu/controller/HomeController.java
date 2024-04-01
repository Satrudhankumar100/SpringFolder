package com.app.raghu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/emp")
	public String showEmp() {
		System.out.println("emp method executed");
		return "empPage";
	}

	@GetMapping("/show")
	public String showHome() {
		System.out.println("show method executed");
		return "homePage";
	}
	
	@PostMapping("/save")
	public String saveUser() {
		System.out.println("save method executed");
		return "userPage";
	}
}
