package com.acorn.di.calculator;

import static org.junit.Assert.*;



import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import lombok.extern.log4j.Log4j;
@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/setting.xml"  } )
public class ProgramTest {

	
	
	@Autowired
	Program p;
	
	
	@Test
	public void test() {
		//fail("Not yet implemented");
		
		p.addNumber(5, 3);
		log.info("~~~~~~~~~~~~~~~~~~~~~");
		assertTrue(true);
	}

}
