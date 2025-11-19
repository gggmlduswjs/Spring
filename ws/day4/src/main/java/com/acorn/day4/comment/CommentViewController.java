package com.acorn.day4.comment;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CommentViewController {

	
	
	
	 @RequestMapping( value="/goods"  ,method=RequestMethod.GET)
	//@GetMapping("/goods")
	public String  comment() {	
		return  "comment";  //view
	}
}
