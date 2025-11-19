package com.acon.prac4.데이터응답;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

//  :  뷰  응답: spring mvc   ( void, String, ModelAndView )  
//  :  데이터 응답  : json  (json 관련 라이브러리 필요함) 


//acorn데이터 응답하기 

@Controller
public class AcornDataController {

	
	//매서드 단위 매핑 
	//데이터응답 @ResponseBody  (리턴값을 view가 아니라 데이타로 인식함)
	
	@ResponseBody
	@RequestMapping( value="/data1"  , method = RequestMethod.GET)
	public Acorn  getData1() {		
		Acorn acorn = new Acorn("홍길동", "서울시 마포구");
		return acorn;
		
	} 
	
	
	
	@ResponseBody
	@RequestMapping( value="/data2"  , method = RequestMethod.GET)
	public List<Acorn>  getData2() {	
		List<Acorn> list  = new  ArrayList<>();
		Acorn acorn = new Acorn("홍길동", "서울시 마포구");
		list.add(acorn);
		list.add( new Acorn("우주연" ,"서울시 노원구 공릉")); 
		return list;
		
	}
	
	
	
	//HttpServletResponse  사용해서 응답하기	
	@RequestMapping( value="/data3"  , method = RequestMethod.GET)
	 public void  getData3( HttpServletResponse response) {
		 
		 try {
			 response.setContentType("text/plain;charset=utf-8");
			 PrintWriter    out  =  response.getWriter();
			 out.print(" <h2>hello data 입니다</h2>");		 
			 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	 }
	
	
	// ResponseEntity 객체로 감싸서 응답하기
	
	/*
	  
	@ResponseBody
	@RequestMapping( value="/data1"  , method = RequestMethod.GET)
	public Acorn  getData1() {		
		Acorn acorn = new Acorn("홍길동", "서울시 마포구");
		return acorn;		
	} 
	
	
	 */
	
	@RequestMapping( value="/data5"  , method = RequestMethod.GET)
	public ResponseEntity< Acorn> getData4(){
		Acorn acorn = new Acorn("홍길동", "서울시 마포구");
		
		return ResponseEntity
				.status( HttpStatus.OK)
				.body(acorn);
				 
		
	}
	
	
	
	 //JSON응답하기
	 @GetMapping("/data6")
	  public void test5(HttpServletResponse response ) throws IOException  {			
			response.setContentType("application/json;charset=utf-8"); 
			response.getWriter().println( "{ \"id\" : \"wjy\" , \"pw\":\"0000\"}");  //json 구조를 가진 문자열
			
	 }
	
	
	
}
