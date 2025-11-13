package com.acorn.param;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// 달라진 MVC만나보기 

@Controller
public class Hello {
	
	//매서드단위의 매핑	
	@RequestMapping("/acorn1")
	public void hi() {		
		
		// 반환타입이 없는 경우 
		// 매핑의 이름을   view로 사용함 
	}
	
	
	@RequestMapping("/acorn2")
	public String hi2() {		
		return "acornview";   // view이름
	}
	
	
	@RequestMapping("/acorn3")    //요청  , 
	public  String  hi3( Model  model) {
		String result ="spring 조아 ";
		model.addAttribute("data", result);
		return "acorn3";   // view 이름 : acorn3
	}
	

}
