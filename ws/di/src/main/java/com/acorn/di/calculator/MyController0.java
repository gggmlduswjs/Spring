package com.acorn.di.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

// Program을 주입 받아서  계산기 서비스를 제공하자 !!!
@Controller
public class MyController0 {

	 

	//cal0?su1=10&su2=5
	@GetMapping("/cal0")
	public void add(   @RequestParam  (defaultValue =  "1" , required = false)  int  su1,
			           @RequestParam  (defaultValue =  "1" , required = false ) int  su2) {		
	  //public void add(  Integer su1,  Integer su2) {			 
		 Program p  = new Program( new BCalculator());  //직접객체를 생성하였다. 스프링이 객체를 관리하지 않음 
		 p.addNumber(su1, su2);	 
	}
	
}
