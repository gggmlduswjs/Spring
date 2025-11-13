package com.acorn.param;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


//편리한 데이터 수집 
//클라이언트의 정보를 쉽게 수집할 수  있다

// @RequestParam
// @ModelAttribute 

@Controller
public class Hello2 {
	
	@RequestMapping(value  ="/acorn4"  , method= RequestMethod.GET)
	public String hi( @RequestParam ( required = false) String id,
			          @RequestParam ( required = false) String  pw) {		
		System.out.println( id);		
		System.out.println( pw);
		
		return "hi";
	}
	
 
	@RequestMapping(value  ="/acorn5" , method =RequestMethod.GET)
	public String h2( @ModelAttribute  User user ) {  // 기본생성자 , setter이용	
		System.out.println( user.getId());
		System.out.println( user.getPw());
		return "hi2";
	}
	 
	
	//이전의 방식을 확인해 보자 
	
	@RequestMapping("/acorn0")
	public String h3( HttpServletRequest request ) {	
		
		String id  = request.getParameter("id");
		String pw = request.getParameter("pw");		
		
		
		//필요하면 객체를 생성하여 사용함 
		User user = new User();
		user.setId(id);
		user.setPw(pw);		
		 
		return "hi2";
	}
	
	
	
	//request저장소  -> Model 객체를 제공함 
	//model객체에 저장하면 request에 저장됨
	
	
	@RequestMapping("/acorn6")
	public String hi4( Model model ) {  
		
		// Model  <- ArrayList<String> 과일이름 여러개 		
		ArrayList<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("banana");
		list.add("tomato");	
		
		model.addAttribute("fruit", list);	  
		return "hi4";
	}
	
	
	
}
