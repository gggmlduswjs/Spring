package com.acorn.day3.api;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DramaApiController {
	 
	
	//조회	
	@ResponseBody
	@RequestMapping( value="/dramas" , method=RequestMethod.GET)
	public ArrayList<Drama> getList(){		
		ArrayList<Drama> list = new ArrayList<>();
		Drama drama  = new Drama();
		drama.setName("무빙");
		drama.setActor("류승용");			
		list.add(drama);
		
		Drama drama2  = new Drama();
		drama2.setName("글로리");
		drama2.setActor("송혜교");		
		
		list.add(drama2);
		
		return list;
	}
	
	
	
	//둘러보기
	//등록	
	
	// 데이타 읽는다
	// json으로 변환
	// 자바객체로 변환
	//  => @RequstBody   스프링이 해 줌 
	
	
	@ResponseBody
	@RequestMapping( value="/dramas" , method=RequestMethod.POST)
	public void  register(@RequestBody Drama drama) {
		System.out.println( drama); 
		
		//insert
	}
	
	
	
	//변경
	@ResponseBody
	@RequestMapping( value="/dramas" , method=RequestMethod.PUT)
	public void  update(@RequestBody Drama drama) {
		System.out.println( drama); 
		
		//name ->  actor  변경   sql  update
	}
	
	
	
	//삭제
	 
	
	//dramas/d001 
	@ResponseBody
	@RequestMapping( value="/dramas/{name}" , method=RequestMethod.DELETE)
	public void  delete( @PathVariable  String  name) {
		System.out.println( name); 		
		  // sql  delete
	}
	
}
