package com.acorn.di.food;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.Setter;

@Controller
public class FoodController {
	
	
	// @Setter(onMethod_ = { @Autowired})
	// 세터를 직접만들고  @Autowired 하는 것과 동일함 
	
	 
	FoodService service ;
 
	 
	
	//세터
	@Autowired	//Injection 주입
	public void setService(FoodService test) {
		this.service = test;
	}
  
	

	@GetMapping("/foodInfo")
	public String test() {
		
		ArrayList<Food> result = service.getFoodList();
		System.out.println( result);
		
		return  "result";
	}
	

}
