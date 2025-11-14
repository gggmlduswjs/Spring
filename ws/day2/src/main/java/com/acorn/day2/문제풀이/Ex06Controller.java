package com.acorn.day2.문제풀이;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Ex06Controller {
	//6. 수를 사용자로부터 받으면 입력한 수에 대한 약수를 구해서 제공하기    /divisor
		//(약수를 구해주는 서비스)
		//http://localhost:8080/day1prac/divisor?num=24
	    @RequestMapping(value = "/divisor", method = RequestMethod.GET)
//	    public String divisor(int num, Model model) {
//	    public String divisor(Integer num, Model model) { // null 들어갈 수 있음
	    public String divisor(
	    		@RequestParam( defaultValue="1",required=false) int num, 
	    		Model model) {
	    	ArrayList<Integer> divisors = new ArrayList<>();

	        // 1부터 num까지 반복하며 약수 구하기
	        for (int i = 1; i <= num; i++) {
	            if (num % i == 0) {
	                divisors.add(i);
	            }
	        }

	        model.addAttribute("num", num);
	        model.addAttribute("divisors", divisors);

	        return "ex06";  // JSP 이름
	    }

}
