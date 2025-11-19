package com.acorn.day4.요청응답;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class 폼데이터읽기GET_POST   {
	
	@GetMapping("/formView")
    public String form(  )   {	
		return "formView";
	}

	//Get요청은  요청바디가 전달되지 않는다
	//요청줄에 쿼리스트링으로 전달된다
	//getParameter로 값을 꺼낼 수 있다 
	
	
	@GetMapping("/formRead1")
     void test2(HttpServletRequest request ) throws ServletException, IOException {
      
		//String id  = request.getParameter("id");
		//String pw =  request.getParameter("pw");		
		
		//System.out.println("Request header: 요청헤더에서 값 추출");
		//System.out.println( id);
		//System.out.println( pw);
		
		
		//get 요청은  바디가 전달되지 않는다  !!  눈으로 확인하자 !!!  
		// -1

		  int contentLength = request.getContentLength();
		  System.out.println( contentLength);
		  
	        if (contentLength > 0) {   
				
				try (BufferedReader reader = new BufferedReader(new InputStreamReader(request.getInputStream(), "UTF-8"))) {
		                StringBuilder requestBody = new StringBuilder();
		                String line;		
		                while ((line = reader.readLine()) != null) {
		                    requestBody.append(line);
		                }		
		              
		                System.out.println("Request Body: 요청바디에서 값 추출");
		                System.out.println(requestBody.toString());
		            }
		   }  
    }
	
	

	//Post 
	// getParameter() -> 바디를 읽어서 값을 제공함 
	// 요청바디에 담겨서 전달되므로 바디를 직접 읽을 수 있다 
	// form의 기본방식으로 전송되면 getParameter로 데이터를 꺼낼 수 있도록 제공한다 
	// ( application/x-www-form-urlencoded ) 
	
	@PostMapping("/formRead2")
     void test1(HttpServletRequest request ) throws ServletException, IOException {
		
		
		//String id  = request.getParameter("id");
		//String pw =  request.getParameter("pw");		
		
		//System.out.println("Request header: 요청헤더에서 값 추출");
		//System.out.println( id);
		//System.out.println( pw);
		
		
		
		
		
		  int contentLength = request.getContentLength();
		  System.out.println( contentLength);
		  
	        if (contentLength > 0) {   
				
				try (BufferedReader reader = new BufferedReader(new InputStreamReader(request.getInputStream(), "UTF-8"))) {
		                StringBuilder requestBody = new StringBuilder();
		                String line;		
		                while ((line = reader.readLine()) != null) {
		                    requestBody.append(line);
		                }		
		              
		                System.out.println("Request Body: 요청바디에서 값 추출");
		                System.out.println(requestBody.toString());
		            }
		   }  
	} 
	
	
	
    }






	 
 
