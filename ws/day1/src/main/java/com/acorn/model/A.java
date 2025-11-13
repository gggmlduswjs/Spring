package com.acorn.model;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;



// json데이터 응답하기 
// 자바객체를 데이터로 응답하면 json으로 변환을 스프링이 해 줌 
// 필요 의존성 추가해야 한ㄷ 

@Controller
public class A {	
	
	@ResponseBody
	@GetMapping("/json")
	public User2 getData() {
		 User2 user = new User2( );
		user.setId("test");
		user.setPw("1234");
		return user ;
	}

}
