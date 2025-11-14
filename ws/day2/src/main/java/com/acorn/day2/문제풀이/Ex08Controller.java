package com.acorn.day2.문제풀이;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Ex08Controller {
	@RequestMapping( value = "ex08"  ,  method = RequestMethod.GET)
	public String  ex08( Model  model) {
	
		String result;
		String[]arr= {
				"화이팅",
				"집에가자",
				"내일의 나에게 미루자",
				"화이팅~~~",
				"빠른포기가 답이다"
				
		};
		int ram = (int)(Math.random()*arr.length);
		result=arr[ram];
		model.addAttribute("data", result);
		
		return "ex08";
		
	}
}
