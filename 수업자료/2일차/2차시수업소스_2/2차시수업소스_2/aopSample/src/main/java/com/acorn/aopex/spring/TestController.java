package com.acorn.aopex.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.acorn.aop.MyCalculator2;

@Controller
public class TestController { 
	
	@Autowired	
	MyCalculator2  cal;
	
	
	
	@RequestMapping( value="/caltest"  , method=RequestMethod.GET)
	public String  method( int a, int b) {
		 System.out.println("cal 클래스: " + cal.getClass());
		
		 System.out.println("!!!!");
		 int result  =cal.add(a, b);
		 System.out.println( result );
		return "redirect:/";
	}
	
	
	 

}
