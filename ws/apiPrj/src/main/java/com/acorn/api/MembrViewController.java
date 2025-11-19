package com.acorn.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MembrViewController {

	
	//등록1
	
	@RequestMapping( value="/reg1" , method = RequestMethod.GET)
	public String reg1() {
		return "reg1";
	}
	
	//등록2
	
	@RequestMapping( value="/reg2" , method = RequestMethod.GET)
	public String reg2() {
		return "reg2";
	}
	
	//등록3
	

	@RequestMapping( value="/reg3" , method = RequestMethod.GET)
	public String reg3() {
		return "reg3";
	}
	
	 
	@RequestMapping( value="/update" , method = RequestMethod.GET)
	public String update() {
		return "update";
	}
	
 
	 
	@RequestMapping( value="/delete" , method = RequestMethod.GET)
	public String delete() {
		return "delete";
	}
	
	@RequestMapping( value="/search1" , method = RequestMethod.GET)
	public String search1() {
		return "search1";
	}
	@RequestMapping( value="/search2" , method = RequestMethod.GET)
	public String search2() {
		return "search2";
	}	
	 
	
}
