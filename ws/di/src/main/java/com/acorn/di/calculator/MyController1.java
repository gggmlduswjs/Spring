package com.acorn.di.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// Program을 주입 받아서  계산기 서비스를 제공하자 !!!
@Controller
public class MyController1 {

	
	//Program  type의 객체가 생성되어야 한다
	//생성된 객체가 없다면 다음과 같은 오류발생
	//No qualifying bean of type 'com.acorn.di.calculator.Program' available: expected at least 1 bean which qualifies as autowire candidate. Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true)}
	
	
	//필드주입 
	@Autowired
	Program p;	 
	
	 
	

	//cal1?su1=10&su2=5
	@GetMapping("/cal1")
	public void add(  Integer su1,  Integer su2) {		
		 
		 
		 p.addNumber(su1, su2);	 
	}
	
}
