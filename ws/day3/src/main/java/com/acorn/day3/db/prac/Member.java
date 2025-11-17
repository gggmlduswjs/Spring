package com.acorn.day3.db.prac;

import lombok.AllArgsConstructor;
import lombok.Data;

/*
 * 
 * 
M_ID       NOT NULL VARCHAR2(5)  
M_PW                VARCHAR2(5)  
M_NAME              VARCHAR2(10) 
M_TEL               VARCHAR2(13) 
 */


@AllArgsConstructor
@Data
public class Member {

	String id;
	String pw;
	String name;
	String tel;
	
}
