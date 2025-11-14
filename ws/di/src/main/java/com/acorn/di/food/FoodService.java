package com.acorn.di.food;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Setter;

@Component
public class FoodService {

	@Setter( onMethod_ = @Autowired)
	FoodDAO dao;
	
	public ArrayList<Food> getFoodList() {
		return dao.findAll();
	}
}
