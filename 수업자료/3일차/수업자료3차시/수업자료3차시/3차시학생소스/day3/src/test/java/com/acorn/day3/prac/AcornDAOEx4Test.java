package com.acorn.day3.prac;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.acorn.day3.test.Acorn;
import com.acorn.day3.test.AcornDAOEx4;



 @Transactional 
 @Rollback(false)
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( locations= {"file:src/main/webapp/WEB-INF/spring/test2.xml"," file:src/main/webapp/WEB-INF/spring/test.xml"})

public class AcornDAOEx4Test {

	
	@Autowired
	AcornDAOEx4  dao;
	
	
	 
	 
	public void test() {
		//fail("Not yet implemented");		
		 Acorn acorn  = dao.selectOne("LeeHjin");
		
		
		//assertTrue( acorn != null);		
	     assertEquals("이효진",  acorn.getName()); 
		
	}
	
	 @Test
	public  void test2() {
		int row  =dao.insert( new Acorn("acorn50" ,"1234" , "김길동") );		
		assertTrue( row !=0);
		
		
		
	}
	
	//@Test
	public void test3() {
		
		// hashMap  , 키, 값의 쌍으로 데이터를 저장함 		
		Map<String, String> info = new HashMap<>();
		info.put("id", "LeeHjin");
		info.put("pw", "9999"); 
		dao.update(info );
		
	}
	
	
	 
	public void test4() {		
		int cnt  =dao.delete("acorn50");
		assertTrue( cnt !=0);	
		
	}
	
	
	
	

}
