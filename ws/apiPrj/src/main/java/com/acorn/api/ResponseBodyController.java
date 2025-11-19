package com.acorn.api;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class ResponseBodyController {
	
	@ResponseBody
	@GetMapping("/json")
	public String method() {		
		return "americano";
	}
	
	
	@ResponseBody
	@GetMapping("/json2")
	public User method2() {
		User user = new User("acorn","0000");
		
		//스프링이 자동으로 json으로 응답함 (라이브러리 포함해야함)
		return user;
	}	
	

	@ResponseBody
	@GetMapping("/json3")
	public ArrayList<User> method4() {		
		ArrayList<User> list = new ArrayList<>();
		list.add( new User("acorn1" ,"kim"));
		list.add( new User("acorn2" ,"lee"));
		list.add( new User("acorn3" ,"jun"));		
		return list;
	}
 

}
