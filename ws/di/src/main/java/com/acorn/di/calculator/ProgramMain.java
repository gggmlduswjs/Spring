package com.acorn.di.calculator;

public class ProgramMain {

	public static void main(String[] args) {	 
		/*
		ACalculator calculator  = new ACalculator();
		Program program = new Program(calculator);
		 */
		//생성자주입
		//주입 Injection 
		//세터주입	
		//ACalculator calculator  = new ACalculator();
		BCalculator calculator  = new BCalculator();	// 계산기 객체 생성
		Program program = new Program( );
		program.setCalculator(calculator);	// 계산기 객체의 주입 Injection(세터 injection)
		 
	    program.addNumber(5, 3);
	    	    
	    /*
	     * 객체 생성, 주입 =>  Spring Ioc Container
	     * 
	     * 지시서 작성 : xml , java config  , 어노테이션	       
	     */
	    
	    
	}

}
