package com.acorn.prac.mvc;

import org.springframework.stereotype.Service;

@Service
public class CalService {
	
	// 매서드작성 : 두 수에 대한 연산 결과
	// 이름 : clacSu
	// 입력 : 두 수, operator 
	// 반환 : 결과반환, int
	
	public int calcSu(int num1,int num2,String operator) {
		
		// 서비스 분리하기
		
		int result = 0;
		//switch
		
		switch (operator) {
		case "add":
			result = num1+num2;
			
			break;

		case "sub":
			result = num1-num2;
			
			break;
			
		case "mul":
			result = num1*num2;
			
			break;
		case "div":
			result = num1/num2;
			
			break;
			default:
				System.out.println("잘못");
		}
				
		
		
		return 0;
		
	}
	
	//
	

}
