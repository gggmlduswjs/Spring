package com.acorn.day2.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProgramController {
	
	// 매서드매핑
	// Program 객체의 printSu 매서드 사용하여 응답하기
	
	@Autowired	// 필드주입
	Program program;
	
	
	@RequestMapping(value="/userAdd", method=RequestMethod.GET)
	public String userAdd(int su1,int su2) {
		
		program.printSu(su1, su2);
		
		return "calResult";
	}

}
