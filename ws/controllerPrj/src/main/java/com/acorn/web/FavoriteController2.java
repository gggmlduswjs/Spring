package com.acorn.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


// MVC만나기 

// 애너테이션으로 컨트롤러 만들기 
// 하나의 컨트롤러 안에 여러개의 요청을 처리할 수 있다 
// 매서드 단위로 요청을 처리함 

@Controller
public class FavoriteController2 {
	
	@GetMapping("/hi")   //요청
	public void method1(   ) {			
		//모델s
		//view  : 요청의 이름을 view로 반환   ("hi"  view응답) 		
		
	}
	
	@GetMapping("/hi2")
	public String method2( Model  model) {
		//모델
		//뷰정보 : String 리턴값
		model.addAttribute("data", "spring hi~~~");		
		return "view";   // view이름으로   ( "view" 이름의 뷰가 응답 된다)
	}
		
	@GetMapping("/hi3")
	public ModelAndView method3( ) {
		//모델
		//뷰정보 : String 리턴값		
		ModelAndView  mv  = new ModelAndView();  //
		mv.setViewName("view3");  //뷰정보
		mv.addObject("data", "spring hi 3~~~");	 //모델정보	
		return  mv;
	}
	
	
}
