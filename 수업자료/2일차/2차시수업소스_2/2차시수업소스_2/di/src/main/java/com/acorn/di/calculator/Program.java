package com.acorn.di.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

 
//@Component
 
public class Program {	
	//dependency  : 의존성  
	
 
	//@Autowired
	Calculator calculator;
	//Calculator타입의 객체가 없다면 다음과 같은 오류가 발생한다
	// No qualifying bean of type 'com.acorn.di.calculator.Calculator' available: expected at least 1 bean which qualifies as autowire candidate. Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true)}
	
	
	public Program() {
		// TODO Auto-generated constructor stub
	}
	
	//생성자주입
	//@Autowired
	public Program(Calculator calculator) {
		// TODO Auto-generated constructor stub
		this.calculator =calculator;
	}
	
	
	//세터주입	
	//@Autowired
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	public void  addNumber(int su1, int su2) {
		int result  = calculator.add(su1, su2);
		System.out.println( " 두 수의 합" + result);		
	}
	 

}
