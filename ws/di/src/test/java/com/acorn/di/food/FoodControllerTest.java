package com.acorn.di.food;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;



@Log4j
@ExtendWith(SpringExtension.class)  // JUnit5용 스프링 확장
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml" } )
class FoodControllerTest {

	
	@Autowired
	FoodDAO dao;
	
	@Test
	void test() {
		   ArrayList<Food>  list= dao.findAll();
		   System.out.println( list);
		  
		    assertTrue(true);
		
		 // log.info( menu);
	}

}
