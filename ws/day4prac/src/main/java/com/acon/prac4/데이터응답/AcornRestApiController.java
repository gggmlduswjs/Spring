package com.acon.prac4.데이터응답;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

//에이콘정보 -등록, 조회하기, 전체조회, 변경, 삭제  ( 화면전환없이 데이터 처리하기)


//url매핑의 이름은 명사(복수형의 명사)
// aconrs (매핑이름)
//행위 : HttpMethod 로 구분(   조회, 등록, 변경, 삭제   )
//조회--GET
//등록--POST
//변경--Put
//삭제--Delete

//데이터응답하기
@Controller
public class AcornRestApiController {
	
	
	// 전체조회
	
	@ResponseBody
	@RequestMapping( value="/acorns"  , method=RequestMethod.GET)	
	public List<Acorn>  getMemberListAll(){		
		//서비스 , repository를 통해서 에이콘학생명단 가져오기 
		
		List<Acorn> list  = new  ArrayList<>();
		Acorn acorn = new Acorn("홍길동", "서울시 마포구");
		list.add(acorn);
		list.add( new Acorn("우주연" ,"서울시 노원구 공릉")); 
		list.add( new Acorn("손민영" ,"일산시"));		
		return list;
		
	}
	
	
	
	// 한 개조회 (id조회)  , id정보  (pathVaribale사용)
	//  /acorns/t01
	@ResponseBody
	@RequestMapping( value="/acorns/{id}"  ,  method=RequestMethod.GET )
	public Acorn getMember( @PathVariable  String id) { 
		// 
		System.out.println( "id="+ id);
		// service, repository  id  search !!!
		Acorn acorn = new Acorn("홍길동", "서울시 마포구");
		return acorn;
	}
	
	 
	
	
	// 등록하기
	
	//새로운에이콘 학생정보를 등록하기
	
	@ResponseBody
	@RequestMapping( value="/acorns"  ,  method=RequestMethod.POST )     //  {}   json string{ "name": "조용필" ,"addr":"서울시 마포구"}
	public Acorn  register(  @RequestBody Acorn  acorn  ) {   // Acorn type의 객체를 받겠다 
	
		System.out.println(  acorn);
		//acorn   서비스와repository를 통해서 db에 저장하기
		Acorn result = new Acorn("조용필", "서울시 마포구");  //저장된  acorn객체 반환하기 
		return result;
	}
	 
	
	
	
	// 변경하기
	// 0  ,  1 반환
	// 변경이 데이터 반환  (선택 했음)
		
	@ResponseBody    // 자바객체를 json으로 변환해서 응답하기     //{"name":"우주연","addr":"서울시 강남구 "}

	@RequestMapping(value="/acorns/{id}" , method = RequestMethod.PUT)
	public  Acorn  modify( @PathVariable String id,   @RequestBody Acorn newAcorn) {
		// 키 id :에 해당 고객의 정보를  newAcorn 변경하기 
		System.out.println( id);
		System.out.println( newAcorn);
		
		//서비스, repository를 이용해서 id의 고객을 정보를  newAcorn으로 변경하기 
		//   update   acorntbl   set   addr  =  ?  , name= ?  where id = ?            
		return newAcorn;
		
	}
	 
	
	
	// 삭제하기하고 데이터응답 (1 , 0응답하기) 
	// String id  ( pathVariable 사용)
	
	@ResponseBody
	@RequestMapping( value="/acorns/{id}" ,  method=RequestMethod.DELETE)
	public int  delete (  @PathVariable String id) { 
		System.out.println( "id="+  id);		
		System.out.println("서비스와 리포지토리를 이용해서 데이터베이스에서 삭제한다");
		return  1;
	}
	

}
