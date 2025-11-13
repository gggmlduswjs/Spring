package com.acorn.day1prac;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// 1번 1. 두 수를 사용자로 부터 입력 받아 사칙연산해서 제공하기   /calc7su1=5&su2=7

@Controller
public class Ex01Controller2 {
	
	// mvc
	@RequestMapping( value = "/ex02"  ,  method = RequestMethod.GET)
	public String ex02(Model model) {
		//3단
		//String[]
		String[] dan3 = new String[9];
		
		dan3[1]="3*"+1+"="+3*1;
		dan3[2]="3*"+2+"="+3*2;
		dan3[3]="3*"+3+"="+3*3;
		dan3[4]="3*"+4+"="+3*4;
		dan3[5]="3*"+5+"="+3*5;
		dan3[6]="3*"+6+"="+3*6;
		dan3[7]="3*"+7+"="+3*7;
		dan3[8]="3*"+8+"="+3*8;
		dan3[9]="3*"+9+"="+3*9;
		
		
		/*
		 * 
		 * for(int i=0;i<dan3.length;i++){
		 * 	dan3[i]="3*"+i+1+"="+3*i+1;
		 * 	
		 * }
		 * 
		 * */
		
		//model set !!! ->add
		model.addAttribute("dan", dan3);
		
		return "ex02";	//
		
	}

}
