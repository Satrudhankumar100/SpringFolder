package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.model.Book;
import com.app.service.BookService;

@Controller
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping({"/","/home"})
	public String showHomePage() {
		return "index";
	}
	
	@GetMapping("/add")
	public String showAddPage(Model model) {
		Book book=new Book();
		model.addAttribute("book",book);
		return "addBook";
	}
	@PostMapping("/save")
    public String saveEmployee(@ModelAttribute("book") Book book, Model model) {
		bookService.addBook(book);
		System.err.println("BOOK INSERTED SUCCESSFULLY");
    	return "redirect:/add";
    }
	
	@GetMapping("/view")
	public String viewBook(Model model) {
		List<Book> viewBook = bookService.viewBook();
		model.addAttribute("viewBook",viewBook);
		return "viewBook";
		
	}
	
	 @GetMapping("/delete/{id}")
	public String deleteBook(@PathVariable(value="id")int id,Model model) {
		 bookService.bookDelete(id);
		 
		return "redirect:viewBook" ;
	
	
	
	
	

}
}
