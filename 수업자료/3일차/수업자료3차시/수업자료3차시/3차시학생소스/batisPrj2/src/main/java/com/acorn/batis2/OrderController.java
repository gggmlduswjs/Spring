package com.acorn.batis2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class OrderController {

	
	@Autowired
	OrderService service; 
	
	
	//매핑시 속성명과 컬럼명이 다르면 매핑이 되지 않음
	
	@GetMapping("/orderList")	
	public String  getOrderList(  Model model) throws Exception {			
		System.out.println(  "list="+  service.getOrderList());	
		model.addAttribute("list", service.getOrderList());
		return "orderView";
	}
	
	
	// resultmap 사용하기
	// 매핑시 속성명과 컬럼명이 다르면 매핑이 되지 않음

	@GetMapping("/orderList2")	
	public String  getOrderList2(  Model model) throws Exception {
		System.out.println( "list2="+  service.getOrderList());	
		model.addAttribute("list", service.getOrderList2());
		return "orderView2";
	}
	

	//map 사용하기
	@GetMapping("/orderList3")	
	public String  getOrderList3(  Model model) throws Exception {	
		System.out.println( "list3="+service.getOrderList3());
		model.addAttribute("list", service.getOrderList3());
		return "orderView3";
	}
	
	
}
