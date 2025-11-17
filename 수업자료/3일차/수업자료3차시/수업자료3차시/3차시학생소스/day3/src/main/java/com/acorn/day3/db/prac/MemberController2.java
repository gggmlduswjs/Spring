package com.acorn.day3.db.prac;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberController2 {

	
	@Autowired
	MemberRepository4 repository;
	
	
	@RequestMapping(value="/join", method=RequestMethod.GET)
	public String  register( Member member ) {		
		 int rowcnt= repository.insert(member);		
		 System.out.println( rowcnt);
		 return  "ok";
	}
}
