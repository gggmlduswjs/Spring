package com.acorn.api;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PracController {

	
	
	@RequestMapping( value="/aa" , method=RequestMethod.GET)
	public String a() {
		
		
		return "aa";
	}
	
	
	
	@ResponseBody
	@RequestMapping( value="/pracreg/{id}" , method=RequestMethod.POST)
	public String b(  @RequestBody  User data  , @PathVariable (name="id") String id) {
		System.out.println( data);
		System.out.println(  id);
		
		
		return "aa";
	}
}
