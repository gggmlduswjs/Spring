package com.acorn.day2.문제풀이;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Ex05Controller {
//5. 원하는 수만큼의 별을 출력하기 ( 원하는 수만큼 별을 출력하는 서비스제공하기)  /star?cnt=5
	//http://localhost:8080/day1prac/star?cnt=5
	@RequestMapping( value = "/star"  ,  method = RequestMethod.GET)
//	public String ex05(Model model,int cnt) { //double
	public String ex05(Model model,
			@RequestParam (defaultValue="1") int cnt) { //double
		
//		model.addAttribute("cnt", cnt); 5 => 별 5개
		//반복문
		//StringBuiler
		StringBuilder sb = new StringBuilder(100);
		// 내부에 char[]을 가지고 있음, 수정 가능한 배열 , 
		// 처음에 생성 시 배열의 크기를 크게해주는게 효율적이다
		for(int i=1;i<=cnt;i++) {
			sb.append("*");
		}
		
		model.addAttribute("star", sb.toString());	// "***","*****"
		
		
		return "star";
	}
}
