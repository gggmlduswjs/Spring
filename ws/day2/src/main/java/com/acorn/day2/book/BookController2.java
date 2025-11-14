package com.acorn.day2.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BookController2 {
	
	// BookService 객체의 주입을 세터 주입 사용하기
	BookService service;
	
	// 세터주입 Injection
	@Autowired
	public void setService(BookService service) {
		this.service = service;
	}



	//매서드 단위 매핑
	@RequestMapping(value="/book2", method = RequestMethod.GET)
	public String getBook(Model model) {
		// ModelAndView
		String name = service.getBook();
		model.addAttribute("book", name);
		
		return "bookView";
	}

}
