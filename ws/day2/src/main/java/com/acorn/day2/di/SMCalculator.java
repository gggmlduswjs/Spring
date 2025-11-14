package com.acorn.day2.di;

public class SMCalculator  implements Calculator {

	@Override
	public int add(int su1, int su2) {
		 System.out.println("SM");
		return su1+su2;
	}

}
