package com.app.raghu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.raghu.entity.Employee;
import com.app.raghu.exception.EmployeeNotFoundException;
import com.app.raghu.service.IEmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private IEmployeeService service;

	// 1. Display register page

	@GetMapping("/register")
	public String showRegister() {
		return "EmployeeRegister";
	}

	@PostMapping("/save")
	public String saveForm(@ModelAttribute Employee employee, Model model) {
		// call service and get id
		Integer id = service.saveEmployee(employee);

		// construct message
		String message = id + "Employee created";
		model.addAttribute("message", message);

		return "EmployeeRegister";

	}

	// 3.get All Rows From DB AND DISPLAY AS HTML TABLE
	@GetMapping("/all")
	public String showAll(@RequestParam(required = false) String message, Model model) {
		
		// fetch data from DB using service
		List<Employee> list = service.getAllEmployees();
		
		// send this data to ui/view
		model.addAttribute("list", list);
		model.addAttribute("message",message);
		return "EmployeeData";
	}
	
	@GetMapping("/delete")
	public String doDelete(@RequestParam Integer id,RedirectAttributes attributes)
	{
		try {
			service.deleteEmployee(id);
			attributes.addAttribute("message","Employee '"+id+"'Deleted");
		}catch(EmployeeNotFoundException e){
			e.printStackTrace();
			attributes.addAttribute("message",e.getMessage());
		}
		return "redirect:all";
	}
	
	@GetMapping("/edit")
	public String showEdit(
			@RequestParam Integer id,Model model) {
			String page=null;
			try {
				Employee employee = service.getOneEmployee(id);
				model.addAttribute("employee",employee);
				page="EmployeeEdit";
			} catch (EmployeeNotFoundException  e) {
				e.printStackTrace();
				model.addAttribute("message",e.getMessage());
				page="redirect:all";
			}
					
		return page;
	}
	@PostMapping("/update")
	public String updateForm(@ModelAttribute Employee employee,RedirectAttributes attributes) {
		service.updateEmployee(employee);
		attributes.addAttribute("message","Employee'"+employee.getEmpId()+"'Updated");
		
		return "redirect:all";
	}

}
