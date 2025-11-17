package com.acorn.prac.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalController2 {
	
	@Autowired
	CalService service;
	
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
		
		// 서비스 분리하기
		int result =service.calcSu(num1,num2,operator);
		
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
