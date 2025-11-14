package com.acorn.day2.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.Setter;

@Controller
public class BookController4 {

	@Setter(onMethod_ = @Autowired)
	BookService service;
	/*
	 * 직접 setter를 만들고 @Autowired 붙이기와 동일한 코드
	 * 
	 * 
	 * 
	 * */
	
	
	//매서드 단위 매핑
			@RequestMapping(value="/book4", method = RequestMethod.GET)
			public String getBook(Model model) {
				// ModelAndView
				String name = service.getBook();
				model.addAttribute("book", name);
				
				return "bookView";
			}
}
