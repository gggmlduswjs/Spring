package com.acorn.day4.comment;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


//모든 매서드의 요청이  @ResponseBody  
//반환된 데이터를  응답의 본문에 담긴다.
//JSON형태 반환 ( 라이브러리 필요함) 

@RestController
public class CommentAPIController {
	

	
	//등록
	//@ResponseBody
	
	@RequestMapping( value="/comments" , method=RequestMethod.POST  )
	public Comment register( @RequestBody  Comment comment) {
		//@RequestBody  - >  json문자열 -> json객체  -> 자바객체 ( 기본생성자, setter)
		
		System.out.println( comment.getTitle());
		System.out.println( comment.getContent() ); 
		
		//서비스의 등록해라는 매서드 호출해야함  
		System.out.println( "서비스를 통해서 데이터베이스에 등록한다");
		
		return comment;
	}
	
	
	 
	
	
	//변경
	//  /comments/c01
	
	@RequestMapping("/comments/{id}")
	public int modify( @PathVariable  String  id,  @RequestBody  Comment  comment) {
				
		System.out.println( id);
		System.out.println( comment.getTitle());
		System.out.println( comment.getContent());
		
		System.out.println( "서비스를 통해서 변경한다");
		return  1;
	}
	
	
	//삭제
	@RequestMapping(value="/comments/{id}" , method= RequestMethod.DELETE)
	public int delete( @PathVariable String id) {
		
		System.out.println( id);
		System.out.println("서비스를 사용해서 삭제한다");		
		return 1;		
	}
	
	
	//전체조회	
	
	@RequestMapping(value="/comments"  , method= RequestMethod.GET)
	public List<Comment> select(){ 
		
		List<Comment> list  = new ArrayList<>();
		list.add(new Comment("c01", "제목1" , "향이 좋아요"));
		list.add(new Comment("c02", "제목2" , "사은품 주세요")); 
		return list;
	}
	
	/*
	@RequestMapping(value="/comments/{id}"  , method= RequestMethod.GET)
	public Comment  selectOne( @PathVariable String id){ 
		
		
		System.out.println(  id );
		System.out.println( "id에 대한 리뷰 조회합니다");
	    Comment c =  new Comment("c01", "제목1" , "ddddd") ;		 
		return c;
	}
	*/
	
	@RequestMapping(value="comments/{id}"  , method = RequestMethod.GET)
	public Comment selectOne( @PathVariable  String id) {	
		
		return new Comment("test01","tett제목" , "test내용");
		
	}
	
	
	
}
