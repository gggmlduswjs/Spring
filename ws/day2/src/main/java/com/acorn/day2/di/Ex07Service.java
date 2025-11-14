package com.acorn.day2.di;

import org.springframework.stereotype.Component;

// 스프링 컨테이너 ioc 컨테이너에게 객체 생성을 부탁

@Component
public class Ex07Service {
	
	//화이팅 메시지 반환
	
	public String getMessage() {
		StringBuilder sb = new StringBuilder();
		sb.append("집");
		sb.append("곧 갑니다");
		sb.append("모두 파이팅");
		
		return sb.toString();
	}

}
