package com.acorn.di.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.Setter;

// Program을 주입 받아서  계산기 서비스를 제공하자 !!!
@Controller
public class MyController4 {

	  // 생성자를 통한 주입 , 롬복
    @Setter(onMethod_ = { @Autowired})
	Program p;	 
  
 
	//cal4?su1=10&su2=5
	@GetMapping("/cal4")
	public void add(  Integer su1,  Integer su2) { 
		 p.addNumber(su1, su2);	 
	}
	
}
