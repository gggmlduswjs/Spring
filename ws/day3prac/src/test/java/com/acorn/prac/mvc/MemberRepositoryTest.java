package com.acorn.prac.mvc;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.acorn.prac.db.Member;
import com.acorn.prac.db.MemberRepository;


//MemberRepository test
//주입
//selectAll매서드
//실행의 결과 1개 이상 

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/test.xml" ,
		"file:src/main/webapp/WEB-INF/spring/**/test2.xml"} )



public class MemberRepositoryTest {
	
	@Autowired
	MemberRepository repository;

	@Test
	public void test() {
//		fail("Not yet implemented");
		ArrayList<Member> list = repository.selectAll();
		int size=list.size(); //test 검증
		
		assertTrue(size>=1);
	}

}
