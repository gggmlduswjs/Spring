package com.acorn.prac.batis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class MemberController {
	
	@Autowired
	BatisMemberRepository repository;
	
	
	@RequestMapping(value="/memberlist" , method=RequestMethod.GET)
	public String getList() {
		List<Member>list=repository.selectAll();
		System.out.println(list);
		
		return "list";
			
	}
	
	
	//회원등록
	@RequestMapping(value="/insertMember" , method=RequestMethod.GET)
	public String insertMember() {
		
		Member member = new Member("vi01","1212","우주연");
		
		int result=repository.insert(member);
		
		System.out.println(result);
		
		return "insertMember";	//view x
	}

}
