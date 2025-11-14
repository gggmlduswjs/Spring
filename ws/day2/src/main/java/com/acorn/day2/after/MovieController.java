package com.acorn.day2.after;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MovieController {

	
	
	@Autowired    // Injection ( 주입)
	Movie m;
	 
	
	
	
	@RequestMapping(  value="/m1"  , method = RequestMethod.GET)
	public  String   getMovie() {
	
		System.out.println(m.toString());
		return "ddd";  //view
	}
	
	@RequestMapping(  value="/m2"  , method = RequestMethod.GET)
	public  String   getScreen() {
	
		System.out.println(m.toString());
		return "ddd";  //view
	}
	
	
}
