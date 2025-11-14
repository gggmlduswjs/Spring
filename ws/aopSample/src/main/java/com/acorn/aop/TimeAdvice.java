package com.acorn.aop;

import java.util.Arrays;


//advice가 추가될 매서드를 지정하기 위한 태턴  지정
//(execution(* com.acorn.aopex.*.*(..))" )

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TimeAdvice {
  //@Around("execution(* com.acorn.aop.*.*( .. ))")      //pointcut  (부가기능이 적용될 매서드의 패턴)
 @Around("execution(* com.acorn.aop.MyCalculator2.*( int, int))")
 //@Around("execution(* com.acorn.aop.MyCalculator2.test( .. ))")
 public Object method( ProceedingJoinPoint pjp ) throws Throwable {	
	      //pjp : 매서드이 모든 정보가 들어 있음 
	 
	  System.out.println("before ");	  
	  
	  long startTime = System.currentTimeMillis();

	//  System.out.println(  pjp.getSignature().getName() + Arrays.toString( pjp.getArgs()));
	 
	  ///////////////////////////////////////////////////////
	  Object  result  = pjp.proceed();	 //타켓의 매소드를 호출한다
	  ///////////////////////////////////////////////////////
	  
	  
	  
	  //  실제 메서드를 호출합니다. 
	  //  proceed() 메서드는 호출된 메서드의 반환 값을 제공 
	  
	 // System.out.println( result);
	  
	 System.out.println(" after");	  
	 
	 long endTime = System.currentTimeMillis(); 
     long elapsedTime = endTime - startTime;

     // 경과 시간 출력  
     System.out.println("경과 시간: " + elapsedTime / 1000 + "초");
	 return result;
 }
	  
}




