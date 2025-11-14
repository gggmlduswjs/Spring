package com.acorn.day2.book;

import java.util.Random;

import org.springframework.stereotype.Component;


//객체생성 지시(애너테이션 방법)
@Component
public class BookService {
	
	public String  getBook(){ 
        String[] books = new String[] {"코스모스", "종의 기원", "사피엔스", "호모데우스"};
        Random r  = new Random();
        int index = r.nextInt( books.length);  //4 (0~3)
        return books[index];                
    }

}
