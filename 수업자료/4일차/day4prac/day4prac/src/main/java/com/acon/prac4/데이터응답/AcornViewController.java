package com.acon.prac4.데이터응답;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AcornViewController {

	
	
	
	//
	@RequestMapping( value="/acornView1"  , method=RequestMethod.GET)	
	public String  getMemberListView() {		
		return "acornLIst";  //view  
	}
	
	
	//
	
	
	
	
	//
	@RequestMapping( value="/acornView2"  , method=RequestMethod.GET)	
	public String  getMemberView() {		
		return "acornView";  //view  
	}
	
	
	
	//화면등록하기 뷰 응답
	@RequestMapping( value="/acornView3"  , method=RequestMethod.GET)	
	public String  getMemberView3() {		
		return "acornView3";  //view  
	}
	
	
	

	//변경하기  뷰 응답
	@RequestMapping( value="/acornView4"  , method=RequestMethod.GET)	
	public String  getMemberView4() {		
		return "acornView4";  //view  
	}
	
	
	

	//삭제하기 뷰 응답
	@RequestMapping( value="/acornView5"  , method=RequestMethod.GET)	
	public String  getMemberView5() {		
		return "acornView5";  //view  
	}
	
	
}
