package com.acorn.day2.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BookController {
	
	
	// 외부에서 생성된 BookService 객체를 주입 받자
	// 1. 생성자 주입(매개변수가 있는 생성자)
	BookService service;
	
	// 생성자 주입
	@Autowired
	public BookController(BookService service) {
		super();
		this.service = service;
	}
	
	// 매서드
	@RequestMapping(value="/book1",method =RequestMethod.GET)
	public String getBook(Model model) {
		String bookName=service.getBook();
		model.addAttribute("book", bookName);
		return "bookView";
	}

	

}
