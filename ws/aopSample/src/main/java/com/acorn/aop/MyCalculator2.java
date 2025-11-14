package com.acorn.aop;

import org.springframework.stereotype.Component;


@Component
public class MyCalculator2 {
	
	public int add( int x, int y) { 
		
		//시간지연
		try {
            Thread.sleep(  1000  *  10); // 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
		return x+y ;
	}
	
	public int sub( int x, int  y) {
		 
		return x-y;
	}
	
	
	public int test(  ) {
		return 3;
	}

}
