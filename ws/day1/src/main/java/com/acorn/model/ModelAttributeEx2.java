package com.acorn.model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ModelAttributeEx2 {
	
	
	
	
	@RequestMapping(value = "/mAttTest", method = RequestMethod.GET)
	public String  method1( Customer customer) {		
		System.out.println( customer.getName());
		
		return "mAttrView";
	}

}
