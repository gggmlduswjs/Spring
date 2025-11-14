package com.acorn.day2.di;

//
// 의존성 : Calculator
// 의존성 외부 주입 (외부에서 들어오는 것) : 매개변수로 전달됨 ( 생성자, setter 주입을 사용함)

public class Program {
	
	// 기본 생성자
	public Program() {
		// TODO Auto-generated constructor stub
	}
	
	Calculator calculator; // 외부주입(생성자, 세터)
	
	// 생성자 주입
	public Program(Calculator calculator) {
		super();
		this.calculator = calculator;
	}
	
	
	
	// 세터주입
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	

	// 기능 (사용자의 값을 더해주는 기능)
	
	public void printSu(int userSu1,int userSu2) {
		
		// 의존성 사용
		int result = calculator.add(userSu1, userSu2);
		
		System.out.println("결과는"+result);
		
	}

	
	
	
	
}
