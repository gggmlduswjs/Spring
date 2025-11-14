package com.acorn.day2.di;

public class ProgramMain {

	public static void main(String[] args) {
		
		Program p = new Program();
		
		// 계산기 객체 주입이 필요함
//		p.setCalculator(new LGCalculator());
		p.setCalculator(new SMCalculator());
		
		p.printSu(5, 3);
		
		// 생성자 주입
		Program p2 = new Program(new LGCalculator());
		p2.printSu(5, 4);
		

	}

}
