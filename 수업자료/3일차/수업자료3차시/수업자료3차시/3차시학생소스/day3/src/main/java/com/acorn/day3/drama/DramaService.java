package com.acorn.day3.drama;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DramaService {

	@Autowired
	DramaRepository dao;
	
	
	public ArrayList<Drama> getDramasInfo(){
		ArrayList<Drama> dList = dao.selectAll();	 
		return dList;
	}
}
