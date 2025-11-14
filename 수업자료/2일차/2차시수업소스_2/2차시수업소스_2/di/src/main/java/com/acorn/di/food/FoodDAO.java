package com.acorn.di.food;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class FoodDAO {
	
	
	
	public  ArrayList<Food> findAll(){ 
		
		ArrayList<Food> list  = new ArrayList<>();
		list.add( new Food("f01" , "라면"));
		return list;
		
		
		
	}

}
