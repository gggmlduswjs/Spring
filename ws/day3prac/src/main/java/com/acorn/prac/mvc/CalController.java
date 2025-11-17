package com.acorn.prac.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//@Controller
public class CalController {
	
	//get (계산기 화면)
	@RequestMapping(value="/calcForm",method=RequestMethod.GET)
	public String calcForm() {
		return "calcForm";
	}
	
	//post (계산기 처리하기)
	@RequestMapping(value="/calcResult",method=RequestMethod.POST)
	public String calcResult( 
			@RequestParam (defaultValue ="1" , required=false)int num1 ,
			@RequestParam (defaultValue ="1" , required=false)int num2 ,
			@RequestParam String operator ,
			
			Model model
			) {
		
		int result=0;
		
		//switch
		
		switch(operator) {
		
		case "add" :
			result=num1+num2;
			break;
		case "sub" :
			result=num1-num2;
			break;
		case "mul" :
			result=num1*num2;
			break;
		case "div" :
			result=num1/num2;
			break;
		default:
			System.out.println("잘못");
		
		}
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(operator);
		System.out.println(result);
		
		
		model.addAttribute("result", result);
		model.addAttribute("num1", num1);
		model.addAttribute("num2", num2);
		
		
		
		
		return "calcResult";	// 해당 뷰에서 두 수의 계산 결과 응답하기
	}

}
