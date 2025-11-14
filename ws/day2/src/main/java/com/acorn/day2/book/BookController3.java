package com.acorn.day2.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BookController3 {
	//BookService 객체 필드 주입하자
	
	@Autowired
	BookService service;
	
	
	//매서드 단위 매핑
		@RequestMapping(value="/book3", method = RequestMethod.GET)
		public String getBook(Model model) {
			// ModelAndView
			String name = service.getBook();
			model.addAttribute("book", name);
			
			return "bookView";
		}
}
