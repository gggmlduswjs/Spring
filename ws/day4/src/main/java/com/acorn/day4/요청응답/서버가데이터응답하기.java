package com.acorn.day4.요청응답;


//클라이언트 화면에서 ajax, Fetch로 요청한다
//화면은 그대로 유지한채로 서버와 통신할 때 서버가 데이터를 응답한다



//@ResponseBody를 사용하면 반환값을 응답 본문(body)에 작성한다
// 이 때 JSON변환기가 사용됨 (JSON 라이브러리가 필요함!!)


import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class 서버가데이터응답하기 {

	@GetMapping("/data1")
	public void test1(HttpServletResponse response) throws IOException {
		String message = "data1 서버가 보낸 데이터 message";
		response.setContentType("text/plain;charset=utf-8");
		response.setHeader("Content-Length", String.valueOf(message.getBytes().length));
		response.getWriter().println(message);

	}

	
	@GetMapping("/data2")
	public ResponseEntity<String> test2() {
		String message = " ResponseEntity 서버가 보내는 message !!!!";
		return ResponseEntity.ok().header("Content-Type", "text/plain;charset=utf-8")
				.header("Content-Length", String.valueOf(message.getBytes().length)).body(message);
	}
	
   @GetMapping("/data22")
    public ResponseEntity<String> test22() {
        String message = " ResponseEntity  status  서버가 보내는 message !!!!";
        return ResponseEntity.status(HttpStatus.OK)
                .header("Content-Type", "text/plain;charset=utf-8")
                .header("Content-Length", String.valueOf(message.getBytes().length))
                .body(message);
    }

	
	 //produces 속성을 통해 명시적으로 MIME 타입을 지정할 때 사용함 
	@ResponseBody
	@RequestMapping( value="/data3"  , produces = "text/plain;charset=UTF-8" )
	public String test3() {
		String message = "서버가 보내는 message ^^^^^^";
		return message;
		 
	}
	
	// @ResponseBody를 사용하면 자바객체는  JSON 형식으로 응답 ( 라이브러리 의존성 추가해야함)
	// @ResponseStatus(HttpStatus.OK) 
	 @ResponseBody
	 @GetMapping("/data4")
	  public  User  test4( )  {			 
		 User user = new User();
		 user.setId("gildong");
		 user.setPw("1234");
		 return user;		 
			
	 }
	 
	 
	 //JSON응답하기
	 @GetMapping("/data5")
	  public void test5(HttpServletResponse response ) throws IOException  {			
			response.setContentType("application/json;charset=utf-8"); 
			response.getWriter().println( "{ \"id\" : \"wjy\" , \"pw\":\"0000\"}");
			
	 }
	 
	 
	 /*
	   
	   	
<!--  json  관련 라이브러리 -->
	   <dependency>
		    <groupId>com.fasterxml.jackson.core</groupId>
		    <artifactId>jackson-databind</artifactId>
		    <version>2.15.2</version>
		</dependency>
		
		<!-- https://mvnrepository.com/artifact/org.codehaus.jackson/jackson-mapper-asl -->
		<dependency>
		    <groupId>org.codehaus.jackson</groupId>
		    <artifactId>jackson-mapper-asl</artifactId>
		    <version>1.9.13</version>
		</dependency>	 
	   
	  */

	
	

}


/*
  상태코드 
  
정상 처리 (2xx)
상태 코드	의미	설명
200 OK	요청 성공	기본 응답, GET, PUT, DELETE 등
201 Created	리소스 생성됨	POST 요청으로 새 데이터 생성 시 사용
204 No Content	응답 본문 없음	성공했지만 반환할 데이터 없음 (DELETE 등)

클라이언트 오류 (4xx)
상태 코드	의미	설명
400 Bad Request	잘못된 요청	유효성 검사 실패 등
401 Unauthorized	인증되지 않음	로그인 필요
403 Forbidden	권한 없음	접근 권한 없음
404 Not Found	리소스 없음	잘못된 URL 등
 

 서버 오류 (5xx)
상태 코드	의미	설명
500 Internal Server Error	서버 내부 오류	예상치 못한 에러 
503 Service Unavailable	서비스 이용 불가	서버 점검 또는 과부하 등
 
   
   
 * 
 */
