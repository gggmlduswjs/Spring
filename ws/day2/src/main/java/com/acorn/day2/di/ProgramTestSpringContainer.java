package com.acorn.day2.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class ProgramTestSpringContainer {

	public static void main(String[] args) {
		
		/*
		 * Spring container : IOC 컨테이너(제어의 역전) : 주요객체의 생성과 주입이 스프링에게로 넘어감
		 * 
		 * 
		 * 
		 * */
		
			// HttpServlet
			// HttpServletRequest, HttpServletResponse
			// service
		
			// ApplicationContext (인터페이스)
			// => xml기반의 생성과 주입 ( GenericXmlApplicationContext()
		
			ApplicationContext ac = 
					new GenericXmlApplicationContext("com/acorn/day2/di/setting.xml");
			
			// 스프링 컨테이너로부터 값을 얻어오는 두 가지 방법
			// id 값으로 얻어오기
			Program program = (Program)ac.getBean("program");
			
			program.printSu(5, 10);
			
			Program pppp=ac.getBean(Program.class);
			
			pppp.printSu(5, 100);

	}

}
