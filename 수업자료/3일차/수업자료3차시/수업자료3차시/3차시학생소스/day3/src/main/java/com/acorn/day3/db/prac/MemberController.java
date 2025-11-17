package com.acorn.day3.db.prac;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberController {

	
	@Autowired
	MemberRepository repository;
	
	
	@RequestMapping(value="/members", method=RequestMethod.GET)
	public String  getMembers( Model model) {
		
		ArrayList<Member>  list  = repository.selectAll();
		System.out.println( list);		
		model.addAttribute("list", list);		
		return  "members";
	}
}
